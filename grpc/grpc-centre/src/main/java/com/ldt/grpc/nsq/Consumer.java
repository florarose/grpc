package com.ldt.grpc.nsq;

import com.github.brainlag.nsq.NSQConsumer;
import com.github.brainlag.nsq.NSQMessage;
import com.github.brainlag.nsq.callbacks.NSQMessageCallback;
import com.github.brainlag.nsq.lookup.DefaultNSQLookup;
import com.github.brainlag.nsq.lookup.NSQLookup;

import java.util.concurrent.Executor;

public class Consumer {
    String s ;
    public String consum(){
        NSQLookup lookup = new DefaultNSQLookup();
        lookup.addLookupAddress("47.100.2.226", 4161);
        NSQConsumer consumer = new NSQConsumer(lookup, "test5", "nsq_to_file", new NSQMessageCallback(){
            @Override
            public void message(NSQMessage message) {
//                获取订阅消息的内容
                byte b[] = message.getMessage();
                s=new String(b);
                System.out.println("获取消息成功"+s);
                message.finished();
            }
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
        return s;
    }
    public static void main(String[] args) {
        Consumer consumer = new Consumer();
        consumer.consum();
    }
}

