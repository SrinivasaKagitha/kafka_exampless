package com.example.kafkademo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class Consumers {


    @KafkaListener(topics = "kafkaMessage_Topic", groupId = "kafkaMessage_group")
    public void receivedMessagesFromTopic(String receivedMessages){
        System.out.println("received messages from kafka :"+receivedMessages);

    }
}
