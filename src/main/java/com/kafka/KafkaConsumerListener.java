package com.kafka;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class KafkaConsumerListener {

	@KafkaListener(topics = "test", groupId = "group_id", containerFactory = "kafkaListenerContainerFactory")
	public void consume(String message) {
		System.out.println("message:" + message);
	}

	@KafkaListener(topics = "testjson", groupId = "group_json_id", containerFactory = "kafkaJsonListenerContainerFactory")
	public void consumeJson(User user) {
		System.out.println("message User:" + user);
	}

}
