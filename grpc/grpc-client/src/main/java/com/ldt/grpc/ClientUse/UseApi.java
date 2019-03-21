package com.ldt.grpc.ClientUse;

import com.ldt.grpc.Client2;
import com.ldt.grpc.Produce;
import com.ldt.grpc.constants.Constants;
import io.grpc.StatusRuntimeException;
import io.grpc.examples.Dream.InfoUser;
import io.grpc.examples.Dream.InfutureGrpc;
import io.grpc.examples.Dream.myRequest;

import javax.imageio.IIOException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class UseApi{

    private static final Logger logger = Logger.getLogger(UseApi.class.getName());


    public static void main(String[] args) throws Exception {
        Produce produce= new Produce();
        Client2 client = new Client2(Constants.host(), Constants.port());
        InfoUser response;
        myRequest myrequest = myRequest.newBuilder().setId(2).build();
        try {
            response = client.blockingStub.getNameById(myrequest);
            produce.product();
        } catch (StatusRuntimeException e) {
            logger.log(Level.WARNING, "RPC failed: {0}", e.getStatus());
            return;
        }
        logger.info("User: " + response.getName());
    }

}
