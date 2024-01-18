package com.ros.control.config.rabbitQueue;

import org.springframework.amqp.core.Binding;
import org.springframework.amqp.core.BindingBuilder;
import org.springframework.amqp.core.Queue;
import org.springframework.amqp.core.TopicExchange;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;

import lombok.Getter;

@ConfigurationProperties("ros")
public record RosConfig(String username, String password, String host, int port) {
    
    @Getter
    static final String topicExchangeName = "amq.topic";
    @Getter
    static final String queueName = "config_response";
   
   //  @Bean
   //  Queue config_response() {
   //     return new Queue(queueName, false);
   //  }

   //  @Bean
   //  TopicExchange exchange() {
   //     return new TopicExchange(topicExchangeName);
   //  }

   //  @Bean
   //  Binding binding(Queue queue, TopicExchange exchange) {
   //     return BindingBuilder.bind(queue).to(exchange).with("foo.bar.baz");
   //  }
}