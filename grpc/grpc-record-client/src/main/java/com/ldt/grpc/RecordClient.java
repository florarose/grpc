package com.ldt.grpc;

import com.github.brainlag.nsq.NSQMessage;
import com.github.brainlag.nsq.callbacks.NSQMessageCallback;
import com.ldt.grpc.Nsq.Consumer;
import com.ldt.grpc.properties.PropertiesTest;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import io.grpc.StatusRuntimeException;
import io.grpc.examples.Dream.InfutureGrpc;
import io.grpc.examples.Dream.recordEntity;

import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;

public class RecordClient {

    private static final Logger logger = Logger.getLogger(RecordClient.class.getName());

    private final ManagedChannel channel;
    public final InfutureGrpc.InfutureBlockingStub blockingStub;
    private Consumer consumer;

    public RecordClient(String host, int port) {
        this(ManagedChannelBuilder.forAddress(host, port)
                // Channels are secure by default (via SSL/TLS). For the example we disable TLS to avoid
                // needing certificates.
                .usePlaintext()
                .build());
    }
    RecordClient(ManagedChannel channel) {
        this.channel = channel;
        blockingStub = InfutureGrpc.newBlockingStub(channel);
        Consumer.createconsum("test5","nsq_to_file",new NSQMessageCallback(){
            @Override
            public void message(NSQMessage message) {
//                获取订阅消息的内容
                byte b[] = message.getMessage();
                String s=new String(b);
//                Consumer.close(consumer);
                insertRecord(s);
//                message.finished();
                System.out.println("获取消息成功==="+s);
            }
        });
    }

    public void shutdown() throws InterruptedException {
        channel.shutdown().awaitTermination(5, TimeUnit.SECONDS);
    }
    //插入记录
    public String insertRecord(String name){
        recordEntity response ;
        recordEntity request = recordEntity.newBuilder().setName(name).build();
        try {
            response = blockingStub.insertRecord(request);
            return response.getName();
        } catch (StatusRuntimeException e) {
            logger.log(Level.WARNING, "insert record faile", e.getStatus());
            return null ;
        }
    }
    public static void main(String[] args) throws Exception {
        Integer port =PropertiesTest.getInterResource("grpc.server.port");
        String host = PropertiesTest.getResource("grpc.server.address");

        RecordClient client = null;
        try {
            client= new RecordClient(host, port);
//            client.insertRecord("nnmm");
        } finally {
           client.shutdown();
        }
    }
}
