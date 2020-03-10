package com.pankx.service;

import com.pankx.domain.Users;

import java.util.List;

/**
 * 用户的业务接口
 */
public interface UsersService {
    /**
     * 查询所有用户
     * @return
     */
    public List<Users> findAll();

    /**
     * 添加用户
     * @param users
     */
    public void saveUser(Users users);
}
