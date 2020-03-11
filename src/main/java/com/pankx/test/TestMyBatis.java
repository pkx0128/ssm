package com.pankx.test;

import com.pankx.dao.UsersDao;
import com.pankx.domain.Users;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

public class TestMyBatis {
    @Test
    public void testMyBatis() throws IOException {
        //加载配置文件
       InputStream inputStream = Resources.getResourceAsStream("mybatis.xml");
        //创建SqlSessionFactory对象
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        //获取SqlSession对象
        SqlSession session = sqlSessionFactory.openSession();
        //获取代理对象
        UsersDao usersDao = session.getMapper(UsersDao.class);
        //执行查询方法
        List<Users> list = usersDao.findAll();
        for(Users users:list){
            System.out.println(users);
        }
        Users users = new Users();
        users.setUserName("test1");
        users.setPassword("test123456");
        //执行新增用户方法
        usersDao.saveUser(users);
        //提交事务
        session.commit();
        //关闭资源
        session.close();
        inputStream.close();

    }
}
