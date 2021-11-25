package grpc;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * Expose service
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.42.1)",
    comments = "Source: users.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class UsersServiceGrpc {

  private UsersServiceGrpc() {}

  public static final String SERVICE_NAME = "users.UsersService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<grpc.UserById,
      grpc.User> getFindByIdMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "findById",
      requestType = grpc.UserById.class,
      responseType = grpc.User.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<grpc.UserById,
      grpc.User> getFindByIdMethod() {
    io.grpc.MethodDescriptor<grpc.UserById, grpc.User> getFindByIdMethod;
    if ((getFindByIdMethod = UsersServiceGrpc.getFindByIdMethod) == null) {
      synchronized (UsersServiceGrpc.class) {
        if ((getFindByIdMethod = UsersServiceGrpc.getFindByIdMethod) == null) {
          UsersServiceGrpc.getFindByIdMethod = getFindByIdMethod =
              io.grpc.MethodDescriptor.<grpc.UserById, grpc.User>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "findById"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  grpc.UserById.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  grpc.User.getDefaultInstance()))
              .setSchemaDescriptor(new UsersServiceMethodDescriptorSupplier("findById"))
              .build();
        }
      }
    }
    return getFindByIdMethod;
  }

  private static volatile io.grpc.MethodDescriptor<grpc.UserByDni,
      grpc.User> getFindByDniMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "findByDni",
      requestType = grpc.UserByDni.class,
      responseType = grpc.User.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<grpc.UserByDni,
      grpc.User> getFindByDniMethod() {
    io.grpc.MethodDescriptor<grpc.UserByDni, grpc.User> getFindByDniMethod;
    if ((getFindByDniMethod = UsersServiceGrpc.getFindByDniMethod) == null) {
      synchronized (UsersServiceGrpc.class) {
        if ((getFindByDniMethod = UsersServiceGrpc.getFindByDniMethod) == null) {
          UsersServiceGrpc.getFindByDniMethod = getFindByDniMethod =
              io.grpc.MethodDescriptor.<grpc.UserByDni, grpc.User>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "findByDni"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  grpc.UserByDni.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  grpc.User.getDefaultInstance()))
              .setSchemaDescriptor(new UsersServiceMethodDescriptorSupplier("findByDni"))
              .build();
        }
      }
    }
    return getFindByDniMethod;
  }

  private static volatile io.grpc.MethodDescriptor<grpc.UserByName,
      grpc.User> getFindByNameMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "findByName",
      requestType = grpc.UserByName.class,
      responseType = grpc.User.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<grpc.UserByName,
      grpc.User> getFindByNameMethod() {
    io.grpc.MethodDescriptor<grpc.UserByName, grpc.User> getFindByNameMethod;
    if ((getFindByNameMethod = UsersServiceGrpc.getFindByNameMethod) == null) {
      synchronized (UsersServiceGrpc.class) {
        if ((getFindByNameMethod = UsersServiceGrpc.getFindByNameMethod) == null) {
          UsersServiceGrpc.getFindByNameMethod = getFindByNameMethod =
              io.grpc.MethodDescriptor.<grpc.UserByName, grpc.User>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "findByName"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  grpc.UserByName.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  grpc.User.getDefaultInstance()))
              .setSchemaDescriptor(new UsersServiceMethodDescriptorSupplier("findByName"))
              .build();
        }
      }
    }
    return getFindByNameMethod;
  }

  private static volatile io.grpc.MethodDescriptor<grpc.Empty,
      grpc.UsersList> getFindAllMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "findAll",
      requestType = grpc.Empty.class,
      responseType = grpc.UsersList.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<grpc.Empty,
      grpc.UsersList> getFindAllMethod() {
    io.grpc.MethodDescriptor<grpc.Empty, grpc.UsersList> getFindAllMethod;
    if ((getFindAllMethod = UsersServiceGrpc.getFindAllMethod) == null) {
      synchronized (UsersServiceGrpc.class) {
        if ((getFindAllMethod = UsersServiceGrpc.getFindAllMethod) == null) {
          UsersServiceGrpc.getFindAllMethod = getFindAllMethod =
              io.grpc.MethodDescriptor.<grpc.Empty, grpc.UsersList>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "findAll"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  grpc.Empty.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  grpc.UsersList.getDefaultInstance()))
              .setSchemaDescriptor(new UsersServiceMethodDescriptorSupplier("findAll"))
              .build();
        }
      }
    }
    return getFindAllMethod;
  }

  private static volatile io.grpc.MethodDescriptor<grpc.UserDto,
      grpc.User> getCreateUserMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "createUser",
      requestType = grpc.UserDto.class,
      responseType = grpc.User.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<grpc.UserDto,
      grpc.User> getCreateUserMethod() {
    io.grpc.MethodDescriptor<grpc.UserDto, grpc.User> getCreateUserMethod;
    if ((getCreateUserMethod = UsersServiceGrpc.getCreateUserMethod) == null) {
      synchronized (UsersServiceGrpc.class) {
        if ((getCreateUserMethod = UsersServiceGrpc.getCreateUserMethod) == null) {
          UsersServiceGrpc.getCreateUserMethod = getCreateUserMethod =
              io.grpc.MethodDescriptor.<grpc.UserDto, grpc.User>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "createUser"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  grpc.UserDto.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  grpc.User.getDefaultInstance()))
              .setSchemaDescriptor(new UsersServiceMethodDescriptorSupplier("createUser"))
              .build();
        }
      }
    }
    return getCreateUserMethod;
  }

  private static volatile io.grpc.MethodDescriptor<grpc.User,
      grpc.User> getUpdateUserMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "updateUser",
      requestType = grpc.User.class,
      responseType = grpc.User.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<grpc.User,
      grpc.User> getUpdateUserMethod() {
    io.grpc.MethodDescriptor<grpc.User, grpc.User> getUpdateUserMethod;
    if ((getUpdateUserMethod = UsersServiceGrpc.getUpdateUserMethod) == null) {
      synchronized (UsersServiceGrpc.class) {
        if ((getUpdateUserMethod = UsersServiceGrpc.getUpdateUserMethod) == null) {
          UsersServiceGrpc.getUpdateUserMethod = getUpdateUserMethod =
              io.grpc.MethodDescriptor.<grpc.User, grpc.User>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "updateUser"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  grpc.User.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  grpc.User.getDefaultInstance()))
              .setSchemaDescriptor(new UsersServiceMethodDescriptorSupplier("updateUser"))
              .build();
        }
      }
    }
    return getUpdateUserMethod;
  }

  private static volatile io.grpc.MethodDescriptor<grpc.UserById,
      grpc.User> getDeactivateUserMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "deactivateUser",
      requestType = grpc.UserById.class,
      responseType = grpc.User.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<grpc.UserById,
      grpc.User> getDeactivateUserMethod() {
    io.grpc.MethodDescriptor<grpc.UserById, grpc.User> getDeactivateUserMethod;
    if ((getDeactivateUserMethod = UsersServiceGrpc.getDeactivateUserMethod) == null) {
      synchronized (UsersServiceGrpc.class) {
        if ((getDeactivateUserMethod = UsersServiceGrpc.getDeactivateUserMethod) == null) {
          UsersServiceGrpc.getDeactivateUserMethod = getDeactivateUserMethod =
              io.grpc.MethodDescriptor.<grpc.UserById, grpc.User>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "deactivateUser"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  grpc.UserById.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  grpc.User.getDefaultInstance()))
              .setSchemaDescriptor(new UsersServiceMethodDescriptorSupplier("deactivateUser"))
              .build();
        }
      }
    }
    return getDeactivateUserMethod;
  }

  private static volatile io.grpc.MethodDescriptor<grpc.UserById,
      grpc.User> getDeleteUserMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "deleteUser",
      requestType = grpc.UserById.class,
      responseType = grpc.User.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<grpc.UserById,
      grpc.User> getDeleteUserMethod() {
    io.grpc.MethodDescriptor<grpc.UserById, grpc.User> getDeleteUserMethod;
    if ((getDeleteUserMethod = UsersServiceGrpc.getDeleteUserMethod) == null) {
      synchronized (UsersServiceGrpc.class) {
        if ((getDeleteUserMethod = UsersServiceGrpc.getDeleteUserMethod) == null) {
          UsersServiceGrpc.getDeleteUserMethod = getDeleteUserMethod =
              io.grpc.MethodDescriptor.<grpc.UserById, grpc.User>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "deleteUser"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  grpc.UserById.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  grpc.User.getDefaultInstance()))
              .setSchemaDescriptor(new UsersServiceMethodDescriptorSupplier("deleteUser"))
              .build();
        }
      }
    }
    return getDeleteUserMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static UsersServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<UsersServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<UsersServiceStub>() {
        @java.lang.Override
        public UsersServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new UsersServiceStub(channel, callOptions);
        }
      };
    return UsersServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static UsersServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<UsersServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<UsersServiceBlockingStub>() {
        @java.lang.Override
        public UsersServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new UsersServiceBlockingStub(channel, callOptions);
        }
      };
    return UsersServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static UsersServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<UsersServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<UsersServiceFutureStub>() {
        @java.lang.Override
        public UsersServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new UsersServiceFutureStub(channel, callOptions);
        }
      };
    return UsersServiceFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   * Expose service
   * </pre>
   */
  public static abstract class UsersServiceImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * Endpoints
     * </pre>
     */
    public void findById(grpc.UserById request,
        io.grpc.stub.StreamObserver<grpc.User> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getFindByIdMethod(), responseObserver);
    }

    /**
     */
    public void findByDni(grpc.UserByDni request,
        io.grpc.stub.StreamObserver<grpc.User> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getFindByDniMethod(), responseObserver);
    }

    /**
     */
    public void findByName(grpc.UserByName request,
        io.grpc.stub.StreamObserver<grpc.User> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getFindByNameMethod(), responseObserver);
    }

    /**
     */
    public void findAll(grpc.Empty request,
        io.grpc.stub.StreamObserver<grpc.UsersList> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getFindAllMethod(), responseObserver);
    }

    /**
     */
    public void createUser(grpc.UserDto request,
        io.grpc.stub.StreamObserver<grpc.User> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreateUserMethod(), responseObserver);
    }

    /**
     */
    public void updateUser(grpc.User request,
        io.grpc.stub.StreamObserver<grpc.User> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdateUserMethod(), responseObserver);
    }

    /**
     */
    public void deactivateUser(grpc.UserById request,
        io.grpc.stub.StreamObserver<grpc.User> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeactivateUserMethod(), responseObserver);
    }

    /**
     */
    public void deleteUser(grpc.UserById request,
        io.grpc.stub.StreamObserver<grpc.User> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeleteUserMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getFindByIdMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                grpc.UserById,
                grpc.User>(
                  this, METHODID_FIND_BY_ID)))
          .addMethod(
            getFindByDniMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                grpc.UserByDni,
                grpc.User>(
                  this, METHODID_FIND_BY_DNI)))
          .addMethod(
            getFindByNameMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                grpc.UserByName,
                grpc.User>(
                  this, METHODID_FIND_BY_NAME)))
          .addMethod(
            getFindAllMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                grpc.Empty,
                grpc.UsersList>(
                  this, METHODID_FIND_ALL)))
          .addMethod(
            getCreateUserMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                grpc.UserDto,
                grpc.User>(
                  this, METHODID_CREATE_USER)))
          .addMethod(
            getUpdateUserMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                grpc.User,
                grpc.User>(
                  this, METHODID_UPDATE_USER)))
          .addMethod(
            getDeactivateUserMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                grpc.UserById,
                grpc.User>(
                  this, METHODID_DEACTIVATE_USER)))
          .addMethod(
            getDeleteUserMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                grpc.UserById,
                grpc.User>(
                  this, METHODID_DELETE_USER)))
          .build();
    }
  }

  /**
   * <pre>
   * Expose service
   * </pre>
   */
  public static final class UsersServiceStub extends io.grpc.stub.AbstractAsyncStub<UsersServiceStub> {
    private UsersServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected UsersServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new UsersServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * Endpoints
     * </pre>
     */
    public void findById(grpc.UserById request,
        io.grpc.stub.StreamObserver<grpc.User> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getFindByIdMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void findByDni(grpc.UserByDni request,
        io.grpc.stub.StreamObserver<grpc.User> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getFindByDniMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void findByName(grpc.UserByName request,
        io.grpc.stub.StreamObserver<grpc.User> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getFindByNameMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void findAll(grpc.Empty request,
        io.grpc.stub.StreamObserver<grpc.UsersList> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getFindAllMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void createUser(grpc.UserDto request,
        io.grpc.stub.StreamObserver<grpc.User> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreateUserMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void updateUser(grpc.User request,
        io.grpc.stub.StreamObserver<grpc.User> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdateUserMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void deactivateUser(grpc.UserById request,
        io.grpc.stub.StreamObserver<grpc.User> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDeactivateUserMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void deleteUser(grpc.UserById request,
        io.grpc.stub.StreamObserver<grpc.User> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDeleteUserMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * Expose service
   * </pre>
   */
  public static final class UsersServiceBlockingStub extends io.grpc.stub.AbstractBlockingStub<UsersServiceBlockingStub> {
    private UsersServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected UsersServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new UsersServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Endpoints
     * </pre>
     */
    public grpc.User findById(grpc.UserById request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getFindByIdMethod(), getCallOptions(), request);
    }

    /**
     */
    public grpc.User findByDni(grpc.UserByDni request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getFindByDniMethod(), getCallOptions(), request);
    }

    /**
     */
    public grpc.User findByName(grpc.UserByName request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getFindByNameMethod(), getCallOptions(), request);
    }

    /**
     */
    public grpc.UsersList findAll(grpc.Empty request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getFindAllMethod(), getCallOptions(), request);
    }

    /**
     */
    public grpc.User createUser(grpc.UserDto request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreateUserMethod(), getCallOptions(), request);
    }

    /**
     */
    public grpc.User updateUser(grpc.User request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateUserMethod(), getCallOptions(), request);
    }

    /**
     */
    public grpc.User deactivateUser(grpc.UserById request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeactivateUserMethod(), getCallOptions(), request);
    }

    /**
     */
    public grpc.User deleteUser(grpc.UserById request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeleteUserMethod(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * Expose service
   * </pre>
   */
  public static final class UsersServiceFutureStub extends io.grpc.stub.AbstractFutureStub<UsersServiceFutureStub> {
    private UsersServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected UsersServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new UsersServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Endpoints
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<grpc.User> findById(
        grpc.UserById request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getFindByIdMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<grpc.User> findByDni(
        grpc.UserByDni request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getFindByDniMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<grpc.User> findByName(
        grpc.UserByName request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getFindByNameMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<grpc.UsersList> findAll(
        grpc.Empty request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getFindAllMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<grpc.User> createUser(
        grpc.UserDto request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreateUserMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<grpc.User> updateUser(
        grpc.User request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdateUserMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<grpc.User> deactivateUser(
        grpc.UserById request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDeactivateUserMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<grpc.User> deleteUser(
        grpc.UserById request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDeleteUserMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_FIND_BY_ID = 0;
  private static final int METHODID_FIND_BY_DNI = 1;
  private static final int METHODID_FIND_BY_NAME = 2;
  private static final int METHODID_FIND_ALL = 3;
  private static final int METHODID_CREATE_USER = 4;
  private static final int METHODID_UPDATE_USER = 5;
  private static final int METHODID_DEACTIVATE_USER = 6;
  private static final int METHODID_DELETE_USER = 7;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final UsersServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(UsersServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_FIND_BY_ID:
          serviceImpl.findById((grpc.UserById) request,
              (io.grpc.stub.StreamObserver<grpc.User>) responseObserver);
          break;
        case METHODID_FIND_BY_DNI:
          serviceImpl.findByDni((grpc.UserByDni) request,
              (io.grpc.stub.StreamObserver<grpc.User>) responseObserver);
          break;
        case METHODID_FIND_BY_NAME:
          serviceImpl.findByName((grpc.UserByName) request,
              (io.grpc.stub.StreamObserver<grpc.User>) responseObserver);
          break;
        case METHODID_FIND_ALL:
          serviceImpl.findAll((grpc.Empty) request,
              (io.grpc.stub.StreamObserver<grpc.UsersList>) responseObserver);
          break;
        case METHODID_CREATE_USER:
          serviceImpl.createUser((grpc.UserDto) request,
              (io.grpc.stub.StreamObserver<grpc.User>) responseObserver);
          break;
        case METHODID_UPDATE_USER:
          serviceImpl.updateUser((grpc.User) request,
              (io.grpc.stub.StreamObserver<grpc.User>) responseObserver);
          break;
        case METHODID_DEACTIVATE_USER:
          serviceImpl.deactivateUser((grpc.UserById) request,
              (io.grpc.stub.StreamObserver<grpc.User>) responseObserver);
          break;
        case METHODID_DELETE_USER:
          serviceImpl.deleteUser((grpc.UserById) request,
              (io.grpc.stub.StreamObserver<grpc.User>) responseObserver);
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

  private static abstract class UsersServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    UsersServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return grpc.Users.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("UsersService");
    }
  }

  private static final class UsersServiceFileDescriptorSupplier
      extends UsersServiceBaseDescriptorSupplier {
    UsersServiceFileDescriptorSupplier() {}
  }

  private static final class UsersServiceMethodDescriptorSupplier
      extends UsersServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    UsersServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (UsersServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new UsersServiceFileDescriptorSupplier())
              .addMethod(getFindByIdMethod())
              .addMethod(getFindByDniMethod())
              .addMethod(getFindByNameMethod())
              .addMethod(getFindAllMethod())
              .addMethod(getCreateUserMethod())
              .addMethod(getUpdateUserMethod())
              .addMethod(getDeactivateUserMethod())
              .addMethod(getDeleteUserMethod())
              .build();
        }
      }
    }
    return result;
  }
}
