package com.ldt.grpc.Nsq;

import com.github.brainlag.nsq.NSQProducer;
import com.github.brainlag.nsq.exceptions.NSQException;

import java.util.concurrent.TimeoutException;

public class Produce {


    public void  product(String name) throws TimeoutException,NSQException{
        NSQProducer producer = new NSQProducer().addAddress("47.100.2.226", 4150).start();
            byte[] data = (name).getBytes();//要发送的消息
            producer.produce("test5", data);
            producer.shutdown();
    }
//    public static void main(String[] args) throws TimeoutException,NSQException {
////        //发布消息
//        Produce produce = new Produce();
//          produce.product(name);
//    }

}
