package com.ros.control.server;

import net.devh.boot.grpc.server.service.GrpcService;

import com.google.protobuf.StringValue;
import com.ros.control.entity.RosNetworkEntity;
import com.ros.control.server.GetterGrpc;
import com.ros.control.service.RepositoryService;

@GrpcService
public class GetterController extends GetterGrpc.GetterImplBase {
    private final RepositoryService myServiceBaby;

    public GetterController(RepositoryService service) {
        super();
        myServiceBaby = service;
    }

    @Override
    public void getConfig(ConfigRequest req, io.grpc.stub.StreamObserver<ConfigReply> responseObserver) {
        RosNetworkEntity entity = myServiceBaby.getConfig(req.getMessage());

        StringValue foundID = StringValue.of(entity.getId().toString());
        ConfigReply resp = ConfigReply.newBuilder()
        .setId(foundID)
        .setHostname(entity.getHost())
        .setPassword(String.valueOf(entity.getPassword()))
        .setUsername(entity.getUsername())
        .setPort(entity.getPort())
        .build();

        responseObserver.onNext(resp);
        responseObserver.onCompleted();
    }
}
