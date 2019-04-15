package com.zyw.database.dto;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.Date;

/**
 * tag
 *
 * @author
 */
public class TagDto implements Serializable {

    private Integer id;

    private String name;

    private Date gmtCreate;

    private Date gmtModified;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
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