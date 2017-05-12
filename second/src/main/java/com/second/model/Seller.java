package com.second.model;

import java.io.Serializable;
import java.util.Date;

/**
 * @author 
 */
public class Seller implements Serializable {
    /**
     * 表id,自增
     */
    private Integer id;

    /**
     * 卖家登录名
     */
    private String name;

    /**
     * 卖家密码
     */
    private String password;

    /**
     * 卖家真实名字
     */
    private String realName;

    /**
     * 卖家邮箱
     */
    private String email;

    /**
     * 卖家电话
     */
    private String phone;

    /**
     * 卖家创建时间
     */
    private Date created;

    /**
     * 卖家更新时间
     */
    private Date updated;

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

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getRealName() {
        return realName;
    }

    public void setRealName(String realName) {
        this.realName = realName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public Date getCreated() {
        return created;
    }

    public void setCreated(Date created) {
        this.created = created;
    }

    public Date getUpdated() {
        return updated;
    }

    public void setUpdated(Date updated) {
        this.updated = updated;
    }
}