package com.ros.control.server;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.60.1)",
    comments = "Source: src/main/java/com/ros/control/proto/getter.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class GetterGrpc {

  private GetterGrpc() {}

  public static final java.lang.String SERVICE_NAME = "com.ros.control.server.Getter";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.ros.control.server.ConfigRequest,
      com.ros.control.server.ConfigReply> getGetConfigMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "getConfig",
      requestType = com.ros.control.server.ConfigRequest.class,
      responseType = com.ros.control.server.ConfigReply.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.ros.control.server.ConfigRequest,
      com.ros.control.server.ConfigReply> getGetConfigMethod() {
    io.grpc.MethodDescriptor<com.ros.control.server.ConfigRequest, com.ros.control.server.ConfigReply> getGetConfigMethod;
    if ((getGetConfigMethod = GetterGrpc.getGetConfigMethod) == null) {
      synchronized (GetterGrpc.class) {
        if ((getGetConfigMethod = GetterGrpc.getGetConfigMethod) == null) {
          GetterGrpc.getGetConfigMethod = getGetConfigMethod =
              io.grpc.MethodDescriptor.<com.ros.control.server.ConfigRequest, com.ros.control.server.ConfigReply>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "getConfig"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.ros.control.server.ConfigRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.ros.control.server.ConfigReply.getDefaultInstance()))
              .setSchemaDescriptor(new GetterMethodDescriptorSupplier("getConfig"))
              .build();
        }
      }
    }
    return getGetConfigMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static GetterStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<GetterStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<GetterStub>() {
        @java.lang.Override
        public GetterStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new GetterStub(channel, callOptions);
        }
      };
    return GetterStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static GetterBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<GetterBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<GetterBlockingStub>() {
        @java.lang.Override
        public GetterBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new GetterBlockingStub(channel, callOptions);
        }
      };
    return GetterBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static GetterFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<GetterFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<GetterFutureStub>() {
        @java.lang.Override
        public GetterFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new GetterFutureStub(channel, callOptions);
        }
      };
    return GetterFutureStub.newStub(factory, channel);
  }

  /**
   */
  public interface AsyncService {

    /**
     */
    default void getConfig(com.ros.control.server.ConfigRequest request,
        io.grpc.stub.StreamObserver<com.ros.control.server.ConfigReply> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetConfigMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service Getter.
   */
  public static abstract class GetterImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return GetterGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service Getter.
   */
  public static final class GetterStub
      extends io.grpc.stub.AbstractAsyncStub<GetterStub> {
    private GetterStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected GetterStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new GetterStub(channel, callOptions);
    }

    /**
     */
    public void getConfig(com.ros.control.server.ConfigRequest request,
        io.grpc.stub.StreamObserver<com.ros.control.server.ConfigReply> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetConfigMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service Getter.
   */
  public static final class GetterBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<GetterBlockingStub> {
    private GetterBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected GetterBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new GetterBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.ros.control.server.ConfigReply getConfig(com.ros.control.server.ConfigRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetConfigMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service Getter.
   */
  public static final class GetterFutureStub
      extends io.grpc.stub.AbstractFutureStub<GetterFutureStub> {
    private GetterFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected GetterFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new GetterFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.ros.control.server.ConfigReply> getConfig(
        com.ros.control.server.ConfigRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetConfigMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET_CONFIG = 0;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final AsyncService serviceImpl;
    private final int methodId;

    MethodHandlers(AsyncService serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET_CONFIG:
          serviceImpl.getConfig((com.ros.control.server.ConfigRequest) request,
              (io.grpc.stub.StreamObserver<com.ros.control.server.ConfigReply>) responseObserver);
          break;
        default:
          throw new AssertionError();
      }
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        default:
          throw new AssertionError();
      }
    }
  }

  public static final io.grpc.ServerServiceDefinition bindService(AsyncService service) {
    return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
        .addMethod(
          getGetConfigMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.ros.control.server.ConfigRequest,
              com.ros.control.server.ConfigReply>(
                service, METHODID_GET_CONFIG)))
        .build();
  }

  private static abstract class GetterBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    GetterBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.ros.control.server.GetterOuterClass.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("Getter");
    }
  }

  private static final class GetterFileDescriptorSupplier
      extends GetterBaseDescriptorSupplier {
    GetterFileDescriptorSupplier() {}
  }

  private static final class GetterMethodDescriptorSupplier
      extends GetterBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final java.lang.String methodName;

    GetterMethodDescriptorSupplier(java.lang.String methodName) {
      this.methodName = methodName;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.MethodDescriptor getMethodDescriptor() {
      return getServiceDescriptor().findMethodByName(methodName);
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (GetterGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new GetterFileDescriptorSupplier())
              .addMethod(getGetConfigMethod())
              .build();
        }
      }
    }
    return result;
  }
}
