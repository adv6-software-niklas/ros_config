package com.ros.control.service;

import org.springframework.stereotype.Service;

import com.ros.control.repository.MyRepository;

import org.springframework.amqp.rabbit.annotation.RabbitListener;

@Service
public class MessageListenerService {

    private final RepositoryService repo;

    public MessageListenerService(RepositoryService repo) {
        this.repo = repo;
    }
    
    @RabbitListener(queues = "config_request")
    public void receiveMessage(String message) {
        System.out.println("Received <" + message + ">");
        repo.getConfig(message);
    }
}
