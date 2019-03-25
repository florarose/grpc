package com.ldt.grpc.Dao;

import com.ldt.grpc.DB.DBTools;
import com.ldt.grpc.mapper.RecordMapper;
import org.apache.ibatis.session.SqlSession;

import java.util.logging.Logger;

public class RecordDao {

    private SqlSession sqlSession;
    private RecordMapper recordMapper;

    private static final Logger logger = Logger.getLogger(RecordDao.class.getName());

    public RecordDao() {
        sqlSession = DBTools.getSqlSession();
        recordMapper = sqlSession.getMapper(RecordMapper.class);
    }
    public boolean insertRecord(String name){
        boolean flag = recordMapper.insertRecord(name);
        sqlSession.commit();
        return flag;
    }
}
