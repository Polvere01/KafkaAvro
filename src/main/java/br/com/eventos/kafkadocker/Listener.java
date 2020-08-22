package br.com.eventos.kafkadocker;

import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class Listener {

    @KafkaListener(topics = "topic1", groupId = "group_id")
    public void consume(ConsumerRecord<String, String> record) {
        System.out.println(record.value());
    }
}
