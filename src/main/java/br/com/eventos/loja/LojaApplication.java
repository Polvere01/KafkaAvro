package br.com.eventos.loja;

import org.apache.avro.Schema;
import org.apache.avro.generic.GenericData;
import org.apache.avro.generic.GenericRecord;
import org.apache.kafka.clients.consumer.*;
import org.apache.kafka.clients.producer.KafkaProducer;
import org.apache.kafka.clients.producer.ProducerConfig;
import org.apache.kafka.clients.producer.ProducerRecord;
import org.apache.kafka.common.errors.SerializationException;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Arrays;
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
		User user = User.newBuilder().setNome("heitor").setCorFavorita("branco").setNumeroFavorito(9).build();
		Schema.Parser parser = new Schema.Parser();
		Schema schema = parser.parse(user.getSchema().toString());
		GenericRecord avroRecord = new GenericData.Record(schema);
		avroRecord.put("nome", "heitor");

		ProducerRecord<Object, Object> record = new ProducerRecord<>("topic3", key, avroRecord);
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


//		Properties propss = new Properties();
//
//		propss.put(ConsumerConfig.BOOTSTRAP_SERVERS_CONFIG, "localhost:9092");
//		propss.put(ConsumerConfig.GROUP_ID_CONFIG, "group1");
//
//
//		propss.put(ConsumerConfig.KEY_DESERIALIZER_CLASS_CONFIG, "org.apache.kafka.common.serialization.StringDeserializer");
//		propss.put(ConsumerConfig.VALUE_DESERIALIZER_CLASS_CONFIG, "io.confluent.kafka.serializers.KafkaAvroDeserializer");
//		propss.put("schema.registry.url", "http://localhost:8081");
//
//		propss.put(ConsumerConfig.AUTO_OFFSET_RESET_CONFIG, "earliest");
//
//		String topic = "topic2";
//		final Consumer<String, GenericRecord> consumer = new KafkaConsumer<String, GenericRecord>(propss);
//		consumer.subscribe(Arrays.asList(topic));
//
//		try {
//
//				ConsumerRecords<String, GenericRecord> records = consumer.poll(100);
//				for (ConsumerRecord<String, GenericRecord> record : records) {
//					System.out.printf("offset = %d, key = %s, value = %s \n", record.offset(), record.key(), record.value());
//				}
//		} finally {
//			consumer.close();
//		}

		SpringApplication.run(LojaApplication.class, args);
	}

}
