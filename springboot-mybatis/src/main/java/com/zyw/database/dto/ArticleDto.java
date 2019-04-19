package com.zyw.database.dto;


import com.baomidou.mybatisplus.annotation.TableName;

import java.util.Date;

/**
 * 文章实体类
 *
 * @author: zyw9527
 * @version: v1.0  Created in 2019年04月15日  15:38 by zyw9527
 */
@TableName("article")
public class ArticleDto {

    private Long id;

    private String title;

    private String introduction;

    private String htmlMaterial;

    private String mdMaterial;

    private Date gmtCreate;

    private Date gmtModified;

    public Long getId() {
        return this.id;

    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return this.title;

    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getIntroduction() {
        return this.introduction;

    }

    public void setIntroduction(String introduction) {
        this.introduction = introduction;
    }

    public String getHtmlMaterial() {
        return this.htmlMaterial;

    }

    public void setHtmlMaterial(String htmlMaterial) {
        this.htmlMaterial = htmlMaterial;
    }

    public String getMdMaterial() {
        return this.mdMaterial;

    }

    public void setMdMaterial(String mdMaterial) {
        this.mdMaterial = mdMaterial;
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
