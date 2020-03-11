package com.pankx.service.impl;

import com.pankx.dao.UsersDao;
import com.pankx.domain.Users;
import com.pankx.service.UsersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 用户业务接口的实现类
 */
@Service("usersService")
public class UsersServiceImpl implements UsersService {
    @Autowired
    private UsersDao usersDao;
    /**
     * 查询所有用户
     *
     * @return
     */
    @Override
    public List<Users> findAll() {
//        usersDao.findAll();
        System.out.println("UserServiceImpl类的findAll方法执行了。。。");
        return usersDao.findAll();
    }

    /**
     * 添加用户
     *
     * @param users
     */
    @Override
    public void saveUser(Users users) {
        usersDao.saveUser(users);
        System.out.println("UserServiceImpl类的saveUser方法执行了。。。.");
    }
}
