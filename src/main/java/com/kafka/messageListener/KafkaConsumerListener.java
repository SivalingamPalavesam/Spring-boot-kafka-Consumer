package com.kafka.messageListener;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class KafkaConsumerListener 
{
	@KafkaListener(topics = "SampleTopic",
				   groupId = "Consumer-group")
	public void consume(String  message)
	{
		System.out.println("Message Consumed  :"+message);
	}
}
