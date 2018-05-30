package seaweedfs.filer.grpc.cleint;

import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;

public class TestConfigurations {
    private static final String IP = "172.16.89.145";
    private static final int PORT = 9006;

    private static final ManagedChannel PLAINTEXT_MANAGED_CHANNEL = ManagedChannelBuilder.forAddress(IP, PORT).usePlaintext().build();
    private static final ManagedChannel MANAGED_CHANNEL = ManagedChannelBuilder.forAddress(IP, PORT).build();

    public static final SeaweedFilerGrpcClient getPlainTextClient() {
        return new SeaweedFilerGrpcClient(PLAINTEXT_MANAGED_CHANNEL, null);
    }

    public static final SeaweedFilerGrpcClient getClient() {
        return new SeaweedFilerGrpcClient(MANAGED_CHANNEL, null);
    }
}
