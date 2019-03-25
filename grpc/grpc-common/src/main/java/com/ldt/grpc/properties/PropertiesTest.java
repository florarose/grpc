package com.ldt.grpc.properties;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public  class PropertiesTest {

    public static Integer getInterResource(String key) throws IOException{
        InputStream inStream = PropertiesTest.class.getClassLoader().getResourceAsStream("application.properties");
        Properties prop = new Properties();
        prop.load(inStream);
        String value = prop.getProperty(key);
        return Integer.parseInt(value);
    }
    public static String getResource(String key) throws IOException{
        InputStream inStream = PropertiesTest.class.getClassLoader().getResourceAsStream("application.properties");
        Properties prop = new Properties();
        prop.load(inStream);
        String value = prop.getProperty(key);
        return value;
    }
//        public static void main(String[] args) throws IOException {
//            InputStream inStream = com.ldt.grpc.PropertiesTest.class.getClassLoader().getResourceAsStream("application.properties");
//            Properties prop = new Properties();
//            prop.load(inStream);
//            String key = prop.getProperty("grpc.server.address");
//            System.out.println("key"+key);
//        }
}
