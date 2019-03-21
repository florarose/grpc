package com.ldt.grpc;

import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import io.grpc.StatusRuntimeException;
import io.grpc.examples.Dream.HelloRequest;
import io.grpc.examples.Dream.InfoUser;
import io.grpc.examples.Dream.InfutureGrpc;
import io.grpc.netty.NettyChannelBuilder;

import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;


public class Client {


    private static final Logger logger = Logger.getLogger(Client.class.getName());

    private  ManagedChannel channel;
    private  InfutureGrpc.InfutureBlockingStub blockingStub;

//    public ClientUse(String host, int port) {
//        ManagedChannel channel = NettyChannelBuilder.forAddress("127.0.0.1", 8080).usePlaintext(true).build();
////        LoginServiceBlockingStub stub = LoginServiceGrpc.newBlockingStub(channel);
////        LoginResponse resp = stub.login(LoginRequest.newBuilder().setPassword("123456").setUsername("admin").build());
////        System.out.println(resp.getMsg() + "\t" + resp.getCode());
////        channel.shutdown().awaitTermination(1, TimeUnit.SECONDS);
////        this(ManagedChannelBuilder.forAddress(host,port)
////                .usePlaintext(true)
////                .build());
//    }
    public void shutdown() throws InterruptedException {
        channel.shutdown().awaitTermination(5, TimeUnit.SECONDS);
    }

    public InfoUser test(String name){
        HelloRequest helloRequest = HelloRequest.newBuilder().setName(name).build() ;
        InfoUser response;
        try {
            response =blockingStub.sayHello(helloRequest);
            return response;
        }catch (StatusRuntimeException e){
            logger.log(Level.WARNING,"RPC failed : {0}",e.getStatus());
        }
        return null;
    }


    public static void main(String[] args) throws Exception {
        ManagedChannel channel = NettyChannelBuilder.forAddress("127.0.0.1", 8080).usePlaintext(true).build();
//        ClientUse client = new ClientUse("localhost", 50051);
        Client client = new Client();
        InfoUser infoUser = client.test("刘栋庭");
        try {
            /* Access a mapper running on the local machine on port 50051 */
            String user = "world";
            if (args.length > 0) {
                user = args[0]; /* Use the arg as the name to greet if provided */
            }
        } finally {
            channel.shutdown();
        }
    }
}
