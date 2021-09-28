package com.example.kafka.kafka;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.List;
@Service
public class KafkaConsumer {
    public static List<String> messages = new ArrayList<>();
    private final static String topic = "prob";
    private final static String groupId = "com.example";
    @KafkaListener(topics = topic, groupId = groupId)
    public void listen(String message) {
        messages.add(message);
    }
}
