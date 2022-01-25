package com.example.learning.controller;

import com.example.learning.usecases.kafka.PushMessage;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class KafkaController {

    private final PushMessage pushMessage;

    public KafkaController(PushMessage pushMessage) {
        this.pushMessage = pushMessage;
    }

    @PostMapping("/push")
    public void pushMsg(@RequestParam String msg) {
        pushMessage.sendMessage(msg);
    }
}
