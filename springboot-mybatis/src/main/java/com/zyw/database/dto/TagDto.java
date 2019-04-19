package com.zyw.database.dto;

import java.util.Date;

/**
 * 标签Dto
 *
 * @author: zyw9527
 * @version: v1.0  Created in 2019年04月19日  11:44 by zyw9527
 */

public class TagDto {

    private Integer id;
    private String name;
    private Date gmtCreate;

    private Date gmtModified;

    public Integer getId() {
        return this.id;

    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return this.name;

    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getGmtCreate() {
        return this.gmtCreate;

    }

    public void setGmtCreate(Date gmtCreate) {
        this.gmtCreate = gmtCreate;
    }

    public Date getGmtModified() {
        return this.gmtModified;

    }

    public void setGmtModified(Date gmtModified) {
        this.gmtModified = gmtModified;
    }
}
