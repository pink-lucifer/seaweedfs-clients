package seaweedfs.filer.grpc.cleint;

import lombok.extern.slf4j.Slf4j;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.BlockJUnit4ClassRunner;
import seaweedfs.filer.protos.SeaweedFilerProtos;

@Slf4j
@RunWith(BlockJUnit4ClassRunner.class)
public class SeaweedFilerGrpcClientTest {

    @Test
    public void lookupDirectoryEntry() {
        String directory = "avatar/png";
        String name = "awesome-vscode-logo.png";
        SeaweedFilerProtos.LookupDirectoryEntryResponse response =
                TestConfigurations.getPlainTextClient()
                        .lookupDirectoryEntry(SeaweedFilerProtoUtil.newLookupDirectoryEntryRequest(directory, name))
                        .orElse(null);

        Assert.assertNotNull(response);
    }

    @Test
    public void listEntries() {
        SeaweedFilerProtos.ListEntriesResponse response = TestConfigurations.getClient()
                .listEntries(
                        SeaweedFilerProtoUtil.newListEntriesRequest("avatar"))
                .orElse(null);

        Assert.assertNotNull(response);
    }
}
