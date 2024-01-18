package com.ros.control.DTO;

import java.util.UUID;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;

import lombok.Getter;
import lombok.Setter;

@JsonSerialize
public class RosConfigDTO {
    @Getter
    @Setter
    private UUID id;
    @Getter
    @Setter
    private String host;
    @Getter
    @Setter
    private String username;
    @Getter
    @Setter
    private int passwordHash;
    @Getter
    @Setter
    private int port;
    @Getter
    @Setter
    private String password;

    public RosConfigDTO(UUID id, String host, String username, int password, int port) {
        this. id = id;
        this.host = host;
        this.username = username;
        this.passwordHash = password;
        this.port = port;
    }
    public RosConfigDTO(UUID id, String host, String username, String password, int port) {
        this. id = id;
        this.host = host;
        this.username = username;
        this.password = password;
        this.port = port;
    }
}
