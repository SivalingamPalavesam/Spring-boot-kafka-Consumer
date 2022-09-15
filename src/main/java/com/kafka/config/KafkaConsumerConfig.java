package com.kafka.config;

import java.util.HashMap;
import java.util.Map;

import org.apache.kafka.clients.consumer.ConsumerConfig;
import org.apache.kafka.common.serialization.StringDeserializer;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.annotation.EnableKafka;
import org.springframework.kafka.core.ConsumerFactory;
import org.springframework.kafka.core.DefaultKafkaConsumerFactory;
@Configuration
@EnableKafka
public class KafkaConsumerConfig 
{
	@Value("${kafka.broker.address}")
	private String KafkaBrokerAddress;
	@Bean
	public ConsumerFactory<String, String> consumerFactory()
	{
		Map<String, Object> configmap = new HashMap<>();
		configmap.put(ConsumerConfig.BOOTSTRAP_SERVERS_CONFIG, KafkaBrokerAddress);
		configmap.put(ConsumerConfig.GROUP_ID_CONFIG, "Consumer-group");
		configmap.put(ConsumerConfig.KEY_DESERIALIZER_CLASS_CONFIG, StringDeserializer.class);
		configmap.put(ConsumerConfig.VALUE_DESERIALIZER_CLASS_CONFIG, StringDeserializer.class);
		return new DefaultKafkaConsumerFactory<>(configmap);
	}
}
