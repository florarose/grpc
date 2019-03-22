package com.ldt.grpc.mapper;


import io.grpc.examples.Dream.InfoUser;

public interface InfoUserMapper {
      String getAll();
// InfoUser findInfoUser(int id);
     String findInfoUser(int id);
     boolean insertUser(String name);
}
