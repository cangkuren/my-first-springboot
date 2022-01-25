package com.example.learning.usecases.kafka;

import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Component;

@Component
public class PushMessage {

//    @Value("${topic.name.producer}")
//    private String topicName;

    private final KafkaTemplate<String, String> kafkaTemplate;

    public PushMessage(KafkaTemplate<String, String> kafkaTemplate) {
        this.kafkaTemplate = kafkaTemplate;
    }

    public void sendMessage(String msg) {
        kafkaTemplate.send("topic1", msg);
    }
}
