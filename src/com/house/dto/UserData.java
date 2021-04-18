package com.house.dto;

import com.house.entity.User;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * 用户数据传输对象
 * @author chriy
 */
@NoArgsConstructor
@AllArgsConstructor
@Data
public class UserData {
	private int code;

	private String msg;

	private int count;

	private List<User> data;


	public UserData(int code, String msg, int count, List<User> data) {
		this.code = code;
		this.msg = msg;
		this.count = count;
		this.data = data;
	}

	public UserData() {
	}

	public int getCode() {
		return code;
	}

	public String getMsg() {
		return msg;
	}

	public int getCount() {
		return count;
	}

	public List<User> getData() {
		return data;
	}

	public void setCode(int i) {
    	this.code = i;
    }

	public void setCount(int size) {
    	this.count = size;
	}

	public void setData(List<User> findAllUser) {
    	this.data = findAllUser;
	}

	public void setMsg(String ok) {
    	this.msg = ok;
	}
}
