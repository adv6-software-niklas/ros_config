package com.ros.control.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ros.control.DTO.RosConfigDTO;
import com.ros.control.entity.RosNetworkEntity;
import com.ros.control.repository.MyRepository;

import com.fasterxml.jackson.databind.ObjectMapper;;;

@Service
public class RepositoryService {
    
    private final MyRepository myRepository;
    private final RabbitSenderService rabbitSender;
    private final ObjectMapper mapper;

    @Autowired
    public RepositoryService(MyRepository myRepository, RabbitSenderService rabbitSender, ObjectMapper mapper){
        this.myRepository = myRepository;
        this.rabbitSender = rabbitSender;
        this.mapper = mapper;
    }

    public void saveData(RosNetworkEntity entity) {
        myRepository.save(entity);
    }

    public RosNetworkEntity getConfig(String password) {
        RosNetworkEntity foundConfig = new RosNetworkEntity();
        try {
            foundConfig = myRepository.LilBitchPussy(password.hashCode());
            RosConfigDTO configDto = new RosConfigDTO(foundConfig.getId(), foundConfig.getHost(), foundConfig.getUsername(), password, foundConfig.getPort());
            String json = mapper.writeValueAsString(configDto);
            rabbitSender.sendMessage(json);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return foundConfig;
        // RosNetworkEntity foundConfig = myRepository.LilBitchPussy(password.hashCode());
        // RosConfigDTO configDto = new RosConfigDTO(foundConfig.getId(), foundConfig.getHost(), foundConfig.getUsername(), foundConfig.getPassword(), foundConfig.getPort());
        // String json = mapper.writeValueAsString(configDto);
        // rabbitSender.sendMessage(foundConfig);
        // return foundConfig;
    }
}
