package com.second.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

/**
 * @author 
 */
public class Order implements Serializable {
    /**
     * 订单id,主键自增
     */
    private Integer id;

    /**
     * 买家id,外键
     */
    private Integer buyerId;

    /**
     * 卖家id,外键
     */
    private Integer sellerId;

    /**
     * 总价格
     */
    private BigDecimal productPrice;

    /**
     * 运费
     */
    private BigDecimal trafficPrice;

    /**
     * 总价
     */
    private Long totalPrice;

    /**
     * 订单状态:未支付,已支付,待发货,已取消,已发货,已收货,未评论,已评论
     */
    private String status;

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

    public Integer getSellerId() {
        return sellerId;
    }

    public void setSellerId(Integer sellerId) {
        this.sellerId = sellerId;
    }

    public BigDecimal getProductPrice() {
        return productPrice;
    }

    public void setProductPrice(BigDecimal productPrice) {
        this.productPrice = productPrice;
    }

    public BigDecimal getTrafficPrice() {
        return trafficPrice;
    }

    public void setTrafficPrice(BigDecimal trafficPrice) {
        this.trafficPrice = trafficPrice;
    }

    public Long getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(Long totalPrice) {
        this.totalPrice = totalPrice;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
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