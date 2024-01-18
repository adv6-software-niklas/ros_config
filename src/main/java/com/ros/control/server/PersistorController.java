package com.ros.control.server;

import java.nio.BufferOverflowException;

import org.hibernate.annotations.DialectOverride.OverridesAnnotation;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.ros.control.entity.RosNetworkEntity;

// import com.ros.control.server.PersistRequest;
// import com.ros.control.server.PersistReply;
// import com.ros.control.server.PersistorGrpc;

import net.devh.boot.grpc.server.service.GrpcService;
import com.ros.control.service.*;

@GrpcService
// @CrossOrigin(origins = "http://172.169.0.1:3000")
public class PersistorController extends PersistorGrpc.PersistorImplBase {
    private final RepositoryService myServiceBaby;

    public PersistorController(RepositoryService service) {
        super();
        myServiceBaby = service;
    }
    
    @Override
    public void saveConfig(PersistRequest req, io.grpc.stub.StreamObserver<PersistReply> responseObserver) {
        // String message = req.getMessage();
        System.out.println(req.getPort() + " " + req.getHostname() + " "+ req.getPassword() + " " + req.getUsername());
        myServiceBaby.saveData(new RosNetworkEntity(req.getPassword(), req.getPort(), req.getUsername(), req.getHostname()));
        PersistReply resp = PersistReply.newBuilder()
        .setMessage("Received: " + req.toString() + ".  -- plus Hello from server")
        .build();

        // responseObserver.onError(Status.CANCELLED.withDescription("I canceled the operation man").asRuntimeException());
        responseObserver.onNext(resp);
        responseObserver.onCompleted();
    }
}