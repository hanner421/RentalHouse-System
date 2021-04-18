package com.house.dto;

import com.house.entity.House;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * 房源数据传输对象
 *
 * @author chriy
 */
@AllArgsConstructor
@NoArgsConstructor
@Data
public class UserHouseData {
    private int code;
    private String msg;
    private int count;
    private List<House> data;

    public UserHouseData(int code, String msg, int count, List<House> data) {
        this.code = code;
        this.msg = msg;
        this.count = count;
        this.data = data;
    }

    public UserHouseData() {
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

    public List<House> getData() {
        return data;
    }

    public void setData(List<House> data) {
        this.data = data;
    }
}
