package com.ldt.grpc;

import grpc.utils.PropertiesTest;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import io.grpc.StatusRuntimeException;
import io.grpc.examples.Dream.HelloRequest;
import io.grpc.examples.Dream.InfoUser;
import io.grpc.examples.Dream.InfutureGrpc;
import io.grpc.examples.Dream.myRequest;

import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Client2 {

    private static final Logger logger = Logger.getLogger(Client2.class.getName());

    private final ManagedChannel channel;
    public final InfutureGrpc.InfutureBlockingStub blockingStub;

    /** Construct client connecting to HelloWorld server at {@code host:port}. */
    public Client2(String host, int port) {
        this(ManagedChannelBuilder.forAddress(host, port)
                // Channels are secure by default (via SSL/TLS). For the example we disable TLS to avoid
                // needing certificates.
                .usePlaintext()
                .build());
    }

    /** Construct client for accessing HelloWorld server using the existing channel. */
    Client2(ManagedChannel channel) {
        this.channel = channel;
        blockingStub = InfutureGrpc.newBlockingStub(channel);
    }

    public void shutdown() throws InterruptedException {
        channel.shutdown().awaitTermination(5, TimeUnit.SECONDS);
    }

    /** Say hello to server. */
    public void greet(String name) {
        logger.info("Will try to greet " + name + " ...");
        HelloRequest request = HelloRequest.newBuilder().setName(name).build();
        InfoUser response;
        try {
            response = blockingStub.sayHello(request);
        } catch (StatusRuntimeException e) {
            logger.log(Level.WARNING, "RPC failed: {0}", e.getStatus());
            return;
        }
        logger.info("Greeting: " + response.getMessage());
        try {
            response = blockingStub.sayHelloAgain(request);
        } catch (StatusRuntimeException e) {
            logger.log(Level.WARNING, "RPC failed: {0}", e.getStatus());
            return;
        }
        logger.info("Greeting: " + response.getMessage());


    }
    public void grpc(Integer userId){
        InfoUser response;
        myRequest myrequest = myRequest.newBuilder().setId(userId).build();
        try {
            response = blockingStub.getByUserId(myrequest);
        } catch (StatusRuntimeException e) {
            logger.log(Level.WARNING, "RPC failed: {0}", e.getStatus());
            return;
        }
        logger.info("User: " + response.getName());
    }
    public void getName(Integer userId){
        InfoUser response;
        myRequest myrequest = myRequest.newBuilder().setId(userId).build();
        try {
            response = blockingStub.getNameById(myrequest);
        } catch (StatusRuntimeException e) {
            logger.log(Level.WARNING, "RPC failed: {0}", e.getStatus());
            return;
        }
        logger.info("User: " + response.getName());
    }
    /**
     * Greet server. If provided, the first element of {@code args} is the name to use in the
     * greeting.
     */
    public static void main(String[] args) throws Exception {
        Integer port =PropertiesTest.getInterResource("grpc.server.port");
        String host = PropertiesTest.getResource("grpc.server.address");
        Client2 client = new Client2(host, port);
        try {
            /* Access a mapper running on the local machine on port 50051 */
            String user = "world";
            if (args.length > 0) {
                user = args[0]; /* Use the arg as the name to greet if provided */
            }
//            client.getName(1);
            client.greet(user);
        } finally {
            client.shutdown();
        }
    }
}
