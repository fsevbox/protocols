package org.techfrog.client;

import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import org.techfrog.server.HelloRequest;
import org.techfrog.server.HelloResponse;
import org.techfrog.server.HelloServiceGrpc;

import java.util.logging.Logger;

public class GrpcClient {

    private static final Logger LOGGER = Logger.getLogger(GrpcClient.class.getName());

    public static void main(String[] args) {
        ManagedChannel channel = ManagedChannelBuilder.forAddress("localhost", 8080)
                .usePlaintext()
                .build();

        HelloServiceGrpc.HelloServiceBlockingStub service = HelloServiceGrpc.newBlockingStub(channel);

        HelloResponse response = service.hello(HelloRequest.newBuilder()
                .setFirstName("John")
                .setLastName("Doe")
                .build());

        LOGGER.info(response.getGreeting());
        channel.shutdown();
    }
}
