package com.pankx.domain;

import java.io.Serializable;

/**
 * 账号实体类
 */
public class Users implements Serializable {
    private String userName;//用户名
    private String password;//密码

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "Users{" +
                "userName='" + userName + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
