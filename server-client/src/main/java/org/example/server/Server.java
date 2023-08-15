package org.example.server;

import org.example.SimpleServiceGrpc;
import org.lognet.springboot.grpc.GRpcService;
import io.grpc.stub.StreamObserver;
import org.example.SimpleRequest;
import org.example.SimpleResponse;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@GRpcService
public class Server extends SimpleServiceGrpc.SimpleServiceImplBase {

    // Logger to log and debug incoming request and outgoing responses
    Logger logger = LoggerFactory.getLogger(Server.class);

    /**
     * Takes in a client's request and returns a message 'Hello there' and a boolean of false for
     * there admin status.
     *
     * @param request - The incoming client request needing to be handled by this method
     * @param responseObserver - The observer for the client so they receive the message once
     *                         the response computation is completed.
     */
    @Override
    public void simpleSend(SimpleRequest request, StreamObserver<SimpleResponse> responseObserver) {
        logger.info("Got request from: " + request.getUuid());
        SimpleResponse simpleResponse = SimpleResponse.newBuilder()
                .setResponseMsg("Hello there!")
                .setIsAdmin(false)
                .build();
        responseObserver.onNext(simpleResponse);
        responseObserver.onCompleted();
    }

}
