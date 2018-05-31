# update grpc and plugin protoc-gen-go
go get -u google.golang.org/grpc
go get -u github.com/golang/protobuf/protoc-gen-go
# generate protos
cd  $PROJECT_DIR/experiments/grpc-helloworld
protoc -I . helloworld/helloworld.proto --go_out=plugins=grpc:go/helloworld
