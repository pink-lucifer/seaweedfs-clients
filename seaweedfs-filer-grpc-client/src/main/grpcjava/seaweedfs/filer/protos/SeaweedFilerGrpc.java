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
  @java.lang.Deprecated // Use {@link #getGetEntryAttributesMethod()} instead. 
  public static final io.grpc.MethodDescriptor<seaweedfs.filer.protos.SeaweedFilerProtos.GetEntryAttributesRequest,
      seaweedfs.filer.protos.SeaweedFilerProtos.GetEntryAttributesResponse> METHOD_GET_ENTRY_ATTRIBUTES = getGetEntryAttributesMethodHelper();

  private static volatile io.grpc.MethodDescriptor<seaweedfs.filer.protos.SeaweedFilerProtos.GetEntryAttributesRequest,
      seaweedfs.filer.protos.SeaweedFilerProtos.GetEntryAttributesResponse> getGetEntryAttributesMethod;

  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static io.grpc.MethodDescriptor<seaweedfs.filer.protos.SeaweedFilerProtos.GetEntryAttributesRequest,
      seaweedfs.filer.protos.SeaweedFilerProtos.GetEntryAttributesResponse> getGetEntryAttributesMethod() {
    return getGetEntryAttributesMethodHelper();
  }

  private static io.grpc.MethodDescriptor<seaweedfs.filer.protos.SeaweedFilerProtos.GetEntryAttributesRequest,
      seaweedfs.filer.protos.SeaweedFilerProtos.GetEntryAttributesResponse> getGetEntryAttributesMethodHelper() {
    io.grpc.MethodDescriptor<seaweedfs.filer.protos.SeaweedFilerProtos.GetEntryAttributesRequest, seaweedfs.filer.protos.SeaweedFilerProtos.GetEntryAttributesResponse> getGetEntryAttributesMethod;
    if ((getGetEntryAttributesMethod = SeaweedFilerGrpc.getGetEntryAttributesMethod) == null) {
      synchronized (SeaweedFilerGrpc.class) {
        if ((getGetEntryAttributesMethod = SeaweedFilerGrpc.getGetEntryAttributesMethod) == null) {
          SeaweedFilerGrpc.getGetEntryAttributesMethod = getGetEntryAttributesMethod = 
              io.grpc.MethodDescriptor.<seaweedfs.filer.protos.SeaweedFilerProtos.GetEntryAttributesRequest, seaweedfs.filer.protos.SeaweedFilerProtos.GetEntryAttributesResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "filer_pb.SeaweedFiler", "GetEntryAttributes"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  seaweedfs.filer.protos.SeaweedFilerProtos.GetEntryAttributesRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  seaweedfs.filer.protos.SeaweedFilerProtos.GetEntryAttributesResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new SeaweedFilerMethodDescriptorSupplier("GetEntryAttributes"))
                  .build();
          }
        }
     }
     return getGetEntryAttributesMethod;
  }
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  @java.lang.Deprecated // Use {@link #getCreateEntryMethod()} instead. 
  public static final io.grpc.MethodDescriptor<seaweedfs.filer.protos.SeaweedFilerProtos.CreateEntryRequest,
      seaweedfs.filer.protos.SeaweedFilerProtos.CreateEntryResponse> METHOD_CREATE_ENTRY = getCreateEntryMethodHelper();

  private static volatile io.grpc.MethodDescriptor<seaweedfs.filer.protos.SeaweedFilerProtos.CreateEntryRequest,
      seaweedfs.filer.protos.SeaweedFilerProtos.CreateEntryResponse> getCreateEntryMethod;

  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static io.grpc.MethodDescriptor<seaweedfs.filer.protos.SeaweedFilerProtos.CreateEntryRequest,
      seaweedfs.filer.protos.SeaweedFilerProtos.CreateEntryResponse> getCreateEntryMethod() {
    return getCreateEntryMethodHelper();
  }

  private static io.grpc.MethodDescriptor<seaweedfs.filer.protos.SeaweedFilerProtos.CreateEntryRequest,
      seaweedfs.filer.protos.SeaweedFilerProtos.CreateEntryResponse> getCreateEntryMethodHelper() {
    io.grpc.MethodDescriptor<seaweedfs.filer.protos.SeaweedFilerProtos.CreateEntryRequest, seaweedfs.filer.protos.SeaweedFilerProtos.CreateEntryResponse> getCreateEntryMethod;
    if ((getCreateEntryMethod = SeaweedFilerGrpc.getCreateEntryMethod) == null) {
      synchronized (SeaweedFilerGrpc.class) {
        if ((getCreateEntryMethod = SeaweedFilerGrpc.getCreateEntryMethod) == null) {
          SeaweedFilerGrpc.getCreateEntryMethod = getCreateEntryMethod = 
              io.grpc.MethodDescriptor.<seaweedfs.filer.protos.SeaweedFilerProtos.CreateEntryRequest, seaweedfs.filer.protos.SeaweedFilerProtos.CreateEntryResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "filer_pb.SeaweedFiler", "CreateEntry"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  seaweedfs.filer.protos.SeaweedFilerProtos.CreateEntryRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  seaweedfs.filer.protos.SeaweedFilerProtos.CreateEntryResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new SeaweedFilerMethodDescriptorSupplier("CreateEntry"))
                  .build();
          }
        }
     }
     return getCreateEntryMethod;
  }
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  @java.lang.Deprecated // Use {@link #getUpdateEntryMethod()} instead. 
  public static final io.grpc.MethodDescriptor<seaweedfs.filer.protos.SeaweedFilerProtos.UpdateEntryRequest,
      seaweedfs.filer.protos.SeaweedFilerProtos.UpdateEntryResponse> METHOD_UPDATE_ENTRY = getUpdateEntryMethodHelper();

  private static volatile io.grpc.MethodDescriptor<seaweedfs.filer.protos.SeaweedFilerProtos.UpdateEntryRequest,
      seaweedfs.filer.protos.SeaweedFilerProtos.UpdateEntryResponse> getUpdateEntryMethod;

  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static io.grpc.MethodDescriptor<seaweedfs.filer.protos.SeaweedFilerProtos.UpdateEntryRequest,
      seaweedfs.filer.protos.SeaweedFilerProtos.UpdateEntryResponse> getUpdateEntryMethod() {
    return getUpdateEntryMethodHelper();
  }

  private static io.grpc.MethodDescriptor<seaweedfs.filer.protos.SeaweedFilerProtos.UpdateEntryRequest,
      seaweedfs.filer.protos.SeaweedFilerProtos.UpdateEntryResponse> getUpdateEntryMethodHelper() {
    io.grpc.MethodDescriptor<seaweedfs.filer.protos.SeaweedFilerProtos.UpdateEntryRequest, seaweedfs.filer.protos.SeaweedFilerProtos.UpdateEntryResponse> getUpdateEntryMethod;
    if ((getUpdateEntryMethod = SeaweedFilerGrpc.getUpdateEntryMethod) == null) {
      synchronized (SeaweedFilerGrpc.class) {
        if ((getUpdateEntryMethod = SeaweedFilerGrpc.getUpdateEntryMethod) == null) {
          SeaweedFilerGrpc.getUpdateEntryMethod = getUpdateEntryMethod = 
              io.grpc.MethodDescriptor.<seaweedfs.filer.protos.SeaweedFilerProtos.UpdateEntryRequest, seaweedfs.filer.protos.SeaweedFilerProtos.UpdateEntryResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "filer_pb.SeaweedFiler", "UpdateEntry"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  seaweedfs.filer.protos.SeaweedFilerProtos.UpdateEntryRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  seaweedfs.filer.protos.SeaweedFilerProtos.UpdateEntryResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new SeaweedFilerMethodDescriptorSupplier("UpdateEntry"))
                  .build();
          }
        }
     }
     return getUpdateEntryMethod;
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
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  @java.lang.Deprecated // Use {@link #getAssignVolumeMethod()} instead. 
  public static final io.grpc.MethodDescriptor<seaweedfs.filer.protos.SeaweedFilerProtos.AssignVolumeRequest,
      seaweedfs.filer.protos.SeaweedFilerProtos.AssignVolumeResponse> METHOD_ASSIGN_VOLUME = getAssignVolumeMethodHelper();

  private static volatile io.grpc.MethodDescriptor<seaweedfs.filer.protos.SeaweedFilerProtos.AssignVolumeRequest,
      seaweedfs.filer.protos.SeaweedFilerProtos.AssignVolumeResponse> getAssignVolumeMethod;

  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static io.grpc.MethodDescriptor<seaweedfs.filer.protos.SeaweedFilerProtos.AssignVolumeRequest,
      seaweedfs.filer.protos.SeaweedFilerProtos.AssignVolumeResponse> getAssignVolumeMethod() {
    return getAssignVolumeMethodHelper();
  }

  private static io.grpc.MethodDescriptor<seaweedfs.filer.protos.SeaweedFilerProtos.AssignVolumeRequest,
      seaweedfs.filer.protos.SeaweedFilerProtos.AssignVolumeResponse> getAssignVolumeMethodHelper() {
    io.grpc.MethodDescriptor<seaweedfs.filer.protos.SeaweedFilerProtos.AssignVolumeRequest, seaweedfs.filer.protos.SeaweedFilerProtos.AssignVolumeResponse> getAssignVolumeMethod;
    if ((getAssignVolumeMethod = SeaweedFilerGrpc.getAssignVolumeMethod) == null) {
      synchronized (SeaweedFilerGrpc.class) {
        if ((getAssignVolumeMethod = SeaweedFilerGrpc.getAssignVolumeMethod) == null) {
          SeaweedFilerGrpc.getAssignVolumeMethod = getAssignVolumeMethod = 
              io.grpc.MethodDescriptor.<seaweedfs.filer.protos.SeaweedFilerProtos.AssignVolumeRequest, seaweedfs.filer.protos.SeaweedFilerProtos.AssignVolumeResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "filer_pb.SeaweedFiler", "AssignVolume"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  seaweedfs.filer.protos.SeaweedFilerProtos.AssignVolumeRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  seaweedfs.filer.protos.SeaweedFilerProtos.AssignVolumeResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new SeaweedFilerMethodDescriptorSupplier("AssignVolume"))
                  .build();
          }
        }
     }
     return getAssignVolumeMethod;
  }
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  @java.lang.Deprecated // Use {@link #getLookupVolumeMethod()} instead. 
  public static final io.grpc.MethodDescriptor<seaweedfs.filer.protos.SeaweedFilerProtos.LookupVolumeRequest,
      seaweedfs.filer.protos.SeaweedFilerProtos.LookupVolumeResponse> METHOD_LOOKUP_VOLUME = getLookupVolumeMethodHelper();

  private static volatile io.grpc.MethodDescriptor<seaweedfs.filer.protos.SeaweedFilerProtos.LookupVolumeRequest,
      seaweedfs.filer.protos.SeaweedFilerProtos.LookupVolumeResponse> getLookupVolumeMethod;

  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static io.grpc.MethodDescriptor<seaweedfs.filer.protos.SeaweedFilerProtos.LookupVolumeRequest,
      seaweedfs.filer.protos.SeaweedFilerProtos.LookupVolumeResponse> getLookupVolumeMethod() {
    return getLookupVolumeMethodHelper();
  }

  private static io.grpc.MethodDescriptor<seaweedfs.filer.protos.SeaweedFilerProtos.LookupVolumeRequest,
      seaweedfs.filer.protos.SeaweedFilerProtos.LookupVolumeResponse> getLookupVolumeMethodHelper() {
    io.grpc.MethodDescriptor<seaweedfs.filer.protos.SeaweedFilerProtos.LookupVolumeRequest, seaweedfs.filer.protos.SeaweedFilerProtos.LookupVolumeResponse> getLookupVolumeMethod;
    if ((getLookupVolumeMethod = SeaweedFilerGrpc.getLookupVolumeMethod) == null) {
      synchronized (SeaweedFilerGrpc.class) {
        if ((getLookupVolumeMethod = SeaweedFilerGrpc.getLookupVolumeMethod) == null) {
          SeaweedFilerGrpc.getLookupVolumeMethod = getLookupVolumeMethod = 
              io.grpc.MethodDescriptor.<seaweedfs.filer.protos.SeaweedFilerProtos.LookupVolumeRequest, seaweedfs.filer.protos.SeaweedFilerProtos.LookupVolumeResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "filer_pb.SeaweedFiler", "LookupVolume"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  seaweedfs.filer.protos.SeaweedFilerProtos.LookupVolumeRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  seaweedfs.filer.protos.SeaweedFilerProtos.LookupVolumeResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new SeaweedFilerMethodDescriptorSupplier("LookupVolume"))
                  .build();
          }
        }
     }
     return getLookupVolumeMethod;
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
    public void getEntryAttributes(seaweedfs.filer.protos.SeaweedFilerProtos.GetEntryAttributesRequest request,
        io.grpc.stub.StreamObserver<seaweedfs.filer.protos.SeaweedFilerProtos.GetEntryAttributesResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGetEntryAttributesMethodHelper(), responseObserver);
    }

    /**
     */
    public void createEntry(seaweedfs.filer.protos.SeaweedFilerProtos.CreateEntryRequest request,
        io.grpc.stub.StreamObserver<seaweedfs.filer.protos.SeaweedFilerProtos.CreateEntryResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getCreateEntryMethodHelper(), responseObserver);
    }

    /**
     */
    public void updateEntry(seaweedfs.filer.protos.SeaweedFilerProtos.UpdateEntryRequest request,
        io.grpc.stub.StreamObserver<seaweedfs.filer.protos.SeaweedFilerProtos.UpdateEntryResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getUpdateEntryMethodHelper(), responseObserver);
    }

    /**
     */
    public void deleteEntry(seaweedfs.filer.protos.SeaweedFilerProtos.DeleteEntryRequest request,
        io.grpc.stub.StreamObserver<seaweedfs.filer.protos.SeaweedFilerProtos.DeleteEntryResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getDeleteEntryMethodHelper(), responseObserver);
    }

    /**
     */
    public void assignVolume(seaweedfs.filer.protos.SeaweedFilerProtos.AssignVolumeRequest request,
        io.grpc.stub.StreamObserver<seaweedfs.filer.protos.SeaweedFilerProtos.AssignVolumeResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getAssignVolumeMethodHelper(), responseObserver);
    }

    /**
     */
    public void lookupVolume(seaweedfs.filer.protos.SeaweedFilerProtos.LookupVolumeRequest request,
        io.grpc.stub.StreamObserver<seaweedfs.filer.protos.SeaweedFilerProtos.LookupVolumeResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getLookupVolumeMethodHelper(), responseObserver);
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
            getGetEntryAttributesMethodHelper(),
            asyncUnaryCall(
              new MethodHandlers<
                seaweedfs.filer.protos.SeaweedFilerProtos.GetEntryAttributesRequest,
                seaweedfs.filer.protos.SeaweedFilerProtos.GetEntryAttributesResponse>(
                  this, METHODID_GET_ENTRY_ATTRIBUTES)))
          .addMethod(
            getCreateEntryMethodHelper(),
            asyncUnaryCall(
              new MethodHandlers<
                seaweedfs.filer.protos.SeaweedFilerProtos.CreateEntryRequest,
                seaweedfs.filer.protos.SeaweedFilerProtos.CreateEntryResponse>(
                  this, METHODID_CREATE_ENTRY)))
          .addMethod(
            getUpdateEntryMethodHelper(),
            asyncUnaryCall(
              new MethodHandlers<
                seaweedfs.filer.protos.SeaweedFilerProtos.UpdateEntryRequest,
                seaweedfs.filer.protos.SeaweedFilerProtos.UpdateEntryResponse>(
                  this, METHODID_UPDATE_ENTRY)))
          .addMethod(
            getDeleteEntryMethodHelper(),
            asyncUnaryCall(
              new MethodHandlers<
                seaweedfs.filer.protos.SeaweedFilerProtos.DeleteEntryRequest,
                seaweedfs.filer.protos.SeaweedFilerProtos.DeleteEntryResponse>(
                  this, METHODID_DELETE_ENTRY)))
          .addMethod(
            getAssignVolumeMethodHelper(),
            asyncUnaryCall(
              new MethodHandlers<
                seaweedfs.filer.protos.SeaweedFilerProtos.AssignVolumeRequest,
                seaweedfs.filer.protos.SeaweedFilerProtos.AssignVolumeResponse>(
                  this, METHODID_ASSIGN_VOLUME)))
          .addMethod(
            getLookupVolumeMethodHelper(),
            asyncUnaryCall(
              new MethodHandlers<
                seaweedfs.filer.protos.SeaweedFilerProtos.LookupVolumeRequest,
                seaweedfs.filer.protos.SeaweedFilerProtos.LookupVolumeResponse>(
                  this, METHODID_LOOKUP_VOLUME)))
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
    public void getEntryAttributes(seaweedfs.filer.protos.SeaweedFilerProtos.GetEntryAttributesRequest request,
        io.grpc.stub.StreamObserver<seaweedfs.filer.protos.SeaweedFilerProtos.GetEntryAttributesResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetEntryAttributesMethodHelper(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void createEntry(seaweedfs.filer.protos.SeaweedFilerProtos.CreateEntryRequest request,
        io.grpc.stub.StreamObserver<seaweedfs.filer.protos.SeaweedFilerProtos.CreateEntryResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getCreateEntryMethodHelper(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void updateEntry(seaweedfs.filer.protos.SeaweedFilerProtos.UpdateEntryRequest request,
        io.grpc.stub.StreamObserver<seaweedfs.filer.protos.SeaweedFilerProtos.UpdateEntryResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getUpdateEntryMethodHelper(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void deleteEntry(seaweedfs.filer.protos.SeaweedFilerProtos.DeleteEntryRequest request,
        io.grpc.stub.StreamObserver<seaweedfs.filer.protos.SeaweedFilerProtos.DeleteEntryResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getDeleteEntryMethodHelper(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void assignVolume(seaweedfs.filer.protos.SeaweedFilerProtos.AssignVolumeRequest request,
        io.grpc.stub.StreamObserver<seaweedfs.filer.protos.SeaweedFilerProtos.AssignVolumeResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getAssignVolumeMethodHelper(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void lookupVolume(seaweedfs.filer.protos.SeaweedFilerProtos.LookupVolumeRequest request,
        io.grpc.stub.StreamObserver<seaweedfs.filer.protos.SeaweedFilerProtos.LookupVolumeResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getLookupVolumeMethodHelper(), getCallOptions()), request, responseObserver);
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
    public seaweedfs.filer.protos.SeaweedFilerProtos.GetEntryAttributesResponse getEntryAttributes(seaweedfs.filer.protos.SeaweedFilerProtos.GetEntryAttributesRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetEntryAttributesMethodHelper(), getCallOptions(), request);
    }

    /**
     */
    public seaweedfs.filer.protos.SeaweedFilerProtos.CreateEntryResponse createEntry(seaweedfs.filer.protos.SeaweedFilerProtos.CreateEntryRequest request) {
      return blockingUnaryCall(
          getChannel(), getCreateEntryMethodHelper(), getCallOptions(), request);
    }

    /**
     */
    public seaweedfs.filer.protos.SeaweedFilerProtos.UpdateEntryResponse updateEntry(seaweedfs.filer.protos.SeaweedFilerProtos.UpdateEntryRequest request) {
      return blockingUnaryCall(
          getChannel(), getUpdateEntryMethodHelper(), getCallOptions(), request);
    }

    /**
     */
    public seaweedfs.filer.protos.SeaweedFilerProtos.DeleteEntryResponse deleteEntry(seaweedfs.filer.protos.SeaweedFilerProtos.DeleteEntryRequest request) {
      return blockingUnaryCall(
          getChannel(), getDeleteEntryMethodHelper(), getCallOptions(), request);
    }

    /**
     */
    public seaweedfs.filer.protos.SeaweedFilerProtos.AssignVolumeResponse assignVolume(seaweedfs.filer.protos.SeaweedFilerProtos.AssignVolumeRequest request) {
      return blockingUnaryCall(
          getChannel(), getAssignVolumeMethodHelper(), getCallOptions(), request);
    }

    /**
     */
    public seaweedfs.filer.protos.SeaweedFilerProtos.LookupVolumeResponse lookupVolume(seaweedfs.filer.protos.SeaweedFilerProtos.LookupVolumeRequest request) {
      return blockingUnaryCall(
          getChannel(), getLookupVolumeMethodHelper(), getCallOptions(), request);
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
    public com.google.common.util.concurrent.ListenableFuture<seaweedfs.filer.protos.SeaweedFilerProtos.GetEntryAttributesResponse> getEntryAttributes(
        seaweedfs.filer.protos.SeaweedFilerProtos.GetEntryAttributesRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetEntryAttributesMethodHelper(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<seaweedfs.filer.protos.SeaweedFilerProtos.CreateEntryResponse> createEntry(
        seaweedfs.filer.protos.SeaweedFilerProtos.CreateEntryRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getCreateEntryMethodHelper(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<seaweedfs.filer.protos.SeaweedFilerProtos.UpdateEntryResponse> updateEntry(
        seaweedfs.filer.protos.SeaweedFilerProtos.UpdateEntryRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getUpdateEntryMethodHelper(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<seaweedfs.filer.protos.SeaweedFilerProtos.DeleteEntryResponse> deleteEntry(
        seaweedfs.filer.protos.SeaweedFilerProtos.DeleteEntryRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getDeleteEntryMethodHelper(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<seaweedfs.filer.protos.SeaweedFilerProtos.AssignVolumeResponse> assignVolume(
        seaweedfs.filer.protos.SeaweedFilerProtos.AssignVolumeRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getAssignVolumeMethodHelper(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<seaweedfs.filer.protos.SeaweedFilerProtos.LookupVolumeResponse> lookupVolume(
        seaweedfs.filer.protos.SeaweedFilerProtos.LookupVolumeRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getLookupVolumeMethodHelper(), getCallOptions()), request);
    }
  }

  private static final int METHODID_LOOKUP_DIRECTORY_ENTRY = 0;
  private static final int METHODID_LIST_ENTRIES = 1;
  private static final int METHODID_GET_ENTRY_ATTRIBUTES = 2;
  private static final int METHODID_CREATE_ENTRY = 3;
  private static final int METHODID_UPDATE_ENTRY = 4;
  private static final int METHODID_DELETE_ENTRY = 5;
  private static final int METHODID_ASSIGN_VOLUME = 6;
  private static final int METHODID_LOOKUP_VOLUME = 7;

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
        case METHODID_GET_ENTRY_ATTRIBUTES:
          serviceImpl.getEntryAttributes((seaweedfs.filer.protos.SeaweedFilerProtos.GetEntryAttributesRequest) request,
              (io.grpc.stub.StreamObserver<seaweedfs.filer.protos.SeaweedFilerProtos.GetEntryAttributesResponse>) responseObserver);
          break;
        case METHODID_CREATE_ENTRY:
          serviceImpl.createEntry((seaweedfs.filer.protos.SeaweedFilerProtos.CreateEntryRequest) request,
              (io.grpc.stub.StreamObserver<seaweedfs.filer.protos.SeaweedFilerProtos.CreateEntryResponse>) responseObserver);
          break;
        case METHODID_UPDATE_ENTRY:
          serviceImpl.updateEntry((seaweedfs.filer.protos.SeaweedFilerProtos.UpdateEntryRequest) request,
              (io.grpc.stub.StreamObserver<seaweedfs.filer.protos.SeaweedFilerProtos.UpdateEntryResponse>) responseObserver);
          break;
        case METHODID_DELETE_ENTRY:
          serviceImpl.deleteEntry((seaweedfs.filer.protos.SeaweedFilerProtos.DeleteEntryRequest) request,
              (io.grpc.stub.StreamObserver<seaweedfs.filer.protos.SeaweedFilerProtos.DeleteEntryResponse>) responseObserver);
          break;
        case METHODID_ASSIGN_VOLUME:
          serviceImpl.assignVolume((seaweedfs.filer.protos.SeaweedFilerProtos.AssignVolumeRequest) request,
              (io.grpc.stub.StreamObserver<seaweedfs.filer.protos.SeaweedFilerProtos.AssignVolumeResponse>) responseObserver);
          break;
        case METHODID_LOOKUP_VOLUME:
          serviceImpl.lookupVolume((seaweedfs.filer.protos.SeaweedFilerProtos.LookupVolumeRequest) request,
              (io.grpc.stub.StreamObserver<seaweedfs.filer.protos.SeaweedFilerProtos.LookupVolumeResponse>) responseObserver);
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
              .addMethod(getGetEntryAttributesMethodHelper())
              .addMethod(getCreateEntryMethodHelper())
              .addMethod(getUpdateEntryMethodHelper())
              .addMethod(getDeleteEntryMethodHelper())
              .addMethod(getAssignVolumeMethodHelper())
              .addMethod(getLookupVolumeMethodHelper())
              .build();
        }
      }
    }
    return result;
  }
}
