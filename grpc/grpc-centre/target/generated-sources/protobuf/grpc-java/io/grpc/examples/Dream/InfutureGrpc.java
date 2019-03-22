package io.grpc.examples.Dream;

import static io.grpc.MethodDescriptor.generateFullMethodName;
import static io.grpc.stub.ClientCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ClientCalls.asyncClientStreamingCall;
import static io.grpc.stub.ClientCalls.asyncServerStreamingCall;
import static io.grpc.stub.ClientCalls.asyncUnaryCall;
import static io.grpc.stub.ClientCalls.blockingServerStreamingCall;
import static io.grpc.stub.ClientCalls.blockingUnaryCall;
import static io.grpc.stub.ClientCalls.futureUnaryCall;
import static io.grpc.stub.ServerCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ServerCalls.asyncClientStreamingCall;
import static io.grpc.stub.ServerCalls.asyncServerStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnaryCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall;

/**
 * <pre>
 * The greeting mapper definition.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.12.0)",
    comments = "Source: helloworld.proto")
public final class InfutureGrpc {

  private InfutureGrpc() {}

  public static final String SERVICE_NAME = "dream.Infuture";

  // Static method descriptors that strictly reflect the proto.
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  @java.lang.Deprecated // Use {@link #getSayHelloMethod()} instead. 
  public static final io.grpc.MethodDescriptor<io.grpc.examples.Dream.HelloRequest,
      io.grpc.examples.Dream.InfoUser> METHOD_SAY_HELLO = getSayHelloMethodHelper();

  private static volatile io.grpc.MethodDescriptor<io.grpc.examples.Dream.HelloRequest,
      io.grpc.examples.Dream.InfoUser> getSayHelloMethod;

  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static io.grpc.MethodDescriptor<io.grpc.examples.Dream.HelloRequest,
      io.grpc.examples.Dream.InfoUser> getSayHelloMethod() {
    return getSayHelloMethodHelper();
  }

  private static io.grpc.MethodDescriptor<io.grpc.examples.Dream.HelloRequest,
      io.grpc.examples.Dream.InfoUser> getSayHelloMethodHelper() {
    io.grpc.MethodDescriptor<io.grpc.examples.Dream.HelloRequest, io.grpc.examples.Dream.InfoUser> getSayHelloMethod;
    if ((getSayHelloMethod = InfutureGrpc.getSayHelloMethod) == null) {
      synchronized (InfutureGrpc.class) {
        if ((getSayHelloMethod = InfutureGrpc.getSayHelloMethod) == null) {
          InfutureGrpc.getSayHelloMethod = getSayHelloMethod = 
              io.grpc.MethodDescriptor.<io.grpc.examples.Dream.HelloRequest, io.grpc.examples.Dream.InfoUser>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "dream.Infuture", "SayHello"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.grpc.examples.Dream.HelloRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.grpc.examples.Dream.InfoUser.getDefaultInstance()))
                  .setSchemaDescriptor(new InfutureMethodDescriptorSupplier("SayHello"))
                  .build();
          }
        }
     }
     return getSayHelloMethod;
  }
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  @java.lang.Deprecated // Use {@link #getSayHelloAgainMethod()} instead. 
  public static final io.grpc.MethodDescriptor<io.grpc.examples.Dream.HelloRequest,
      io.grpc.examples.Dream.InfoUser> METHOD_SAY_HELLO_AGAIN = getSayHelloAgainMethodHelper();

  private static volatile io.grpc.MethodDescriptor<io.grpc.examples.Dream.HelloRequest,
      io.grpc.examples.Dream.InfoUser> getSayHelloAgainMethod;

  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static io.grpc.MethodDescriptor<io.grpc.examples.Dream.HelloRequest,
      io.grpc.examples.Dream.InfoUser> getSayHelloAgainMethod() {
    return getSayHelloAgainMethodHelper();
  }

  private static io.grpc.MethodDescriptor<io.grpc.examples.Dream.HelloRequest,
      io.grpc.examples.Dream.InfoUser> getSayHelloAgainMethodHelper() {
    io.grpc.MethodDescriptor<io.grpc.examples.Dream.HelloRequest, io.grpc.examples.Dream.InfoUser> getSayHelloAgainMethod;
    if ((getSayHelloAgainMethod = InfutureGrpc.getSayHelloAgainMethod) == null) {
      synchronized (InfutureGrpc.class) {
        if ((getSayHelloAgainMethod = InfutureGrpc.getSayHelloAgainMethod) == null) {
          InfutureGrpc.getSayHelloAgainMethod = getSayHelloAgainMethod = 
              io.grpc.MethodDescriptor.<io.grpc.examples.Dream.HelloRequest, io.grpc.examples.Dream.InfoUser>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "dream.Infuture", "SayHelloAgain"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.grpc.examples.Dream.HelloRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.grpc.examples.Dream.InfoUser.getDefaultInstance()))
                  .setSchemaDescriptor(new InfutureMethodDescriptorSupplier("SayHelloAgain"))
                  .build();
          }
        }
     }
     return getSayHelloAgainMethod;
  }
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  @java.lang.Deprecated // Use {@link #getGetByUserIdMethod()} instead. 
  public static final io.grpc.MethodDescriptor<io.grpc.examples.Dream.myRequest,
      io.grpc.examples.Dream.InfoUser> METHOD_GET_BY_USER_ID = getGetByUserIdMethodHelper();

  private static volatile io.grpc.MethodDescriptor<io.grpc.examples.Dream.myRequest,
      io.grpc.examples.Dream.InfoUser> getGetByUserIdMethod;

  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static io.grpc.MethodDescriptor<io.grpc.examples.Dream.myRequest,
      io.grpc.examples.Dream.InfoUser> getGetByUserIdMethod() {
    return getGetByUserIdMethodHelper();
  }

  private static io.grpc.MethodDescriptor<io.grpc.examples.Dream.myRequest,
      io.grpc.examples.Dream.InfoUser> getGetByUserIdMethodHelper() {
    io.grpc.MethodDescriptor<io.grpc.examples.Dream.myRequest, io.grpc.examples.Dream.InfoUser> getGetByUserIdMethod;
    if ((getGetByUserIdMethod = InfutureGrpc.getGetByUserIdMethod) == null) {
      synchronized (InfutureGrpc.class) {
        if ((getGetByUserIdMethod = InfutureGrpc.getGetByUserIdMethod) == null) {
          InfutureGrpc.getGetByUserIdMethod = getGetByUserIdMethod = 
              io.grpc.MethodDescriptor.<io.grpc.examples.Dream.myRequest, io.grpc.examples.Dream.InfoUser>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "dream.Infuture", "getByUserId"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.grpc.examples.Dream.myRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.grpc.examples.Dream.InfoUser.getDefaultInstance()))
                  .setSchemaDescriptor(new InfutureMethodDescriptorSupplier("getByUserId"))
                  .build();
          }
        }
     }
     return getGetByUserIdMethod;
  }
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  @java.lang.Deprecated // Use {@link #getGetNameByIdMethod()} instead. 
  public static final io.grpc.MethodDescriptor<io.grpc.examples.Dream.myRequest,
      io.grpc.examples.Dream.InfoUser> METHOD_GET_NAME_BY_ID = getGetNameByIdMethodHelper();

  private static volatile io.grpc.MethodDescriptor<io.grpc.examples.Dream.myRequest,
      io.grpc.examples.Dream.InfoUser> getGetNameByIdMethod;

  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static io.grpc.MethodDescriptor<io.grpc.examples.Dream.myRequest,
      io.grpc.examples.Dream.InfoUser> getGetNameByIdMethod() {
    return getGetNameByIdMethodHelper();
  }

  private static io.grpc.MethodDescriptor<io.grpc.examples.Dream.myRequest,
      io.grpc.examples.Dream.InfoUser> getGetNameByIdMethodHelper() {
    io.grpc.MethodDescriptor<io.grpc.examples.Dream.myRequest, io.grpc.examples.Dream.InfoUser> getGetNameByIdMethod;
    if ((getGetNameByIdMethod = InfutureGrpc.getGetNameByIdMethod) == null) {
      synchronized (InfutureGrpc.class) {
        if ((getGetNameByIdMethod = InfutureGrpc.getGetNameByIdMethod) == null) {
          InfutureGrpc.getGetNameByIdMethod = getGetNameByIdMethod = 
              io.grpc.MethodDescriptor.<io.grpc.examples.Dream.myRequest, io.grpc.examples.Dream.InfoUser>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "dream.Infuture", "getNameById"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.grpc.examples.Dream.myRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.grpc.examples.Dream.InfoUser.getDefaultInstance()))
                  .setSchemaDescriptor(new InfutureMethodDescriptorSupplier("getNameById"))
                  .build();
          }
        }
     }
     return getGetNameByIdMethod;
  }
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  @java.lang.Deprecated // Use {@link #getInsertUserMethod()} instead. 
  public static final io.grpc.MethodDescriptor<io.grpc.examples.Dream.InfoUser,
      io.grpc.examples.Dream.InfoUser> METHOD_INSERT_USER = getInsertUserMethodHelper();

  private static volatile io.grpc.MethodDescriptor<io.grpc.examples.Dream.InfoUser,
      io.grpc.examples.Dream.InfoUser> getInsertUserMethod;

  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static io.grpc.MethodDescriptor<io.grpc.examples.Dream.InfoUser,
      io.grpc.examples.Dream.InfoUser> getInsertUserMethod() {
    return getInsertUserMethodHelper();
  }

  private static io.grpc.MethodDescriptor<io.grpc.examples.Dream.InfoUser,
      io.grpc.examples.Dream.InfoUser> getInsertUserMethodHelper() {
    io.grpc.MethodDescriptor<io.grpc.examples.Dream.InfoUser, io.grpc.examples.Dream.InfoUser> getInsertUserMethod;
    if ((getInsertUserMethod = InfutureGrpc.getInsertUserMethod) == null) {
      synchronized (InfutureGrpc.class) {
        if ((getInsertUserMethod = InfutureGrpc.getInsertUserMethod) == null) {
          InfutureGrpc.getInsertUserMethod = getInsertUserMethod = 
              io.grpc.MethodDescriptor.<io.grpc.examples.Dream.InfoUser, io.grpc.examples.Dream.InfoUser>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "dream.Infuture", "insertUser"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.grpc.examples.Dream.InfoUser.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.grpc.examples.Dream.InfoUser.getDefaultInstance()))
                  .setSchemaDescriptor(new InfutureMethodDescriptorSupplier("insertUser"))
                  .build();
          }
        }
     }
     return getInsertUserMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static InfutureStub newStub(io.grpc.Channel channel) {
    return new InfutureStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static InfutureBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new InfutureBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static InfutureFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new InfutureFutureStub(channel);
  }

  /**
   * <pre>
   * The greeting mapper definition.
   * </pre>
   */
  public static abstract class InfutureImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * Sends a greeting
     * </pre>
     */
    public void sayHello(io.grpc.examples.Dream.HelloRequest request,
        io.grpc.stub.StreamObserver<io.grpc.examples.Dream.InfoUser> responseObserver) {
      asyncUnimplementedUnaryCall(getSayHelloMethodHelper(), responseObserver);
    }

    /**
     */
    public void sayHelloAgain(io.grpc.examples.Dream.HelloRequest request,
        io.grpc.stub.StreamObserver<io.grpc.examples.Dream.InfoUser> responseObserver) {
      asyncUnimplementedUnaryCall(getSayHelloAgainMethodHelper(), responseObserver);
    }

    /**
     * <pre>
     * 根据用户id获取用户信息的服务(具体服务/函数)
     * </pre>
     */
    public void getByUserId(io.grpc.examples.Dream.myRequest request,
        io.grpc.stub.StreamObserver<io.grpc.examples.Dream.InfoUser> responseObserver) {
      asyncUnimplementedUnaryCall(getGetByUserIdMethodHelper(), responseObserver);
    }

    /**
     * <pre>
     * 根据用户id获取用户信息的服务(具体服务/函数)
     * </pre>
     */
    public void getNameById(io.grpc.examples.Dream.myRequest request,
        io.grpc.stub.StreamObserver<io.grpc.examples.Dream.InfoUser> responseObserver) {
      asyncUnimplementedUnaryCall(getGetNameByIdMethodHelper(), responseObserver);
    }

    /**
     */
    public void insertUser(io.grpc.examples.Dream.InfoUser request,
        io.grpc.stub.StreamObserver<io.grpc.examples.Dream.InfoUser> responseObserver) {
      asyncUnimplementedUnaryCall(getInsertUserMethodHelper(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getSayHelloMethodHelper(),
            asyncUnaryCall(
              new MethodHandlers<
                io.grpc.examples.Dream.HelloRequest,
                io.grpc.examples.Dream.InfoUser>(
                  this, METHODID_SAY_HELLO)))
          .addMethod(
            getSayHelloAgainMethodHelper(),
            asyncUnaryCall(
              new MethodHandlers<
                io.grpc.examples.Dream.HelloRequest,
                io.grpc.examples.Dream.InfoUser>(
                  this, METHODID_SAY_HELLO_AGAIN)))
          .addMethod(
            getGetByUserIdMethodHelper(),
            asyncUnaryCall(
              new MethodHandlers<
                io.grpc.examples.Dream.myRequest,
                io.grpc.examples.Dream.InfoUser>(
                  this, METHODID_GET_BY_USER_ID)))
          .addMethod(
            getGetNameByIdMethodHelper(),
            asyncUnaryCall(
              new MethodHandlers<
                io.grpc.examples.Dream.myRequest,
                io.grpc.examples.Dream.InfoUser>(
                  this, METHODID_GET_NAME_BY_ID)))
          .addMethod(
            getInsertUserMethodHelper(),
            asyncUnaryCall(
              new MethodHandlers<
                io.grpc.examples.Dream.InfoUser,
                io.grpc.examples.Dream.InfoUser>(
                  this, METHODID_INSERT_USER)))
          .build();
    }
  }

  /**
   * <pre>
   * The greeting mapper definition.
   * </pre>
   */
  public static final class InfutureStub extends io.grpc.stub.AbstractStub<InfutureStub> {
    private InfutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private InfutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected InfutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new InfutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Sends a greeting
     * </pre>
     */
    public void sayHello(io.grpc.examples.Dream.HelloRequest request,
        io.grpc.stub.StreamObserver<io.grpc.examples.Dream.InfoUser> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getSayHelloMethodHelper(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void sayHelloAgain(io.grpc.examples.Dream.HelloRequest request,
        io.grpc.stub.StreamObserver<io.grpc.examples.Dream.InfoUser> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getSayHelloAgainMethodHelper(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * 根据用户id获取用户信息的服务(具体服务/函数)
     * </pre>
     */
    public void getByUserId(io.grpc.examples.Dream.myRequest request,
        io.grpc.stub.StreamObserver<io.grpc.examples.Dream.InfoUser> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetByUserIdMethodHelper(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * 根据用户id获取用户信息的服务(具体服务/函数)
     * </pre>
     */
    public void getNameById(io.grpc.examples.Dream.myRequest request,
        io.grpc.stub.StreamObserver<io.grpc.examples.Dream.InfoUser> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetNameByIdMethodHelper(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void insertUser(io.grpc.examples.Dream.InfoUser request,
        io.grpc.stub.StreamObserver<io.grpc.examples.Dream.InfoUser> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getInsertUserMethodHelper(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * The greeting mapper definition.
   * </pre>
   */
  public static final class InfutureBlockingStub extends io.grpc.stub.AbstractStub<InfutureBlockingStub> {
    private InfutureBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private InfutureBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected InfutureBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new InfutureBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Sends a greeting
     * </pre>
     */
    public io.grpc.examples.Dream.InfoUser sayHello(io.grpc.examples.Dream.HelloRequest request) {
      return blockingUnaryCall(
          getChannel(), getSayHelloMethodHelper(), getCallOptions(), request);
    }

    /**
     */
    public io.grpc.examples.Dream.InfoUser sayHelloAgain(io.grpc.examples.Dream.HelloRequest request) {
      return blockingUnaryCall(
          getChannel(), getSayHelloAgainMethodHelper(), getCallOptions(), request);
    }

    /**
     * <pre>
     * 根据用户id获取用户信息的服务(具体服务/函数)
     * </pre>
     */
    public io.grpc.examples.Dream.InfoUser getByUserId(io.grpc.examples.Dream.myRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetByUserIdMethodHelper(), getCallOptions(), request);
    }

    /**
     * <pre>
     * 根据用户id获取用户信息的服务(具体服务/函数)
     * </pre>
     */
    public io.grpc.examples.Dream.InfoUser getNameById(io.grpc.examples.Dream.myRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetNameByIdMethodHelper(), getCallOptions(), request);
    }

    /**
     */
    public io.grpc.examples.Dream.InfoUser insertUser(io.grpc.examples.Dream.InfoUser request) {
      return blockingUnaryCall(
          getChannel(), getInsertUserMethodHelper(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * The greeting mapper definition.
   * </pre>
   */
  public static final class InfutureFutureStub extends io.grpc.stub.AbstractStub<InfutureFutureStub> {
    private InfutureFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private InfutureFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected InfutureFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new InfutureFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Sends a greeting
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<io.grpc.examples.Dream.InfoUser> sayHello(
        io.grpc.examples.Dream.HelloRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getSayHelloMethodHelper(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<io.grpc.examples.Dream.InfoUser> sayHelloAgain(
        io.grpc.examples.Dream.HelloRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getSayHelloAgainMethodHelper(), getCallOptions()), request);
    }

    /**
     * <pre>
     * 根据用户id获取用户信息的服务(具体服务/函数)
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<io.grpc.examples.Dream.InfoUser> getByUserId(
        io.grpc.examples.Dream.myRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetByUserIdMethodHelper(), getCallOptions()), request);
    }

    /**
     * <pre>
     * 根据用户id获取用户信息的服务(具体服务/函数)
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<io.grpc.examples.Dream.InfoUser> getNameById(
        io.grpc.examples.Dream.myRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetNameByIdMethodHelper(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<io.grpc.examples.Dream.InfoUser> insertUser(
        io.grpc.examples.Dream.InfoUser request) {
      return futureUnaryCall(
          getChannel().newCall(getInsertUserMethodHelper(), getCallOptions()), request);
    }
  }

  private static final int METHODID_SAY_HELLO = 0;
  private static final int METHODID_SAY_HELLO_AGAIN = 1;
  private static final int METHODID_GET_BY_USER_ID = 2;
  private static final int METHODID_GET_NAME_BY_ID = 3;
  private static final int METHODID_INSERT_USER = 4;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final InfutureImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(InfutureImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_SAY_HELLO:
          serviceImpl.sayHello((io.grpc.examples.Dream.HelloRequest) request,
              (io.grpc.stub.StreamObserver<io.grpc.examples.Dream.InfoUser>) responseObserver);
          break;
        case METHODID_SAY_HELLO_AGAIN:
          serviceImpl.sayHelloAgain((io.grpc.examples.Dream.HelloRequest) request,
              (io.grpc.stub.StreamObserver<io.grpc.examples.Dream.InfoUser>) responseObserver);
          break;
        case METHODID_GET_BY_USER_ID:
          serviceImpl.getByUserId((io.grpc.examples.Dream.myRequest) request,
              (io.grpc.stub.StreamObserver<io.grpc.examples.Dream.InfoUser>) responseObserver);
          break;
        case METHODID_GET_NAME_BY_ID:
          serviceImpl.getNameById((io.grpc.examples.Dream.myRequest) request,
              (io.grpc.stub.StreamObserver<io.grpc.examples.Dream.InfoUser>) responseObserver);
          break;
        case METHODID_INSERT_USER:
          serviceImpl.insertUser((io.grpc.examples.Dream.InfoUser) request,
              (io.grpc.stub.StreamObserver<io.grpc.examples.Dream.InfoUser>) responseObserver);
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

  private static abstract class InfutureBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    InfutureBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return io.grpc.examples.Dream.DreamProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("Infuture");
    }
  }

  private static final class InfutureFileDescriptorSupplier
      extends InfutureBaseDescriptorSupplier {
    InfutureFileDescriptorSupplier() {}
  }

  private static final class InfutureMethodDescriptorSupplier
      extends InfutureBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    InfutureMethodDescriptorSupplier(String methodName) {
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
      synchronized (InfutureGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new InfutureFileDescriptorSupplier())
              .addMethod(getSayHelloMethodHelper())
              .addMethod(getSayHelloAgainMethodHelper())
              .addMethod(getGetByUserIdMethodHelper())
              .addMethod(getGetNameByIdMethodHelper())
              .addMethod(getInsertUserMethodHelper())
              .build();
        }
      }
    }
    return result;
  }
}
