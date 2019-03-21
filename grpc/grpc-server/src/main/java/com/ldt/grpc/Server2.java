package src.java.com.ldt.grpc;

import grpc.utils.PropertiesTest;
import io.grpc.Server;
import io.grpc.ServerBuilder;
import io.grpc.examples.Dream.HelloRequest;
import io.grpc.examples.Dream.InfoUser;
import io.grpc.examples.Dream.InfutureGrpc;
import io.grpc.examples.Dream.myRequest;
import io.grpc.stub.StreamObserver;

import java.io.IOException;
import java.util.logging.Logger;

public class Server2 {

    private static final Logger logger = Logger.getLogger(Server2.class.getName());

    private Server server;

    private void start() throws IOException {
        /* The port on which the server should run */
        String po = PropertiesTest.getResource("grpc.server.port");
        Integer port = Integer.parseInt(po);
        server = ServerBuilder.forPort(port)
                .addService(new GreeterImpl())
                .build()
                .start();
        logger.info("Server started, listening on " + port);
        Runtime.getRuntime().addShutdownHook(new Thread() {
            @Override
            public void run() {
                // Use stderr here since the logger may have been reset by its JVM shutdown hook.
                System.err.println("*** shutting down gRPC server since JVM is shutting down");
                Server2.this.stop();
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

    /**
     * Main launches the server from the command line.
     */
    public static void main(String[] args) throws IOException, InterruptedException {
        final Server2 server = new Server2();
        server.start();
        server.blockUntilShutdown();
    }
        static class GreeterImpl extends InfutureGrpc.InfutureImplBase {

        @Override
        public void sayHello(HelloRequest req, StreamObserver<InfoUser> responseObserver) {
            InfoUser reply = InfoUser.newBuilder().setMessage("Hello " + req.getName()).build();
            responseObserver.onNext(reply);
            responseObserver.onCompleted();
        }

        @Override
        public void sayHelloAgain(HelloRequest req, StreamObserver<InfoUser> responseObserver) {
            InfoUser reply = InfoUser.newBuilder().setMessage("Hello again " + req.getName()).build();
            responseObserver.onNext(reply);
            responseObserver.onCompleted();
        }

        //新建服务

        @Override
        public void getByUserId(myRequest request, StreamObserver<InfoUser> responseObserver) {
            //
            long userId = request.getId();
            logger.info("grpc request : userId= " + userId);
            //返回的参数
//            InfoUser reply = InfoUser.newBuilder().setId(request.getId()).build();
            InfoUser  reply = InfoUser.newBuilder().setName("刘栋庭").build();
            //做出响应
            responseObserver.onNext(reply);
            responseObserver.onCompleted();
        }
    }
}
