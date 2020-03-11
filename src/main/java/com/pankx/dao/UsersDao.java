package com.pankx.dao;

import com.pankx.domain.Users;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
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
    @Select("SELECT * FROM users")
    public List<Users> findAll();

    /**
     * 添加用户
     * @param users
     */
    @Insert("INSERT INTO users (username,password) VALUES(#{userName},#{password})")
    public void saveUser(Users users);
}
