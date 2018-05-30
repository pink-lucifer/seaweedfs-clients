package seaweedfs.filer.grpc.cleint;

import io.grpc.ClientInterceptor;
import io.grpc.ManagedChannel;
import lombok.extern.slf4j.Slf4j;
import seaweedfs.filer.protos.SeaweedFilerGrpc;
import seaweedfs.filer.protos.SeaweedFilerProtos;

import javax.annotation.Nullable;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

@Slf4j
public class SeaweedFilerGrpcClient {
    private ManagedChannel managedChannel;
    private List<ClientInterceptor> clientInterceptors;

    public SeaweedFilerGrpcClient(ManagedChannel managedChannel, @Nullable List<ClientInterceptor> clientInterceptors) {
        this.managedChannel = managedChannel;
        this.clientInterceptors = clientInterceptors;
    }

    public Optional<SeaweedFilerProtos.LookupDirectoryEntryResponse> lookupDirectoryEntry(SeaweedFilerProtos.LookupDirectoryEntryRequest request) {
        log.info("SeaweedFilerGrpcClient.lookupDirectoryEntry starting ... ... LookupDirectoryEntryRequest {}", request);
        try {
            SeaweedFilerProtos.LookupDirectoryEntryResponse response = newFutureStub()
                    .lookupDirectoryEntry(request).get(60, TimeUnit.SECONDS);

            log.info("SeaweedFilerGrpcClient.lookupDirectoryEntry done ... ... LookupDirectoryEntryResponse {}", request);
            return Optional.ofNullable(response);
        } catch (InterruptedException | ExecutionException | TimeoutException e) {
            if (log.isDebugEnabled()) {
                e.printStackTrace();
            }
            log.error("SeaweedFilerGrpcClient.lookupDirectoryEntry .. exception {}", e.getLocalizedMessage());
            return Optional.empty();
        }
    }

    public Optional<SeaweedFilerProtos.ListEntriesResponse> listEntries(SeaweedFilerProtos.ListEntriesRequest request) {
        log.info("SeaweedFilerGrpcClient.listEntries starting ... ... ListEntriesRequest {}", request);
        try {
            SeaweedFilerProtos.ListEntriesResponse response = newFutureStub()
                    .listEntries(request).get(60, TimeUnit.SECONDS);

            log.info("SeaweedFilerGrpcClient.listEntries done ... ... ListEntriesResponse {}", request);
            return Optional.ofNullable(response);
        } catch (InterruptedException | ExecutionException | TimeoutException e) {
            if (log.isDebugEnabled()) {
                e.printStackTrace();
            }
            log.error("SeaweedFilerGrpcClient.listEntries .. exception {}", e.getLocalizedMessage());
            return Optional.empty();
        }
    }

    public Optional<SeaweedFilerProtos.GetFileAttributesResponse> getFileAttributes(SeaweedFilerProtos.GetFileAttributesRequest request) {
        log.info("SeaweedFilerGrpcClient.getFileAttributes starting ... ... GetFileAttributesRequest {}", request);
        try {
            SeaweedFilerProtos.GetFileAttributesResponse response = newFutureStub()
                    .getFileAttributes(request).get(60, TimeUnit.SECONDS);

            log.info("SeaweedFilerGrpcClient.getFileAttributes done ... ... GetFileAttributesResponse {}", request);
            return Optional.ofNullable(response);
        } catch (InterruptedException | ExecutionException | TimeoutException e) {
            if (log.isDebugEnabled()) {
                e.printStackTrace();
            }
            log.error("SeaweedFilerGrpcClient.getFileAttributes .. exception {}", e.getLocalizedMessage());
            return Optional.empty();
        }
    }

    public Optional<SeaweedFilerProtos.GetFileContentResponse> getFileContent(SeaweedFilerProtos.GetFileContentRequest request) {
        log.info("SeaweedFilerGrpcClient.getFileContent starting ... ... GetFileContentRequest {}", request);
        try {
            SeaweedFilerProtos.GetFileContentResponse response = newFutureStub()
                    .getFileContent(request).get(60, TimeUnit.SECONDS);

            log.info("SeaweedFilerGrpcClient.getFileContent done ... ... GetFileContentResponse {}", request);
            return Optional.ofNullable(response);
        } catch (InterruptedException | ExecutionException | TimeoutException e) {
            if (log.isDebugEnabled()) {
                e.printStackTrace();
            }
            log.error("SeaweedFilerGrpcClient.getFileContent .. exception {}", e.getLocalizedMessage());
            return Optional.empty();
        }
    }

    public Optional<SeaweedFilerProtos.DeleteEntryResponse> deleteEntry(SeaweedFilerProtos.DeleteEntryRequest request) {
        log.info("SeaweedFilerGrpcClient.deleteEntry starting ... ... DeleteEntryRequest {}", request);
        try {
            SeaweedFilerProtos.DeleteEntryResponse response = newFutureStub()
                    .deleteEntry(request).get(60, TimeUnit.SECONDS);

            log.info("SeaweedFilerGrpcClient.deleteEntry done ... ... DeleteEntryResponse {}", request);
            return Optional.ofNullable(response);
        } catch (InterruptedException | ExecutionException | TimeoutException e) {
            if (log.isDebugEnabled()) {
                e.printStackTrace();
            }
            log.error("SeaweedFilerGrpcClient.deleteEntry .. exception {}", e.getLocalizedMessage());
            return Optional.empty();
        }
    }

    private SeaweedFilerGrpc.SeaweedFilerFutureStub newFutureStub(){
        SeaweedFilerGrpc.SeaweedFilerFutureStub futureStub = SeaweedFilerGrpc.newFutureStub(managedChannel);
        if(Objects.nonNull(clientInterceptors)){
            clientInterceptors.forEach(c->futureStub.withInterceptors(c));
        }
        return futureStub;
    }

}
