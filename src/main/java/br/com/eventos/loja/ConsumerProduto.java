package br.com.eventos.loja;

import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class ConsumerProduto {

    @KafkaListener(topics = "topic3", groupId = "group_id")
    public void consume(ConsumerRecord<String, User> record) {
        System.out.println("ok");
    }
}
