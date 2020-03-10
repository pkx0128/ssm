package com.pankx.dao.impl;

import com.pankx.dao.UsersDao;
import com.pankx.domain.Users;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * UserDao接口的实现类
 */
@Repository
public class UsersDaoImpl implements UsersDao {
    /**
     * 查询所有用户
     *
     * @return
     */
    @Override
    public List<Users> findAll() {
        System.out.println("UsersDaoImpl类的findAlll方法执行了...");
        return null;
    }

    /**
     * 添加用户
     *
     * @param users
     */
    @Override
    public void saveUser(Users users) {
        System.out.println("UsersDaoImpl类的saveUser方法执行了...");
    }
}
