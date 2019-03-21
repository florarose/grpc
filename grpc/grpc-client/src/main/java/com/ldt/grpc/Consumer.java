package com.ldt.grpc;

import com.github.brainlag.nsq.NSQConsumer;
import com.github.brainlag.nsq.lookup.DefaultNSQLookup;
import com.github.brainlag.nsq.lookup.NSQLookup;

import java.util.concurrent.Executor;

public class Consumer {


    public static void main(String[] args) {

        NSQLookup lookup = new DefaultNSQLookup();
        lookup.addLookupAddress("47.100.2.226", 4161);
        NSQConsumer consumer = new NSQConsumer(lookup, "test5", "nsq_to_file", (message) -> {
            System.out.println("received: " + message);
            ////                获取订阅消息的内容
            byte b[] = message.getMessage();
            String s = new String(b);
            System.out.println(s);
            message.finished();
        });

        consumer.start();
        System.out.println("消息"+consumer.getTotalMessages());
        consumer.getTotalMessages();
        //线程睡眠，让程序执行完

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        consumer.setExecutor(new Executor() {
            @Override
            public void execute(Runnable command) {
// TODO Auto-generated method stub
            }
        });
    }
}
