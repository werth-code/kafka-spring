package com.matthewwerth.kafkaspring.producer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;

public class Producer {
    private static final String TOPIC = "test_topic";

    @Autowired          //
    private KafkaTemplate<String, String> template;

    public void sendMessage(String message) {
        this.template.send(TOPIC, message);
    }
}
