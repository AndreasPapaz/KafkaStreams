package com.andreaspapaz.kafkaStream.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.annotation.processing.Processor;

@SpringBootApplication
public class KafkaStreamsApp {
	public static void main(String[] args) {
		SpringApplication.run(KafkaStreamsApp.class, args);
	}

}
