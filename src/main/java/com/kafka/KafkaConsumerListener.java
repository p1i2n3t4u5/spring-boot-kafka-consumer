package com.kafka;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class KafkaConsumerListener {
	private static final Logger logger = LoggerFactory.getLogger(KafkaConsumerListener.class);

	@KafkaListener(topics = "test", groupId = "group_id", containerFactory = "kafkaListenerContainerFactory")
	public void consume(String message) {
		logger.info("message:"+message);
	}

	@KafkaListener(topics = "testjson", groupId = "group_json_id", containerFactory = "kafkaJsonListenerContainerFactory")
	public void consumeJson(User user) {
		logger.info("message User :"+user);
	}

}
