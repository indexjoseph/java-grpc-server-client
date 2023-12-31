package org.example;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.39.0)",
    comments = "Source: service.proto")
public final class SimpleServiceGrpc {

  private SimpleServiceGrpc() {}

  public static final String SERVICE_NAME = "SimpleService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<org.example.SimpleRequest,
      org.example.SimpleResponse> getSimpleSendMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SimpleSend",
      requestType = org.example.SimpleRequest.class,
      responseType = org.example.SimpleResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.example.SimpleRequest,
      org.example.SimpleResponse> getSimpleSendMethod() {
    io.grpc.MethodDescriptor<org.example.SimpleRequest, org.example.SimpleResponse> getSimpleSendMethod;
    if ((getSimpleSendMethod = SimpleServiceGrpc.getSimpleSendMethod) == null) {
      synchronized (SimpleServiceGrpc.class) {
        if ((getSimpleSendMethod = SimpleServiceGrpc.getSimpleSendMethod) == null) {
          SimpleServiceGrpc.getSimpleSendMethod = getSimpleSendMethod =
              io.grpc.MethodDescriptor.<org.example.SimpleRequest, org.example.SimpleResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SimpleSend"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.example.SimpleRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.example.SimpleResponse.getDefaultInstance()))
              .setSchemaDescriptor(new SimpleServiceMethodDescriptorSupplier("SimpleSend"))
              .build();
        }
      }
    }
    return getSimpleSendMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static SimpleServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<SimpleServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<SimpleServiceStub>() {
        @java.lang.Override
        public SimpleServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new SimpleServiceStub(channel, callOptions);
        }
      };
    return SimpleServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static SimpleServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<SimpleServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<SimpleServiceBlockingStub>() {
        @java.lang.Override
        public SimpleServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new SimpleServiceBlockingStub(channel, callOptions);
        }
      };
    return SimpleServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static SimpleServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<SimpleServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<SimpleServiceFutureStub>() {
        @java.lang.Override
        public SimpleServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new SimpleServiceFutureStub(channel, callOptions);
        }
      };
    return SimpleServiceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public static abstract class SimpleServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void simpleSend(org.example.SimpleRequest request,
        io.grpc.stub.StreamObserver<org.example.SimpleResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSimpleSendMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getSimpleSendMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                org.example.SimpleRequest,
                org.example.SimpleResponse>(
                  this, METHODID_SIMPLE_SEND)))
          .build();
    }
  }

  /**
   */
  public static final class SimpleServiceStub extends io.grpc.stub.AbstractAsyncStub<SimpleServiceStub> {
    private SimpleServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected SimpleServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new SimpleServiceStub(channel, callOptions);
    }

    /**
     */
    public void simpleSend(org.example.SimpleRequest request,
        io.grpc.stub.StreamObserver<org.example.SimpleResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getSimpleSendMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class SimpleServiceBlockingStub extends io.grpc.stub.AbstractBlockingStub<SimpleServiceBlockingStub> {
    private SimpleServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected SimpleServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new SimpleServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public org.example.SimpleResponse simpleSend(org.example.SimpleRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getSimpleSendMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class SimpleServiceFutureStub extends io.grpc.stub.AbstractFutureStub<SimpleServiceFutureStub> {
    private SimpleServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected SimpleServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new SimpleServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.example.SimpleResponse> simpleSend(
        org.example.SimpleRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getSimpleSendMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_SIMPLE_SEND = 0;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final SimpleServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(SimpleServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_SIMPLE_SEND:
          serviceImpl.simpleSend((org.example.SimpleRequest) request,
              (io.grpc.stub.StreamObserver<org.example.SimpleResponse>) responseObserver);
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

  private static abstract class SimpleServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    SimpleServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return org.example.Service.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("SimpleService");
    }
  }

  private static final class SimpleServiceFileDescriptorSupplier
      extends SimpleServiceBaseDescriptorSupplier {
    SimpleServiceFileDescriptorSupplier() {}
  }

  private static final class SimpleServiceMethodDescriptorSupplier
      extends SimpleServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    SimpleServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (SimpleServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new SimpleServiceFileDescriptorSupplier())
              .addMethod(getSimpleSendMethod())
              .build();
        }
      }
    }
    return result;
  }
}
