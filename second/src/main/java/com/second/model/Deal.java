package com.second.model;

import java.io.Serializable;
import java.util.Date;

/**
 * @author 
 */
public class Deal implements Serializable {
    /**
     * ,成交表id,主键自增
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
     * 成交时间
     */
    private Date dealTime;

    /**
     * 是否好评,0:好评,1:中评,2:差评,默认好评
     */
    private Integer isOpinioin;

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

    public Date getDealTime() {
        return dealTime;
    }

    public void setDealTime(Date dealTime) {
        this.dealTime = dealTime;
    }

    public Integer getIsOpinioin() {
        return isOpinioin;
    }

    public void setIsOpinioin(Integer isOpinioin) {
        this.isOpinioin = isOpinioin;
    }
}