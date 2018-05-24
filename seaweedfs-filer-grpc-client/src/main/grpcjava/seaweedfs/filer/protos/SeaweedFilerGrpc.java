package seaweedfs.filer.protos;

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
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.12.0)",
    comments = "Source: filer.proto")
public final class SeaweedFilerGrpc {

  private SeaweedFilerGrpc() {}

  public static final String SERVICE_NAME = "filer_pb.SeaweedFiler";

  // Static method descriptors that strictly reflect the proto.
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  @java.lang.Deprecated // Use {@link #getLookupDirectoryEntryMethod()} instead. 
  public static final io.grpc.MethodDescriptor<seaweedfs.filer.protos.SeaweedFilerProtos.LookupDirectoryEntryRequest,
      seaweedfs.filer.protos.SeaweedFilerProtos.LookupDirectoryEntryResponse> METHOD_LOOKUP_DIRECTORY_ENTRY = getLookupDirectoryEntryMethodHelper();

  private static volatile io.grpc.MethodDescriptor<seaweedfs.filer.protos.SeaweedFilerProtos.LookupDirectoryEntryRequest,
      seaweedfs.filer.protos.SeaweedFilerProtos.LookupDirectoryEntryResponse> getLookupDirectoryEntryMethod;

  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static io.grpc.MethodDescriptor<seaweedfs.filer.protos.SeaweedFilerProtos.LookupDirectoryEntryRequest,
      seaweedfs.filer.protos.SeaweedFilerProtos.LookupDirectoryEntryResponse> getLookupDirectoryEntryMethod() {
    return getLookupDirectoryEntryMethodHelper();
  }

