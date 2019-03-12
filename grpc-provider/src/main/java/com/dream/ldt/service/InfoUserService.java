package com.dream.ldt.service;


import io.grpc.examples.helloworld.InfoUser;
import java.util.List;
import java.util.Map;

public interface InfoUserService {

    List<InfoUser> insertInfoUser(InfoUser infoUser);

    InfoUser getInfoUserById(String id);

    void deleteInfoUserById(String id);

    String getNameById(String id);

    Map<String,InfoUser> getAllUser();
}
