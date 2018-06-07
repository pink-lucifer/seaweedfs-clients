package seaweedfs.filer.grpc.cleint;

import com.google.common.base.Strings;
import seaweedfs.filer.protos.SeaweedFilerProtos;

public class SeaweedFilerProtoUtil {

    public static SeaweedFilerProtos.LookupDirectoryEntryRequest newLookupDirectoryEntryRequest (String directory, String name) throws IllegalArgumentException {
        if(Strings.isNullOrEmpty(directory)){
            throw new IllegalArgumentException("directory can not be null or empty");
        }
        if(Strings.isNullOrEmpty(name)){
            throw new IllegalArgumentException("name can not be null or empty");
        }

        return SeaweedFilerProtos.LookupDirectoryEntryRequest.newBuilder()
                .setDirectory(directory)
                .setName(name)
                .build();
    }

    public static SeaweedFilerProtos.ListEntriesRequest newListEntriesRequest (String directory) throws IllegalArgumentException {
        if(Strings.isNullOrEmpty(directory)){
            throw new IllegalArgumentException("directory can not be null or empty");
        }

        return SeaweedFilerProtos.ListEntriesRequest.newBuilder()
                .setDirectory(directory)
                .build();
    }

    public static SeaweedFilerProtos.GetEntryAttributesRequest newGetEntryAttributesRequest (String parentDir, String name, String fileId) throws IllegalArgumentException {
        if(Strings.isNullOrEmpty(parentDir)){
            throw new IllegalArgumentException("parentDir can not be null or empty");
        }
        if(Strings.isNullOrEmpty(name)){
            throw new IllegalArgumentException("name can not be null or empty");
        }
        if(Strings.isNullOrEmpty(fileId)){
            throw new IllegalArgumentException("fileId can not be null or empty");
        }

        return SeaweedFilerProtos.GetEntryAttributesRequest.newBuilder()
                .setParentDir(parentDir)
                .setName(name)
                .setFileId(fileId)
                .build();
    }

    public static SeaweedFilerProtos.GetFileContentRequest newGetFileContentRequest (String fileId) throws IllegalArgumentException {
        if(Strings.isNullOrEmpty(fileId)){
            throw new IllegalArgumentException("fileId can not be null or empty");
        }

        return SeaweedFilerProtos.GetFileContentRequest.newBuilder()
                .setFileId(fileId)
                .build();
    }

    public static SeaweedFilerProtos.DeleteEntryRequest newDeleteEntryRequest (String directory, String name, boolean isDirectory, boolean isDeleteData) throws IllegalArgumentException {
        if(Strings.isNullOrEmpty(directory)){
            throw new IllegalArgumentException("directory can not be null or empty");
        }
        if(Strings.isNullOrEmpty(name)){
            throw new IllegalArgumentException("name can not be null or empty");
        }

        return SeaweedFilerProtos.DeleteEntryRequest.newBuilder()
                .setDirectory(directory)
                .setName(name)
                .setIsDirectory(isDirectory)
                .setIsDeleteData(isDeleteData)
                .build();
    }
}
