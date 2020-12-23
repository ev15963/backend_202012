package com.proj.backend.domain;

public class UserVO {

	private String userID;
	private String name;
	
	public String getUserID() {
		return userID;
	}
	public void setUserID(String userID) {
		this.userID = userID;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "UserVO [userID=" + userID + ", name=" + name + "]";
	}
	
	
}
