package com.ros.control.entity;

import jakarta.persistence.*;
import lombok.Getter;

import java.util.UUID;
@Entity
@Table(name="ros_network")
public class RosNetworkEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    @Getter
    private UUID id;
    @Getter
    private String host;
    @Getter
    private String username;
    @Getter
    private int password;
    @Getter
    private int port;

    public RosNetworkEntity() {
        super();
    }

    public RosNetworkEntity(String password) {
        super();
        this.username = "help";
        this.password = password.hashCode();
        port = 22;
        host = null;
    }

    public RosNetworkEntity(String password, int port) {
        super();
        this.username = "help";
        this.password = password.hashCode();
        this.port = port;
        host = null;
    }

    public RosNetworkEntity(String password, int port, String username) {
        super();
        this.username = username;
        this.password = password.hashCode();
        this.port = port;
        host = null;
    }
        
    public RosNetworkEntity(String password, int port, String username, String host) {
        super();
        this.username = username;
        this.password = password.hashCode();
        this.port = port;
        this.host = host;
    }

    @Override
    public String toString() {
        return String.format("Host:" + host + " Port:" + port + " Username:" + username + " Password:" + password);
    }
}
