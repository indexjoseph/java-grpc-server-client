package org.example.client;

import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import io.grpc.internal.LongCounter;
import org.example.SimpleRequest;
import org.example.SimpleResponse;
import org.example.SimpleServiceGrpc;
import org.example.SimpleServiceGrpc.SimpleServiceBlockingStub;
import org.example.SimpleServiceGrpc.SimpleServiceStub;

public class Client {
    public static void main(String[] args) {
        ManagedChannel managedChannel = ManagedChannelBuilder.forAddress("localhost", 6565)
                .usePlaintext()
                .build();

        SimpleServiceBlockingStub blockingStub = SimpleServiceGrpc.newBlockingStub(managedChannel);
        SimpleRequest simpleRequest = SimpleRequest.newBuilder()
                .setMsg("Hello!")
                .setUuid("1")
                .build();

        SimpleResponse simpleResponse = blockingStub.simpleSend(simpleRequest);
        System.out.println(simpleResponse.getResponseMsg() + " \nIs Admin: " + simpleResponse.getIsAdmin());
    }
}
