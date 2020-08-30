package br.com.eventos.kafkadocker;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class KafkaApplication {

    public static void main(String[] args) {

        //Criando as propriedades para conexão do kafka
        Properties props = new Properties();
        props.put(ProducerConfig.BOOTSTRAP_SERVERS_CONFIG, "localhost:9092");
        props.put(ProducerConfig.KEY_SERIALIZER_CLASS_CONFIG, org.apache.kafka.common.serialization.StringSerializer.class);
        props.put(ProducerConfig.VALUE_SERIALIZER_CLASS_CONFIG, org.apache.kafka.common.serialization.StringSerializer.class);

        KafkaProducer<String, String> producer = new KafkaProducer(props);

        //Tópico e a mensagem
        ProducerRecord<String, String> record = new ProducerRecord<>("topic1", "Ola mundo");

        producer.send(record);

        producer.close();

        SpringApplication.run(KafkaApplication.class, args);
    }

}
