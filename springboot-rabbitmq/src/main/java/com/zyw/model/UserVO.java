package com.zyw.model;

import java.io.Serializable;

/**
 * 用户类
 *
 * @author: zyw9527
 * @version: v1.0  Created in 2019年05月22日  13:58 by zyw9527
 */

public class UserVO implements Serializable {

    private String username;

    private int  age;

    private  String address;

    public String getUsername() {
        return this.username;

    }

    public void setUsername(String username) {
        this.username = username;
    }

    public int getAge() {
        return this.age;

    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getAddress() {
        return this.address;

    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "UserVO{" +
                "username='" + username + '\'' +
                ", age=" + age +
                ", address='" + address + '\'' +
                '}';
    }
}
