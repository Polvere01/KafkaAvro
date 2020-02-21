package br.com.eventos.loja;

import org.apache.avro.Schema;
import org.apache.avro.generic.GenericData;
import org.apache.avro.generic.GenericRecord;
import org.apache.kafka.clients.producer.KafkaProducer;
import org.apache.kafka.clients.producer.ProducerConfig;
import org.apache.kafka.clients.producer.ProducerRecord;
import org.apache.kafka.common.errors.SerializationException;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Properties;

@SpringBootApplication
public class LojaApplication {

	public static void main(String[] args) {

		Properties props = new Properties();
		props.put(ProducerConfig.BOOTSTRAP_SERVERS_CONFIG, "localhost:9092");
		props.put(ProducerConfig.KEY_SERIALIZER_CLASS_CONFIG,
				io.confluent.kafka.serializers.KafkaAvroSerializer.class);
		props.put(ProducerConfig.VALUE_SERIALIZER_CLASS_CONFIG,
				io.confluent.kafka.serializers.KafkaAvroSerializer.class);
		props.put("schema.registry.url", "http://localhost:8081");
		KafkaProducer producer = new KafkaProducer(props);

		String key = "key1";
		String userSchema = "{\"type\":\"record\"," +
				"\"name\":\"myrecord\"," +
				"\"fields\":[{\"name\":\"f1\",\"type\":\"string\"}]}";
		Schema.Parser parser = new Schema.Parser();
		Schema schema = parser.parse(userSchema);
		GenericRecord avroRecord = new GenericData.Record(schema);
		avroRecord.put("f1", "value1");

		ProducerRecord<Object, Object> record = new ProducerRecord<>("topic2", key, avroRecord);
		try {
			producer.send(record);
		} catch(SerializationException e) {
			// may need to do something with it
		}
// When you're finished producing records, you can flush the producer to ensure it has all been written to Kafka and
// then close the producer to free its resources.
		finally {
			producer.flush();
			producer.close();
		}

		SpringApplication.run(LojaApplication.class, args);
	}

}