  private static io.grpc.MethodDescriptor<seaweedfs.filer.protos.SeaweedFilerProtos.LookupDirectoryEntryRequest,
      seaweedfs.filer.protos.SeaweedFilerProtos.LookupDirectoryEntryResponse> getLookupDirectoryEntryMethodHelper() {
    io.grpc.MethodDescriptor<seaweedfs.filer.protos.SeaweedFilerProtos.LookupDirectoryEntryRequest, seaweedfs.filer.protos.SeaweedFilerProtos.LookupDirectoryEntryResponse> getLookupDirectoryEntryMethod;
    if ((getLookupDirectoryEntryMethod = SeaweedFilerGrpc.getLookupDirectoryEntryMethod) == null) {
      synchronized (SeaweedFilerGrpc.class) {
        if ((getLookupDirectoryEntryMethod = SeaweedFilerGrpc.getLookupDirectoryEntryMethod) == null) {
          SeaweedFilerGrpc.getLookupDirectoryEntryMethod = getLookupDirectoryEntryMethod = 
              io.grpc.MethodDescriptor.<seaweedfs.filer.protos.SeaweedFilerProtos.LookupDirectoryEntryRequest, seaweedfs.filer.protos.SeaweedFilerProtos.LookupDirectoryEntryResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "filer_pb.SeaweedFiler", "LookupDirectoryEntry"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  seaweedfs.filer.protos.SeaweedFilerProtos.LookupDirectoryEntryRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  seaweedfs.filer.protos.SeaweedFilerProtos.LookupDirectoryEntryResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new SeaweedFilerMethodDescriptorSupplier("LookupDirectoryEntry"))
                  .build();
          }
        }
     }
     return getLookupDirectoryEntryMethod;
  }
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  @java.lang.Deprecated // Use {@link #getListEntriesMethod()} instead. 
  public static final io.grpc.MethodDescriptor<seaweedfs.filer.protos.SeaweedFilerProtos.ListEntriesRequest,
      seaweedfs.filer.protos.SeaweedFilerProtos.ListEntriesResponse> METHOD_LIST_ENTRIES = getListEntriesMethodHelper();

  private static volatile io.grpc.MethodDescriptor<seaweedfs.filer.protos.SeaweedFilerProtos.ListEntriesRequest,
      seaweedfs.filer.protos.SeaweedFilerProtos.ListEntriesResponse> getListEntriesMethod;

  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static io.grpc.MethodDescriptor<seaweedfs.filer.protos.SeaweedFilerProtos.ListEntriesRequest,
      seaweedfs.filer.protos.SeaweedFilerProtos.ListEntriesResponse> getListEntriesMethod() {
    return getListEntriesMethodHelper();
  }

  private static io.grpc.MethodDescriptor<seaweedfs.filer.protos.SeaweedFilerProtos.ListEntriesRequest,
      seaweedfs.filer.protos.SeaweedFilerProtos.ListEntriesResponse> getListEntriesMethodHelper() {
    io.grpc.MethodDescriptor<seaweedfs.filer.protos.SeaweedFilerProtos.ListEntriesRequest, seaweedfs.filer.protos.SeaweedFilerProtos.ListEntriesResponse> getListEntriesMethod;
    if ((getListEntriesMethod = SeaweedFilerGrpc.getListEntriesMethod) == null) {
      synchronized (SeaweedFilerGrpc.class) {
        if ((getListEntriesMethod = SeaweedFilerGrpc.getListEntriesMethod) == null) {
          SeaweedFilerGrpc.getListEntriesMethod = getListEntriesMethod = 
              io.grpc.MethodDescriptor.<seaweedfs.filer.protos.SeaweedFilerProtos.ListEntriesRequest, seaweedfs.filer.protos.SeaweedFilerProtos.ListEntriesResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "filer_pb.SeaweedFiler", "ListEntries"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  seaweedfs.filer.protos.SeaweedFilerProtos.ListEntriesRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  seaweedfs.filer.protos.SeaweedFilerProtos.ListEntriesResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new SeaweedFilerMethodDescriptorSupplier("ListEntries"))
                  .build();
          }
        }
     }
     return getListEntriesMethod;
  }
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  @java.lang.Deprecated // Use {@link #getGetFileAttributesMethod()} instead. 
  public static final io.grpc.MethodDescriptor<seaweedfs.filer.protos.SeaweedFilerProtos.GetFileAttributesRequest,
      seaweedfs.filer.protos.SeaweedFilerProtos.GetFileAttributesResponse> METHOD_GET_FILE_ATTRIBUTES = getGetFileAttributesMethodHelper();

  private static volatile io.grpc.MethodDescriptor<seaweedfs.filer.protos.SeaweedFilerProtos.GetFileAttributesRequest,
      seaweedfs.filer.protos.SeaweedFilerProtos.GetFileAttributesResponse> getGetFileAttributesMethod;

  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static io.grpc.MethodDescriptor<seaweedfs.filer.protos.SeaweedFilerProtos.GetFileAttributesRequest,
      seaweedfs.filer.protos.SeaweedFilerProtos.GetFileAttributesResponse> getGetFileAttributesMethod() {
    return getGetFileAttributesMethodHelper();
  }

  private static io.grpc.MethodDescriptor<seaweedfs.filer.protos.SeaweedFilerProtos.GetFileAttributesRequest,
      seaweedfs.filer.protos.SeaweedFilerProtos.GetFileAttributesResponse> getGetFileAttributesMethodHelper() {
    io.grpc.MethodDescriptor<seaweedfs.filer.protos.SeaweedFilerProtos.GetFileAttributesRequest, seaweedfs.filer.protos.SeaweedFilerProtos.GetFileAttributesResponse> getGetFileAttributesMethod;
    if ((getGetFileAttributesMethod = SeaweedFilerGrpc.getGetFileAttributesMethod) == null) {
      synchronized (SeaweedFilerGrpc.class) {
        if ((getGetFileAttributesMethod = SeaweedFilerGrpc.getGetFileAttributesMethod) == null) {
          SeaweedFilerGrpc.getGetFileAttributesMethod = getGetFileAttributesMethod = 
              io.grpc.MethodDescriptor.<seaweedfs.filer.protos.SeaweedFilerProtos.GetFileAttributesRequest, seaweedfs.filer.protos.SeaweedFilerProtos.GetFileAttributesResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "filer_pb.SeaweedFiler", "GetFileAttributes"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  seaweedfs.filer.protos.SeaweedFilerProtos.GetFileAttributesRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  seaweedfs.filer.protos.SeaweedFilerProtos.GetFileAttributesResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new SeaweedFilerMethodDescriptorSupplier("GetFileAttributes"))
                  .build();
          }
        }
     }
     return getGetFileAttributesMethod;
  }
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  @java.lang.Deprecated // Use {@link #getGetFileContentMethod()} instead. 
  public static final io.grpc.MethodDescriptor<seaweedfs.filer.protos.SeaweedFilerProtos.GetFileContentRequest,
      seaweedfs.filer.protos.SeaweedFilerProtos.GetFileContentResponse> METHOD_GET_FILE_CONTENT = getGetFileContentMethodHelper();

  private static volatile io.grpc.MethodDescriptor<seaweedfs.filer.protos.SeaweedFilerProtos.GetFileContentRequest,
      seaweedfs.filer.protos.SeaweedFilerProtos.GetFileContentResponse> getGetFileContentMethod;

  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static io.grpc.MethodDescriptor<seaweedfs.filer.protos.SeaweedFilerProtos.GetFileContentRequest,
      seaweedfs.filer.protos.SeaweedFilerProtos.GetFileContentResponse> getGetFileContentMethod() {
    return getGetFileContentMethodHelper();
  }

  private static io.grpc.MethodDescriptor<seaweedfs.filer.protos.SeaweedFilerProtos.GetFileContentRequest,
      seaweedfs.filer.protos.SeaweedFilerProtos.GetFileContentResponse> getGetFileContentMethodHelper() {
    io.grpc.MethodDescriptor<seaweedfs.filer.protos.SeaweedFilerProtos.GetFileContentRequest, seaweedfs.filer.protos.SeaweedFilerProtos.GetFileContentResponse> getGetFileContentMethod;
    if ((getGetFileContentMethod = SeaweedFilerGrpc.getGetFileContentMethod) == null) {
      synchronized (SeaweedFilerGrpc.class) {
        if ((getGetFileContentMethod = SeaweedFilerGrpc.getGetFileContentMethod) == null) {
          SeaweedFilerGrpc.getGetFileContentMethod = getGetFileContentMethod = 
              io.grpc.MethodDescriptor.<seaweedfs.filer.protos.SeaweedFilerProtos.GetFileContentRequest, seaweedfs.filer.protos.SeaweedFilerProtos.GetFileContentResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "filer_pb.SeaweedFiler", "GetFileContent"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  seaweedfs.filer.protos.SeaweedFilerProtos.GetFileContentRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  seaweedfs.filer.protos.SeaweedFilerProtos.GetFileContentResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new SeaweedFilerMethodDescriptorSupplier("GetFileContent"))
                  .build();
          }
        }
     }
     return getGetFileContentMethod;
  }
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  @java.lang.Deprecated // Use {@link #getDeleteEntryMethod()} instead. 
  public static final io.grpc.MethodDescriptor<seaweedfs.filer.protos.SeaweedFilerProtos.DeleteEntryRequest,
      seaweedfs.filer.protos.SeaweedFilerProtos.DeleteEntryResponse> METHOD_DELETE_ENTRY = getDeleteEntryMethodHelper();

  private static volatile io.grpc.MethodDescriptor<seaweedfs.filer.protos.SeaweedFilerProtos.DeleteEntryRequest,
      seaweedfs.filer.protos.SeaweedFilerProtos.DeleteEntryResponse> getDeleteEntryMethod;

  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static io.grpc.MethodDescriptor<seaweedfs.filer.protos.SeaweedFilerProtos.DeleteEntryRequest,
      seaweedfs.filer.protos.SeaweedFilerProtos.DeleteEntryResponse> getDeleteEntryMethod() {
    return getDeleteEntryMethodHelper();
  }

  private static io.grpc.MethodDescriptor<seaweedfs.filer.protos.SeaweedFilerProtos.DeleteEntryRequest,
      seaweedfs.filer.protos.SeaweedFilerProtos.DeleteEntryResponse> getDeleteEntryMethodHelper() {
    io.grpc.MethodDescriptor<seaweedfs.filer.protos.SeaweedFilerProtos.DeleteEntryRequest, seaweedfs.filer.protos.SeaweedFilerProtos.DeleteEntryResponse> getDeleteEntryMethod;
    if ((getDeleteEntryMethod = SeaweedFilerGrpc.getDeleteEntryMethod) == null) {
      synchronized (SeaweedFilerGrpc.class) {
        if ((getDeleteEntryMethod = SeaweedFilerGrpc.getDeleteEntryMethod) == null) {
          SeaweedFilerGrpc.getDeleteEntryMethod = getDeleteEntryMethod = 
              io.grpc.MethodDescriptor.<seaweedfs.filer.protos.SeaweedFilerProtos.DeleteEntryRequest, seaweedfs.filer.protos.SeaweedFilerProtos.DeleteEntryResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "filer_pb.SeaweedFiler", "DeleteEntry"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  seaweedfs.filer.protos.SeaweedFilerProtos.DeleteEntryRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  seaweedfs.filer.protos.SeaweedFilerProtos.DeleteEntryResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new SeaweedFilerMethodDescriptorSupplier("DeleteEntry"))
                  .build();
          }
        }
     }
     return getDeleteEntryMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static SeaweedFilerStub newStub(io.grpc.Channel channel) {
    return new SeaweedFilerStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static SeaweedFilerBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new SeaweedFilerBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static SeaweedFilerFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new SeaweedFilerFutureStub(channel);
  }

  /**
   */
  public static abstract class SeaweedFilerImplBase implements io.grpc.BindableService {

    /**
     */
    public void lookupDirectoryEntry(seaweedfs.filer.protos.SeaweedFilerProtos.LookupDirectoryEntryRequest request,
        io.grpc.stub.StreamObserver<seaweedfs.filer.protos.SeaweedFilerProtos.LookupDirectoryEntryResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getLookupDirectoryEntryMethodHelper(), responseObserver);
    }

    /**
     */
    public void listEntries(seaweedfs.filer.protos.SeaweedFilerProtos.ListEntriesRequest request,
        io.grpc.stub.StreamObserver<seaweedfs.filer.protos.SeaweedFilerProtos.ListEntriesResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getListEntriesMethodHelper(), responseObserver);
    }

    /**
     */
    public void getFileAttributes(seaweedfs.filer.protos.SeaweedFilerProtos.GetFileAttributesRequest request,
        io.grpc.stub.StreamObserver<seaweedfs.filer.protos.SeaweedFilerProtos.GetFileAttributesResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGetFileAttributesMethodHelper(), responseObserver);
    }

    /**
     */
    public void getFileContent(seaweedfs.filer.protos.SeaweedFilerProtos.GetFileContentRequest request,
        io.grpc.stub.StreamObserver<seaweedfs.filer.protos.SeaweedFilerProtos.GetFileContentResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGetFileContentMethodHelper(), responseObserver);
    }

    /**
     */
    public void deleteEntry(seaweedfs.filer.protos.SeaweedFilerProtos.DeleteEntryRequest request,
        io.grpc.stub.StreamObserver<seaweedfs.filer.protos.SeaweedFilerProtos.DeleteEntryResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getDeleteEntryMethodHelper(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getLookupDirectoryEntryMethodHelper(),
            asyncUnaryCall(
              new MethodHandlers<
                seaweedfs.filer.protos.SeaweedFilerProtos.LookupDirectoryEntryRequest,
                seaweedfs.filer.protos.SeaweedFilerProtos.LookupDirectoryEntryResponse>(
                  this, METHODID_LOOKUP_DIRECTORY_ENTRY)))
          .addMethod(
            getListEntriesMethodHelper(),
            asyncUnaryCall(
              new MethodHandlers<
                seaweedfs.filer.protos.SeaweedFilerProtos.ListEntriesRequest,
                seaweedfs.filer.protos.SeaweedFilerProtos.ListEntriesResponse>(
                  this, METHODID_LIST_ENTRIES)))
          .addMethod(
            getGetFileAttributesMethodHelper(),
            asyncUnaryCall(
              new MethodHandlers<
                seaweedfs.filer.protos.SeaweedFilerProtos.GetFileAttributesRequest,
                seaweedfs.filer.protos.SeaweedFilerProtos.GetFileAttributesResponse>(
                  this, METHODID_GET_FILE_ATTRIBUTES)))
          .addMethod(
            getGetFileContentMethodHelper(),
            asyncUnaryCall(
              new MethodHandlers<
                seaweedfs.filer.protos.SeaweedFilerProtos.GetFileContentRequest,
                seaweedfs.filer.protos.SeaweedFilerProtos.GetFileContentResponse>(
                  this, METHODID_GET_FILE_CONTENT)))
          .addMethod(
            getDeleteEntryMethodHelper(),
            asyncUnaryCall(
              new MethodHandlers<
                seaweedfs.filer.protos.SeaweedFilerProtos.DeleteEntryRequest,
                seaweedfs.filer.protos.SeaweedFilerProtos.DeleteEntryResponse>(
                  this, METHODID_DELETE_ENTRY)))
          .build();
    }
  }

  /**
   */
  public static final class SeaweedFilerStub extends io.grpc.stub.AbstractStub<SeaweedFilerStub> {
    private SeaweedFilerStub(io.grpc.Channel channel) {
      super(channel);
    }

    private SeaweedFilerStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected SeaweedFilerStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new SeaweedFilerStub(channel, callOptions);
    }

    /**
     */
    public void lookupDirectoryEntry(seaweedfs.filer.protos.SeaweedFilerProtos.LookupDirectoryEntryRequest request,
        io.grpc.stub.StreamObserver<seaweedfs.filer.protos.SeaweedFilerProtos.LookupDirectoryEntryResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getLookupDirectoryEntryMethodHelper(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void listEntries(seaweedfs.filer.protos.SeaweedFilerProtos.ListEntriesRequest request,
        io.grpc.stub.StreamObserver<seaweedfs.filer.protos.SeaweedFilerProtos.ListEntriesResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getListEntriesMethodHelper(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getFileAttributes(seaweedfs.filer.protos.SeaweedFilerProtos.GetFileAttributesRequest request,
        io.grpc.stub.StreamObserver<seaweedfs.filer.protos.SeaweedFilerProtos.GetFileAttributesResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetFileAttributesMethodHelper(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getFileContent(seaweedfs.filer.protos.SeaweedFilerProtos.GetFileContentRequest request,
        io.grpc.stub.StreamObserver<seaweedfs.filer.protos.SeaweedFilerProtos.GetFileContentResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetFileContentMethodHelper(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void deleteEntry(seaweedfs.filer.protos.SeaweedFilerProtos.DeleteEntryRequest request,
        io.grpc.stub.StreamObserver<seaweedfs.filer.protos.SeaweedFilerProtos.DeleteEntryResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getDeleteEntryMethodHelper(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class SeaweedFilerBlockingStub extends io.grpc.stub.AbstractStub<SeaweedFilerBlockingStub> {
    private SeaweedFilerBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private SeaweedFilerBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected SeaweedFilerBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new SeaweedFilerBlockingStub(channel, callOptions);
    }

    /**
     */
    public seaweedfs.filer.protos.SeaweedFilerProtos.LookupDirectoryEntryResponse lookupDirectoryEntry(seaweedfs.filer.protos.SeaweedFilerProtos.LookupDirectoryEntryRequest request) {
      return blockingUnaryCall(
          getChannel(), getLookupDirectoryEntryMethodHelper(), getCallOptions(), request);
    }

    /**
     */
    public seaweedfs.filer.protos.SeaweedFilerProtos.ListEntriesResponse listEntries(seaweedfs.filer.protos.SeaweedFilerProtos.ListEntriesRequest request) {
      return blockingUnaryCall(
          getChannel(), getListEntriesMethodHelper(), getCallOptions(), request);
    }

    /**
     */
    public seaweedfs.filer.protos.SeaweedFilerProtos.GetFileAttributesResponse getFileAttributes(seaweedfs.filer.protos.SeaweedFilerProtos.GetFileAttributesRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetFileAttributesMethodHelper(), getCallOptions(), request);
    }

    /**
     */
    public seaweedfs.filer.protos.SeaweedFilerProtos.GetFileContentResponse getFileContent(seaweedfs.filer.protos.SeaweedFilerProtos.GetFileContentRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetFileContentMethodHelper(), getCallOptions(), request);
    }

    /**
     */
    public seaweedfs.filer.protos.SeaweedFilerProtos.DeleteEntryResponse deleteEntry(seaweedfs.filer.protos.SeaweedFilerProtos.DeleteEntryRequest request) {
      return blockingUnaryCall(
          getChannel(), getDeleteEntryMethodHelper(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class SeaweedFilerFutureStub extends io.grpc.stub.AbstractStub<SeaweedFilerFutureStub> {
    private SeaweedFilerFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private SeaweedFilerFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected SeaweedFilerFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new SeaweedFilerFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<seaweedfs.filer.protos.SeaweedFilerProtos.LookupDirectoryEntryResponse> lookupDirectoryEntry(
        seaweedfs.filer.protos.SeaweedFilerProtos.LookupDirectoryEntryRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getLookupDirectoryEntryMethodHelper(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<seaweedfs.filer.protos.SeaweedFilerProtos.ListEntriesResponse> listEntries(
        seaweedfs.filer.protos.SeaweedFilerProtos.ListEntriesRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getListEntriesMethodHelper(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<seaweedfs.filer.protos.SeaweedFilerProtos.GetFileAttributesResponse> getFileAttributes(
        seaweedfs.filer.protos.SeaweedFilerProtos.GetFileAttributesRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetFileAttributesMethodHelper(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<seaweedfs.filer.protos.SeaweedFilerProtos.GetFileContentResponse> getFileContent(
        seaweedfs.filer.protos.SeaweedFilerProtos.GetFileContentRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetFileContentMethodHelper(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<seaweedfs.filer.protos.SeaweedFilerProtos.DeleteEntryResponse> deleteEntry(
        seaweedfs.filer.protos.SeaweedFilerProtos.DeleteEntryRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getDeleteEntryMethodHelper(), getCallOptions()), request);
    }
  }

  private static final int METHODID_LOOKUP_DIRECTORY_ENTRY = 0;
  private static final int METHODID_LIST_ENTRIES = 1;
  private static final int METHODID_GET_FILE_ATTRIBUTES = 2;
  private static final int METHODID_GET_FILE_CONTENT = 3;
  private static final int METHODID_DELETE_ENTRY = 4;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final SeaweedFilerImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(SeaweedFilerImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_LOOKUP_DIRECTORY_ENTRY:
          serviceImpl.lookupDirectoryEntry((seaweedfs.filer.protos.SeaweedFilerProtos.LookupDirectoryEntryRequest) request,
              (io.grpc.stub.StreamObserver<seaweedfs.filer.protos.SeaweedFilerProtos.LookupDirectoryEntryResponse>) responseObserver);
          break;
        case METHODID_LIST_ENTRIES:
          serviceImpl.listEntries((seaweedfs.filer.protos.SeaweedFilerProtos.ListEntriesRequest) request,
              (io.grpc.stub.StreamObserver<seaweedfs.filer.protos.SeaweedFilerProtos.ListEntriesResponse>) responseObserver);
          break;
        case METHODID_GET_FILE_ATTRIBUTES:
          serviceImpl.getFileAttributes((seaweedfs.filer.protos.SeaweedFilerProtos.GetFileAttributesRequest) request,
              (io.grpc.stub.StreamObserver<seaweedfs.filer.protos.SeaweedFilerProtos.GetFileAttributesResponse>) responseObserver);
          break;
        case METHODID_GET_FILE_CONTENT:
          serviceImpl.getFileContent((seaweedfs.filer.protos.SeaweedFilerProtos.GetFileContentRequest) request,
              (io.grpc.stub.StreamObserver<seaweedfs.filer.protos.SeaweedFilerProtos.GetFileContentResponse>) responseObserver);
          break;
        case METHODID_DELETE_ENTRY:
          serviceImpl.deleteEntry((seaweedfs.filer.protos.SeaweedFilerProtos.DeleteEntryRequest) request,
              (io.grpc.stub.StreamObserver<seaweedfs.filer.protos.SeaweedFilerProtos.DeleteEntryResponse>) responseObserver);
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

  private static abstract class SeaweedFilerBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    SeaweedFilerBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return seaweedfs.filer.protos.SeaweedFilerProtos.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("SeaweedFiler");
    }
  }

  private static final class SeaweedFilerFileDescriptorSupplier
      extends SeaweedFilerBaseDescriptorSupplier {
    SeaweedFilerFileDescriptorSupplier() {}
  }

  private static final class SeaweedFilerMethodDescriptorSupplier
      extends SeaweedFilerBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    SeaweedFilerMethodDescriptorSupplier(String methodName) {
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
      synchronized (SeaweedFilerGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new SeaweedFilerFileDescriptorSupplier())
              .addMethod(getLookupDirectoryEntryMethodHelper())
              .addMethod(getListEntriesMethodHelper())
              .addMethod(getGetFileAttributesMethodHelper())
              .addMethod(getGetFileContentMethodHelper())
              .addMethod(getDeleteEntryMethodHelper())
              .build();
        }
      }
    }
    return result;
  }
}
