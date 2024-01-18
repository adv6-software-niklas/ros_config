package com.ros.control.server;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.60.1)",
    comments = "Source: src/main/java/com/ros/control/proto/persistor.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class PersistorGrpc {

  private PersistorGrpc() {}

  public static final java.lang.String SERVICE_NAME = "com.ros.control.server.Persistor";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.ros.control.server.PersistRequest,
      com.ros.control.server.PersistReply> getSaveConfigMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "saveConfig",
      requestType = com.ros.control.server.PersistRequest.class,
      responseType = com.ros.control.server.PersistReply.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.ros.control.server.PersistRequest,
      com.ros.control.server.PersistReply> getSaveConfigMethod() {
    io.grpc.MethodDescriptor<com.ros.control.server.PersistRequest, com.ros.control.server.PersistReply> getSaveConfigMethod;
    if ((getSaveConfigMethod = PersistorGrpc.getSaveConfigMethod) == null) {
      synchronized (PersistorGrpc.class) {
        if ((getSaveConfigMethod = PersistorGrpc.getSaveConfigMethod) == null) {
          PersistorGrpc.getSaveConfigMethod = getSaveConfigMethod =
              io.grpc.MethodDescriptor.<com.ros.control.server.PersistRequest, com.ros.control.server.PersistReply>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "saveConfig"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.ros.control.server.PersistRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.ros.control.server.PersistReply.getDefaultInstance()))
              .setSchemaDescriptor(new PersistorMethodDescriptorSupplier("saveConfig"))
              .build();
        }
      }
    }
    return getSaveConfigMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static PersistorStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<PersistorStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<PersistorStub>() {
        @java.lang.Override
        public PersistorStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new PersistorStub(channel, callOptions);
        }
      };
    return PersistorStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static PersistorBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<PersistorBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<PersistorBlockingStub>() {
        @java.lang.Override
        public PersistorBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new PersistorBlockingStub(channel, callOptions);
        }
      };
    return PersistorBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static PersistorFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<PersistorFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<PersistorFutureStub>() {
        @java.lang.Override
        public PersistorFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new PersistorFutureStub(channel, callOptions);
        }
      };
    return PersistorFutureStub.newStub(factory, channel);
  }

  /**
   */
  public interface AsyncService {

    /**
     */
    default void saveConfig(com.ros.control.server.PersistRequest request,
        io.grpc.stub.StreamObserver<com.ros.control.server.PersistReply> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSaveConfigMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service Persistor.
   */
  public static abstract class PersistorImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return PersistorGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service Persistor.
   */
  public static final class PersistorStub
      extends io.grpc.stub.AbstractAsyncStub<PersistorStub> {
    private PersistorStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected PersistorStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new PersistorStub(channel, callOptions);
    }

    /**
     */
    public void saveConfig(com.ros.control.server.PersistRequest request,
        io.grpc.stub.StreamObserver<com.ros.control.server.PersistReply> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getSaveConfigMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service Persistor.
   */
  public static final class PersistorBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<PersistorBlockingStub> {
    private PersistorBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected PersistorBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new PersistorBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.ros.control.server.PersistReply saveConfig(com.ros.control.server.PersistRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getSaveConfigMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service Persistor.
   */
  public static final class PersistorFutureStub
      extends io.grpc.stub.AbstractFutureStub<PersistorFutureStub> {
    private PersistorFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected PersistorFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new PersistorFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.ros.control.server.PersistReply> saveConfig(
        com.ros.control.server.PersistRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getSaveConfigMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_SAVE_CONFIG = 0;

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
        case METHODID_SAVE_CONFIG:
          serviceImpl.saveConfig((com.ros.control.server.PersistRequest) request,
              (io.grpc.stub.StreamObserver<com.ros.control.server.PersistReply>) responseObserver);
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
          getSaveConfigMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.ros.control.server.PersistRequest,
              com.ros.control.server.PersistReply>(
                service, METHODID_SAVE_CONFIG)))
        .build();
  }

  private static abstract class PersistorBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    PersistorBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.ros.control.server.PersistorOuterClass.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("Persistor");
    }
  }

  private static final class PersistorFileDescriptorSupplier
      extends PersistorBaseDescriptorSupplier {
    PersistorFileDescriptorSupplier() {}
  }

  private static final class PersistorMethodDescriptorSupplier
      extends PersistorBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final java.lang.String methodName;

    PersistorMethodDescriptorSupplier(java.lang.String methodName) {
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
      synchronized (PersistorGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new PersistorFileDescriptorSupplier())
              .addMethod(getSaveConfigMethod())
              .build();
        }
      }
    }
    return result;
  }
}
