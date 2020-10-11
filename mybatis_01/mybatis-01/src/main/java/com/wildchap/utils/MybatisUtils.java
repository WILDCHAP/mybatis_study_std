package com.wildchap.utils;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;

//sqlSessionFactory
//该类可以获取一个已经定义好和数据库连接的类，然后直接调用改类的方法即可
public class MybatisUtils {

    private static SqlSessionFactory sqlSessionFactory;

    //获取配置文件（固定代码）
    static {
        try {
            //使用Mybatis获取sqlSessionFactory对象
            String resource = "mybatis-config.xml";
            InputStream inputStream = Resources.getResourceAsStream(resource);
            sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        }catch (IOException E){
            E.printStackTrace();
        }
    }

    //既然有了SqlSessionFactory,顾名思义，我们就可以从中获得SqlSession的实例了。
    // 你可以通过Sq|Session实例来直接执行已映射的SQL语句。
    public static SqlSession getSqlSession(){
        //利用opensession获取对象
        return sqlSessionFactory.openSession();
    }

}
