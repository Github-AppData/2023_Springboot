package com.rubypaper.dto;

public class userDTO_12 {

	private String userName;
	private String userMbti;
	private String userGender;
	private String userAge;
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getUserMbti() {
		return userMbti;
	}
	public void setUserMbti(String userMbti) {
		this.userMbti = userMbti;
	}
	public String getUserGender() {
		return userGender;
	}
	public void setUserGender(String userGender) {
		this.userGender = userGender;
	}
	public String getUserAge() {
		return userAge;
	}
	public void setUserAge(String userAge) {
		this.userAge = userAge;
	}
	@Override
	public String toString() {
		return "userDTO_12 [userName=" + userName + ", userMbti=" + userMbti + ", userGender=" + userGender
				+ ", userAge=" + userAge + "]";
	}
	
}
