package com.second.model;

import java.io.Serializable;

/**
 * @author 
 */
public class Role implements Serializable {
    /**
     * 角色表id,自增
     */
    private Integer id;

    /**
     * 角色名
     */
    private String name;

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
}