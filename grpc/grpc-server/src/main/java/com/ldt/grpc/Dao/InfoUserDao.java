package com.ldt.grpc.Dao;

import com.ldt.grpc.DB.DBTools;
import com.ldt.grpc.mapper.InfoUserMapper;
import org.apache.ibatis.session.SqlSession;

import java.util.logging.Logger;


public class InfoUserDao {
    private SqlSession sqlSession;
    private InfoUserMapper mapper;

    private static final Logger logger = Logger.getLogger(InfoUserDao.class.getName());

    public InfoUserDao() {
        sqlSession = DBTools.getSqlSession();
        mapper = sqlSession.getMapper(InfoUserMapper.class);
    }
    public String getAll()  {
//        sqlSession.selectOne(mapper.getClass().getName()+this.getClass().getName(), 1);
        String result = mapper.getAll();
        sqlSession.commit();
        return result;
    }

    public String getNameById(int id) {
        String result = mapper.findInfoUser(id);
        sqlSession.commit();
        return result;
    }

    public boolean insertUs(String name){
        boolean flag = mapper.insertUser(name);
        sqlSession.commit();
        return flag;
    }

//    public InfoUser getNameById(int id) {
//        InfoUser result = mapper.findInfoUser(id);
//        sqlSession.commit();
//        return result;
//    }
}
