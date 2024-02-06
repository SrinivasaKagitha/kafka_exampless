package com.example.kafkademo.controller;

import com.example.kafkademo.service.Producers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/rest/API")
public class KafkaController {

    @Autowired
    Producers producer;

    @GetMapping("/producerMessages")
    public void sendMsgToTopic(@RequestParam("message") String message){

        producer.sendMessageToTopic(message);
    }
}
