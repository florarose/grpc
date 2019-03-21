package src.java.com.ldt.grpc.DBTools;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.Reader;

public class DBTools {
    public static SqlSessionFactory sessionFactory;

    static {
        try {
            Reader reader = Resources.getResourceAsReader("src/resources/mybatis_cfg.xml");
            sessionFactory = new SqlSessionFactoryBuilder().build(reader);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    //创建能执行映射文件中sql的sqlSession
    public static SqlSession getSqlSession(){
        return sessionFactory.openSession();
    }
}
