package com.ros.control.service;

import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.stereotype.Service;

import com.ros.control.config.rabbitQueue.RosConfig;

@Service
public class RabbitSenderService {
    private final RabbitTemplate rabbitTemplate;

    public RabbitSenderService(RabbitTemplate rabbitTemplate) {
        this.rabbitTemplate = rabbitTemplate;
    }

    public void sendMessage(String rosConfig){
        System.out.println("Sending message...");
        rabbitTemplate.convertAndSend(RosConfig.getTopicExchangeName(), "ros.config.response", rosConfig);
    }
}
