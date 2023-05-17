package com.rubypaper.dto;

import lombok.Data;

@Data
public class UserDTO_11 {

	// 11 주차 실습
	// sc3From.html
	
	// 1. 멤버변수
	// 2. 생성자 - 멤버변수들의 값을 초기화
	private String userName;
	private String userId;
	private String userPhone;
	
	
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getUserPhone() {
		return userPhone;
	}
	public void setUserPhone(String userPhone) {
		this.userPhone = userPhone;
	}
	@Override
	public String toString() {
		return "UserDTO_11 [userName=" + userName + ", userId=" + userId + ", userPhone=" + userPhone + "]";
	}
	
	
	
}
