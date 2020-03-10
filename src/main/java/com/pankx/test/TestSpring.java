package com.pankx.test;

import com.pankx.domain.Users;
import com.pankx.service.UsersService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
    @Test
    public void testSpring(){
        //加载spring配置文件
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("classpath:applicationContext.xml");
        //获取UserService对象
        UsersService usersService = applicationContext.getBean("usersService", UsersService.class);
        usersService.findAll();
        Users users = new Users();
        usersService.saveUser(users);

    }
}
