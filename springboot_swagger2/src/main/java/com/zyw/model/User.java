package com.zyw.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * 用户
 *
 * @author: zyw9527
 * @version: v1.0  Created in 2019年04月18日  19:31 by zyw9527
 */
@ApiModel(value = "用户信息")
public class User {
    /**
     * 主键id
     */
    @ApiModelProperty("主键id")

    private Long id;
    /**
     * 姓名
     */
    @ApiModelProperty("姓名")
    private String name;
    /**
     * 年龄
     */
    @ApiModelProperty("年龄")
    private String age;

    public Long getId() {
        return this.id;

    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return this.name;

    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return this.age;

    }

    public void setAge(String age) {
        this.age = age;
    }
}
