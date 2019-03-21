package src.java.com.ldt.grpc.Api;

import src.java.com.ldt.grpc.Server.ServerGrpc;

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
