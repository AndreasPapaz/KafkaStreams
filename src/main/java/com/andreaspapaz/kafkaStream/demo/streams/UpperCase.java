package com.andreaspapaz.kafkaStream.demo.streams;

import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.cloud.stream.messaging.Processor;
//import org.springframework.cloud.stream.binder.kafka.streams.annotations.KafkaStreamsProcessor

@EnableBinding(Processor.class)
public class UpperCase {

    @StreamListener(Processor.INPUT)
    @SendTo(Processor.OUTPUT)
    public String sendMessage(String str) {
        return str.toUpperCase();
    }
}
