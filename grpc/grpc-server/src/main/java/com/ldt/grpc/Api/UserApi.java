package com.ldt.grpc.Api;

import com.ldt.grpc.Server.ServerGrpc;
import com.ldt.grpc.nsq.Consumer;

import java.io.IOException;

public class UserApi {


//    //根据id 查询name
//    public void getNameById() throws IOException,InterruptedException {
//        serverGrpc.UserServer();
//    }
    public static  void main(String [] arrgs) throws IOException,InterruptedException{
        ServerGrpc serverGrpc = new ServerGrpc();
        serverGrpc.UserServer();


    }
}
