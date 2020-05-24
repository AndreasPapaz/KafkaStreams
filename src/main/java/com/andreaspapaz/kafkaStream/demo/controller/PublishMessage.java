package com.andreaspapaz.kafkaStream.demo.controller;

import com.andreaspapaz.kafkaStream.demo.producers.Producer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PublishMessage {
    private Producer producer;

    @Autowired
    public PublishMessage(Producer producer) {
        this.producer = producer;
    }

    @PostMapping("/test")
    public void testStream(@RequestBody String testString) {
        producer.sendMessage(testString);
    }

}
