package com.example.spring.producer.config;

import org.springframework.amqp.core.TopicExchange;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ProducerRabbitTopicConfiguration {

	@Value("${spring.rabbitmq.request.exchange.name}")
	private String exchangeName;
	 
       
    @Bean
    TopicExchange topicExchange() {
        return new TopicExchange(exchangeName);        
    }
   
}
