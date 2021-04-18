package com.house.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

/**
 * @author chriy
 */
@AllArgsConstructor
@Data
@NoArgsConstructor
public class Order {
    private int orderId;
    private int houseId;
    private int userId;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date orderTime;
    private String orderUser;

    public Order(int orderId, int houseId, int userId, Date orderTime, String orderUser) {
        this.orderId = orderId;
        this.houseId = houseId;
        this.userId = userId;
        this.orderTime = orderTime;
        this.orderUser = orderUser;
    }

    public Order() {
    }

    public int getOrderId() {
        return orderId;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    public int getHouseId() {
        return houseId;
    }

    public void setHouseId(int houseId) {
        this.houseId = houseId;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public Date getOrderTime() {
        return orderTime;
    }

    public void setOrderTime(Date orderTime) {
        this.orderTime = orderTime;
    }

    public String getOrderUser() {
        return orderUser;
    }

    public void setOrderUser(String orderUser) {
        this.orderUser = orderUser;
    }
}
