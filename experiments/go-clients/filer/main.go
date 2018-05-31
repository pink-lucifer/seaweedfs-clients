package main

import (
	"fmt"
	"google.golang.org/grpc"
	"github.com/chrislusf/seaweedfs/weed/pb/filer_pb"
	"context"
)

func main()  {
	fmt.Println("Start testing seaweedfs grpc...")
	masterNode:="127.0.0.1:9006";
	grpcConection, err := grpc.Dial(masterNode, grpc.WithInsecure())
	if err != nil {
		fmt.Errorf("fail to dial: %v", err)
		panic(err)
	}
	defer grpcConection.Close()

	filerClient:= filer_pb.NewSeaweedFilerClient(grpcConection)

	req :=&filer_pb.ListEntriesRequest{
		Directory: "avatar",
	}

	resp, err:=filerClient.ListEntries(context.Background(), req)
	if err != nil {
		fmt.Errorf("fail to dial: %v", err)
		panic(err)
	}

	fmt.Println(resp.String())
}
