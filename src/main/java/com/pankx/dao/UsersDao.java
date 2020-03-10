package com.pankx.dao;

import com.pankx.domain.Users;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 *用户的dao接口
 * 使用mybatis框架，dao接口可以不用实现例
 */
public interface UsersDao {
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
