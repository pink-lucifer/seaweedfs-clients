# gRpc helloworld - to investigate an issue between java client and go server

copy samples from [grpc-java/examples/helloworld](https://github.com/grpc/grpc-java/tree/master/examples) and [grpc-go/examples/helloworld](https://github.com/grpc/grpc-go/tree/master/examples/helloworld).

## Copy the sources of go 
- crate folders under experiments
```bash
cd $PROJECT_DIR/experiments/grpc-helloworld
mkdir -p go/helloworld go/client go/server helloworld
```
- copy proto file
```bash
cd $PROJECT_DIR/experiments/grpc-helloworld/helloworld
wget  https://raw.githubusercontent.com/grpc/grpc-java/master/examples/src/main/proto/helloworld.proto
```
- copy client and server source, replace reference of pb package as well
```bash
# client
cd $PROJECT_DIR/experiments/grpc-helloworld/go/client
wget  https://raw.githubusercontent.com/grpc/grpc-go/master/examples/helloworld/greeter_client/main.go
sed -i -e 's/pb\ \"google.golang.org\/grpc\/examples\/helloworld\/helloworld\"/pb\ \"..\/helloworld\"/g' main.go
# server
cd $PROJECT_DIR/experiments/grpc-helloworld/go/server
wget https://raw.githubusercontent.com/grpc/grpc-go/master/examples/helloworld/greeter_server/main.go
sed -i -e 's/pb\ \"google.golang.org\/grpc\/examples\/helloworld\/helloworld\"/pb\ \"..\/helloworld\"/g' main.go
```

## Copy the sources of java
- create folders under java-helloworld
```bash
cd $PROJECT_DIR/experiments/grpc-helloworld/java-helloworld
mkdir -p src/main/proto src/main/java/io/grpc/examples/helloworld
```
- copy client java file and proto file
```bash
cd $PROJECT_DIR/experiments/grpc-helloworld/java-helloworld/src/main/java/io/grpc/examples/helloworld
wget https://raw.githubusercontent.com/grpc/grpc-java/master/examples/src/main/java/io/grpc/examples/helloworld/HelloWorldClient.java
cd $PROJECT_DIR/experiments/grpc-helloworld/java-helloworld/src/main/proto 
wget  https://raw.githubusercontent.com/grpc/grpc-java/master/examples/src/main/proto/helloworld.proto
```
- create build.gradle script file
```groovy
buildscript {
    ext {
        protocVersion = '3.5.1'
        grpcVersion = '1.12.0'
    }
    repositories {
        mavenLocal()
        maven {
            url "https://plugins.gradle.org/m2/"
        }
        jcenter()
        mavenCentral()
    }
}

plugins {
    id 'java'
    id 'application'
    id "com.google.protobuf" version "0.8.5"
    id "com.github.johnrengelman.shadow" version "2.0.4"
}

group 'io.grpc'
version '0.0.1-SNAPSHOT'

mainClassName = 'io.grpc.examples.helloworld.HelloWorldClient'
tasks.withType(JavaCompile) {
    options.encoding = "UTF-8"
}

sourceCompatibility = 1.8
targetCompatibility = 1.8

repositories {
    mavenLocal()
    mavenCentral()
}

dependencies {
    compile ("io.grpc:grpc-stub:${grpcVersion}")
    compile ("io.grpc:grpc-protobuf:${grpcVersion}")
    compile ("io.grpc:grpc-netty-shaded:${grpcVersion}")
    compile ("com.google.protobuf:protobuf-java:${protocVersion}")
    compile ("com.google.protobuf:protobuf-java-util:${protocVersion}")
}

sourceSets {
    main {
        java {
            srcDir 'src/main/protobuf'
            srcDir 'src/main/grpcjava'
        }
    }
}

protobuf {
    protoc {
        artifact = "com.google.protobuf:protoc:${protocVersion}"
    }
    plugins {
        grpc {
            artifact = "io.grpc:protoc-gen-grpc-java:${grpcVersion}"
        }
    }

    generateProtoTasks {
        ofSourceSet('main').each { task ->
            task.builtins {
                java {
                    outputSubDir = 'protobuf'
                }
            }
            task.plugins {
                grpc {
                    outputSubDir = 'grpcjava'
                }
            }
        }
    }
    generatedFilesBaseDir = "$projectDir/src/"
}

task cleanProtoGen {
    doFirst {
        delete("$projectDir/src/main/grpcjava")
        delete("$projectDir/src/main/protobuf")
    }
}
//clean.dependsOn cleanProtoGen
```
- run build
```bash
gradle clean build
```
- check if fat jar (java-helloworld-0.0.1-SNAPSHOT-all.jar) generated under build/libs/

## Test grpc server
- start grpc server
```bash
cd $PROJECT_DIR/experiments/go/cmux_server
go run main.go
```
- test grpc req with go client
```bash
go run main.go 
# 2018/05/31 22:18:52 Greeting: Hello world
```
- test grpc req with java client
```bash
cd $PROJECT_DIR/experiments/grpc-helloworld/java-helloworld/build/libs
java -jar java-helloworld-0.0.1-SNAPSHOT-all.jar  lucifer  
# May 31, 2018 10:19:41 PM io.grpc.examples.helloworld.HelloWorldClient greet
# INFO: Will try to greet lucifer ...
# May 31, 2018 10:19:41 PM io.grpc.examples.helloworld.HelloWorldClient greet
# INFO: Greeting: Hello lucifer
```
## modify with a cmux http + grpc server

- create folder
```bash
cd $PROJECT_DIR/experiments/grpc-helloworld/go
mkdir cmux_server
```
- create main.go
 ```go
package main

import (
	"log"
	"net"
	"golang.org/x/net/context"
	"google.golang.org/grpc"
	//pb "google.golang.org/grpc/examples/helloworld/helloworld"
	pb "../helloworld"
	"google.golang.org/grpc/reflection"
	"github.com/soheilhy/cmux"
	"net/http"
	"fmt"
)

const (
	port = ":50051"
)

// server is used to implement helloworld.GreeterServer.
type grpcServer struct{}

type httpServer struct {}

// SayHello implements helloworld.GreeterServer
func (s *grpcServer) SayHello(ctx context.Context, in *pb.HelloRequest) (*pb.HelloReply, error) {
	return &pb.HelloReply{Message: "Hello " + in.Name}, nil
}

func (*httpServer)  ServeHTTP(w http.ResponseWriter, r *http.Request) {
	name := r.FormValue("name")
	fmt.Fprintln(w, "Hello " + name)
}

func main() {
	lis, err := net.Listen("tcp", port)
	if err != nil {
		log.Fatalf("failed to listen: %v", err)
	}

	m := cmux.New(lis)
	grpcL := m.Match(cmux.HTTP2HeaderField("content-type", "application/grpc"))
	httpL := m.Match(cmux.Any())

	grpcS := grpc.NewServer()
	pb.RegisterGreeterServer(grpcS, &grpcServer{})
	// Register reflection service on gRPC server.
	reflection.Register(grpcS)

	httpS := &http.Server{
		Handler: &httpServer{},
	}

	go grpcS.Serve(grpcL)
	go httpS.Serve(httpL)

	if err := m.Serve(); err != nil {
		log.Fatalf("Filer Fail to serve: %v", err)
	}
}
```

## Test cmux server
- start cmux server
```bash
cd $PROJECT_DIR/experiments/go/cmux_server
go run main.go
```
- test http req
```bash
curl  http://127.0.0.1:50051?name=lucifer
## output Hello lucifer
```
- test grpc req with go client
```bash
go run main.go 
#2018/05/31 22:15:03 Greeting: Hello world
```
- test grpc req with java client
```bash
cd $PROJECT_DIR/experiments/grpc-helloworld/java-helloworld/build/libs
java -jar java-helloworld-0.0.1-SNAPSHOT-all.jar  lucifer  
# May 31, 2018 10:11:56 PM io.grpc.examples.helloworld.HelloWorldClient greet
# INFO: Will try to greet lucifer ...
# -- got stuck --
```

## Guess
seems to me, grpc java client would couple Magic and SETTINGS[0] frame together, which cause cmux dispatch grpc request to http server.