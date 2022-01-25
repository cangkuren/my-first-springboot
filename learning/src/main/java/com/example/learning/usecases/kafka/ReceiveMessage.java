package com.example.learning.usecases.kafka;

import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class ReceiveMessage {
    @KafkaListener(topics = {"topic1"})
    public void receiveMessage(ConsumerRecord<?, ?> record) {
        System.out.println("简单消费：" + record.topic() + "-" + record.partition() + "-" + record.value());
    }
}
