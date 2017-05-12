package com.second.model;

import java.io.Serializable;
import java.util.Date;

/**
 * @author 
 */
public class Collect implements Serializable {
    /**
     * 收藏夹表id,主键自增
     */
    private Integer id;

    /**
     * 买家id,来自买家表
     */
    private Integer buyerId;

    /**
     * 商品id,来自商品表
     */
    private Integer productId;

    /**
     * 创建时间
     */
    private Date created;

    /**
     * 更新时间
     */
    private Date updated;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getBuyerId() {
        return buyerId;
    }

    public void setBuyerId(Integer buyerId) {
        this.buyerId = buyerId;
    }

    public Integer getProductId() {
        return productId;
    }

    public void setProductId(Integer productId) {
        this.productId = productId;
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