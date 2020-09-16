package org.techfrog.server;

import io.grpc.Server;
import io.grpc.ServerBuilder;

import java.io.IOException;

public class GrpcServer {

    public static void main(String[] args) throws InterruptedException, IOException {
        Server server = ServerBuilder
            .forPort(8080)
            .addService(new HelloService())
            .build();

        server.start();
        server.awaitTermination();
    }
}
