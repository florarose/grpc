package src.java.com.ldt.grpc.impl;

import src.java.com.ldt.grpc.Dao.InfoUserDao;
import src.java.com.ldt.grpc.Server2;
import io.grpc.examples.Dream.HelloRequest;
import io.grpc.examples.Dream.InfoUser;
import io.grpc.examples.Dream.InfutureGrpc;
import io.grpc.examples.Dream.myRequest;
import io.grpc.stub.StreamObserver;
import src.java.com.ldt.grpc.Dao.InfoUserDao;

import java.util.logging.Logger;

public class UserServiceImpl extends InfutureGrpc.InfutureImplBase {

    private static final Logger logger = Logger.getLogger(UserServiceImpl.class.getName());

    private InfoUserDao infoUserDao =new InfoUserDao();

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
        String infoUser = infoUserDao.getNameById(3);
        InfoUser reply = InfoUser.newBuilder().setName(infoUser).build();
//        InfoUser reply = InfoUser.newBuilder().setMessage("uuuu " + request.getId()).build();
        responseObserver.onNext(reply);
        responseObserver.onCompleted();
    }

}