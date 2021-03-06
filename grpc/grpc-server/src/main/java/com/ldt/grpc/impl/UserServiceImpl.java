package com.ldt.grpc.impl;

import com.ldt.grpc.Dao.InfoUserDao;
import com.ldt.grpc.Dao.RecordDao;
import io.grpc.examples.Dream.*;
import io.grpc.stub.StreamObserver;

import java.util.logging.Logger;

public class UserServiceImpl extends InfutureGrpc.InfutureImplBase {

    private static final Logger logger = Logger.getLogger(UserServiceImpl.class.getName());

    private InfoUserDao infoUserDao =new InfoUserDao();
    private RecordDao recordDao = new RecordDao();

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
        String infoUser = infoUserDao.getAll();
        logger.info("grpc request : userId= " + userId);
        //返回的参数
//            InfoUser reply = InfoUser.newBuilder().setId(request.getId()).build();
        InfoUser  reply = InfoUser.newBuilder().setName(infoUser).build();
        //做出响应
        responseObserver.onNext(reply);
        responseObserver.onCompleted();
    }

    @Override
    public void getNameById(myRequest request, StreamObserver<InfoUser> responseObserver) {
        long userId = request.getId();
        String infoUser = infoUserDao.getNameById((int)userId);
        InfoUser reply = InfoUser.newBuilder().setName(infoUser).build();
        System.out.println("查询结果为："+infoUser);
//        InfoUser reply = InfoUser.newBuilder().setMessage("uuuu " + request.getId()).build();
        responseObserver.onNext(reply);
        responseObserver.onCompleted();
    }

    @Override
    public void insertUser(InfoUser request, StreamObserver<InfoUser> responseObserver) {
        boolean flag = infoUserDao.insertUs(request.getName());
        String result = "success";
        if(!flag){
            result = "false";
        }
        InfoUser reply = InfoUser.newBuilder().setName(result).build();
        responseObserver.onNext(reply);
        responseObserver.onCompleted();
    }

    @Override
    public void insertRecord(recordEntity request, StreamObserver<recordEntity> responseObserver) {
        recordDao.insertRecord(request.getName());
        recordEntity reply = recordEntity.newBuilder().setName(request.getName()).build();
        responseObserver.onNext(reply);
        responseObserver.onCompleted();
    }
}
