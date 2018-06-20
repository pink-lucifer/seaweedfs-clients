package seaweedfs.clients;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import io.netty.buffer.ByteBuf;
import io.netty.handler.logging.LogLevel;
import io.reactivex.netty.protocol.http.client.HttpClient;

import java.net.InetSocketAddress;
import java.net.SocketAddress;

public class TestsConfiguration {
    public static final int DEFAULT_PORT = 9006;
    public static final Gson GSON = new GsonBuilder().setLenient().create();

    public static final SocketAddress SOCKET_ADDRESS = InetSocketAddress.createUnresolved("127.0.0.1", DEFAULT_PORT);
    public static final HttpClient<ByteBuf, ByteBuf> HTTP_CLIENT = HttpClient.newClient(SOCKET_ADDRESS)
            .enableWireLogging("seaweedfs-client", LogLevel.INFO);
}
