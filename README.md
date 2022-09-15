# Spring-boot-kafka-Consumer
Created the spring boot application step by step to consume a message from topic in  Kafka

Steps for the demo:
1) Create Spring Boot App with spring Kafka starter 
2)  KafkaConsumerConfig - Spring bean configuration - @EnableKafka
3) KafkaListener to consume the message
4) Start Zookeeper, Kafka, producer app to test the consumer app


1. Start Zookeeper
bin/zookeeper-server-start.sh config/zookeeper.properties
2. Start Kafka:
bin/kafka-server-start.sh config/server.properties
3. Create topic:bin/kafka-topics.sh --create --topic SampleTopic --bootstrap-server localhost:9092

