package com.ldt.grpc.constants;



import com.ldt.grpc.properties.PropertiesTest;

import java.io.IOException;

public final  class Constants {



    public static  String host()  {
        try {
            String host = PropertiesTest.getResource("grpc.server.address");
            return host;
        }catch (IOException e){
            e.printStackTrace();
        }
        return null;
    }
    public static Integer port()  {
        try {
            Integer port = Integer.parseInt(PropertiesTest.getResource("grpc.server.port"));
            return port;
        }catch (IOException e){
            e.printStackTrace();
        }
        return null;
    }
}
