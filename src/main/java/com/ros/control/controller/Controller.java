package com.ros.control.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ros.control.entity.RosNetworkEntity;
import com.ros.control.service.RepositoryService;

@RestController
@RequestMapping("config")
public class Controller {
    
    private final RepositoryService myServiceBaby;

    public Controller(RepositoryService myServiceBaby) {
        this.myServiceBaby = myServiceBaby;
    }

    @GetMapping("/test1")
    public String get() {
        // myServiceBaby.saveData(new RosNetworkEntity("test", 22, "G3ngster", "192.168.0.10"));
        return "test";
    }

    @GetMapping("/test2/{password}")
    public String get2(@PathVariable String password) {
        RosNetworkEntity myProprietaryEntity = myServiceBaby.getConfig(password);
        if (myProprietaryEntity == null) {
            return "Did not find the user";
        }
        else if (myProprietaryEntity.getPassword() == password.hashCode()) {
            return myProprietaryEntity.toString(); 
        }
        else {
            return "Found something, but not your user lol";
        }
    }    
}
