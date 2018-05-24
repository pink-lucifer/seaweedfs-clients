package seaweedfs.filer.grpc.cleint;

import io.grpc.ClientInterceptor;
import io.grpc.ManagedChannel;
import lombok.extern.slf4j.Slf4j;
import seaweedfs.filer.protos.SeaweedFilerGrpc;
import seaweedfs.filer.protos.SeaweedFilerProtos;

import java.util.List;
import java.util.Optional;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

@Slf4j
public class SeaweedFilerGrpcClient {
    private ManagedChannel managedChannel;
    private List<ClientInterceptor> clientInterceptors;

    public Optional<SeaweedFilerProtos.GetFileAttributesResponse> loadBankInfoByBankName(SeaweedFilerProtos.GetFileAttributesRequest request) {
        log.info("BankInfoGrpcServiceClient.loadBankInfoByBankName starting ... ... GetBankInfoByBankNameRequest {}", request);
        try {
            SeaweedFilerProtos.GetFileAttributesResponse response = SeaweedFilerGrpc.newFutureStub(managedChannel)
                    .withInterceptors(clientInterceptors)
                    .getBankInfoByBankName(request).get(60, TimeUnit.SECONDS);

            log.info("BankInfoGrpcServiceClient.loadBankInfoByBankName done ... ... GetBankInfoByBankNameResponse {}", request);
            return Optional.ofNullable(response);
        } catch (InterruptedException | ExecutionException | TimeoutException e) {
            if (log.isDebugEnabled()) {
                e.printStackTrace();
            }
            log.error("BankInfoGrpcServiceClient.loadBankInfoByBankName .. exception {}", e.getLocalizedMessage());
            return Optional.empty();
        }
    }


}
