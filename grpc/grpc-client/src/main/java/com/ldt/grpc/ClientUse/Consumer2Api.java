package com.ldt.grpc.ClientUse;

import com.ldt.grpc.Client3;
import com.ldt.grpc.constants.Constants;
import com.ldt.grpc.nsq.Consumer;

public class Consumer2Api {

    public static void main(String[] args) throws Exception {
        Consumer consumer = new Consumer();
        Consumer2Api consumer2Api = new Consumer2Api();
        String aa = consumer.consum();
        if(null != aa && !"".equals(aa)){
           consumer2Api.insertName("李四");
        }
    }


    public String insertName(String name){

        Client3 client3 = new Client3(Constants.host(), Constants.port());
        String nameNew=  client3.insert(name);
        return nameNew;
    }
}
