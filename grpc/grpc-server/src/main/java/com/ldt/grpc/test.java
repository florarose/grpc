package com.ldt.grpc;

import com.ldt.grpc.Dao.InfoUserDao;
import io.grpc.examples.Dream.InfoUser;
import com.ldt.grpc.Dao.InfoUserDao;

public class test {
    public static void main(String[] args) throws Exception {
        InfoUserDao infoUserDao = new InfoUserDao();
//        String name = infoUserDao.getAll();
        String infoUser = infoUserDao.getNameById(3);
//        System.out.println("name="+name);
        System.out.println("name2 = "+infoUser);
    }
}
