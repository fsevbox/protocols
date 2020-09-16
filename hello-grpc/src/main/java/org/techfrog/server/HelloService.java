package org.techfrog.server;

import io.grpc.stub.StreamObserver;

public class HelloService extends HelloServiceGrpc.HelloServiceImplBase {

    @Override
    public void hello(HelloRequest request, StreamObserver<HelloResponse> responseObserver) {
        String greeting = new StringBuilder()
                .append("Hello, ")
                .append(request.getFirstName())
                .append(" ")
                .append(request.getLastName())
                .toString();

        HelloResponse helloResponse = HelloResponse.newBuilder()
                .setGreeting(greeting)
                .build();

        responseObserver.onNext(helloResponse);
        responseObserver.onCompleted();
    }
}
