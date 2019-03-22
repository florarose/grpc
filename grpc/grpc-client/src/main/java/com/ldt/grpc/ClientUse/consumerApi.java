package com.ldt.grpc.ClientUse;

import com.ldt.grpc.Client2;
import com.ldt.grpc.Client3;
import com.ldt.grpc.nsq.Produce;
import com.ldt.grpc.constants.Constants;

import java.util.logging.Logger;

public class consumerApi {

    private static final Logger logger = Logger.getLogger(consumerApi.class.getName());


    public static void main(String[] args) throws Exception {
        Produce produce= new Produce();

        consumerApi useApi2 = new consumerApi();
        //生产者发布消息，
        String name1= useApi2.getName(2);
        produce.product(name1);
    }

    public String getName(Integer id){
        Client2 client = new Client2(Constants.host(), Constants.port());
         String name=  client.getName(id);
         return name;
    }


}
