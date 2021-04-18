package com.house.dto;

import com.house.entity.UserOrder;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * 用户收藏数据传输对象
 *
 * @author chriy
 */
@AllArgsConstructor
@NoArgsConstructor
@Data
public class UserOrderData {
    private int code;
    private String msg;
    private int count;
    private List<UserOrder> data;

    public UserOrderData(int code, String msg, int count, List<UserOrder> data) {
        this.code = code;
        this.msg = msg;
        this.count = count;
        this.data = data;
    }

    public UserOrderData() {
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public List<UserOrder> getData() {
        return data;
    }

    public void setData(List<UserOrder> data) {
        this.data = data;
    }
}
