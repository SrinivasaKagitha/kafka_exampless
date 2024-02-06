package com.example.kafkademo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class Producers {

    @Autowired
    KafkaTemplate<String, String> kafkaTemplate;

    public void sendMessageToTopic(String message){
        kafkaTemplate.send("kafkaMessage_Topic", message);
    }
}
