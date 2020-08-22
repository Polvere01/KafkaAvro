package br.com.eventos.kafkadocker;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class KafkaApplication {

    public static void main(String[] args) {

        //Properties props = new Properties();
        //props.put(ProducerConfig.BOOTSTRAP_SERVERS_CONFIG, "localhost:9092");
        //props.put(ProducerConfig.KEY_SERIALIZER_CLASS_CONFIG, org.apache.kafka.common.serialization.StringSerializer.class);
        //props.put(ProducerConfig.VALUE_SERIALIZER_CLASS_CONFIG, org.apache.kafka.common.serialization.StringSerializer.class);
        //props.put("schema.registry.url", "http://localhost:8081");

        //KafkaProducer<String, String> producer = new KafkaProducer(props);

       // ProducerRecord<String, String> record = new ProducerRecord<>("topic1", "Ola Heitor");

        //producer.send(record);

        //producer.close();

        SpringApplication.run(KafkaApplication.class, args);
    }

}
