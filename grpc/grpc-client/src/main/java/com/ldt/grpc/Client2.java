package com.ldt.grpc;

import com.github.brainlag.nsq.exceptions.NSQException;
import com.ldt.grpc.Nsq.Produce;
import com.ldt.grpc.properties.PropertiesTest;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import io.grpc.StatusRuntimeException;
import io.grpc.examples.Dream.InfoUser;
import io.grpc.examples.Dream.InfutureGrpc;
import io.grpc.examples.Dream.myRequest;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Client2 {

    private static final Logger logger = Logger.getLogger(Client2.class.getName());

    private final ManagedChannel channel;
    public final InfutureGrpc.InfutureBlockingStub blockingStub;
    private Produce produce = new Produce();

    public Client2(String host, int port) {
        this(ManagedChannelBuilder.forAddress(host, port)
                .usePlaintext()
                .build());
    }

    Client2(ManagedChannel channel) {
        this.channel = channel;
        blockingStub = InfutureGrpc.newBlockingStub(channel);
    }

    public void shutdown() throws InterruptedException {
        channel.shutdown().awaitTermination(1, TimeUnit.SECONDS);
    }

    public String getName(Integer userId){
        InfoUser response ;
        myRequest myrequest = myRequest.newBuilder().setId(userId).build();
        try {
            response = blockingStub.getNameById(myrequest);
            produce.product(response.getName());
            return response.getName();
        } catch (StatusRuntimeException e) {
            logger.log(Level.WARNING, "RPC failed: {0}", e.getStatus());
             return null ;
        } catch (NSQException e){
            logger.log(Level.WARNING, "RPC failed: NSqException");
            e.printStackTrace();
            return null;
        }catch (TimeoutException e){
            logger.log(Level.WARNING, "RPC failed: timeOut");
            return null;
        }
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
            String user = "world";
            if (args.length > 0) {
                user = args[0]; /* Use the arg as the name to greet if provided */
            }
            client.getName(2);

        } finally {
            client.shutdown();
        }
    }
}
