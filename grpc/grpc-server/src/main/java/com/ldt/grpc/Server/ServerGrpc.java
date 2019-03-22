package com.ldt.grpc.Server;

import com.ldt.grpc.PropertiesTest;
import com.ldt.grpc.impl.UserServiceImpl;
import io.grpc.Server;
import io.grpc.ServerBuilder;

import java.io.IOException;
import java.util.logging.Logger;

public class ServerGrpc {

    private Server server;

    private static final Logger logger = Logger.getLogger(ServerGrpc.class.getName());

    private void start() throws IOException {
        /* The port on which the server should run */
        String po = PropertiesTest.getResource("grpc.server.port");
        Integer port = Integer.parseInt(po);
        server = ServerBuilder.forPort(port).addService(
                new UserServiceImpl())
                .build()
                .start();
        logger.info("Server started, listening on " + port);
        Runtime.getRuntime().addShutdownHook(new Thread() {
            @Override
            public void run() {
                // Use stderr here since the logger may have been reset by its JVM shutdown hook.
                System.err.println("*** shutting down gRPC server since JVM is shutting down");
                ServerGrpc.this.stop();
                System.err.println("*** server shut down");
            }
        });
    }

    private void stop() {
        if (server != null) {
            server.shutdown();
        }
    }

    /**
     * Await termination on the main thread since the grpc library uses daemon threads.
     */
    private void blockUntilShutdown() throws InterruptedException {
        if (server != null) {
            server.awaitTermination();
        }
    }

    public  void UserServer() throws IOException,InterruptedException{
        System.out.println("111");
        this.start();
        this.blockUntilShutdown();
    }
    public static  void main(String [] arrgs) throws IOException,InterruptedException{
        ServerGrpc serverGrpc = new ServerGrpc();
        serverGrpc.UserServer();
    }
}
