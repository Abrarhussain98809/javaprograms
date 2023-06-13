package com.carapp.user.model;

public class UserDTO {
	private String email;
	private int password;
	private String userId;
	
	public UserDTO() {
		super();
		
	}
	
	public UserDTO(String email, int password, String userId) {
		super();
		this.email = email;
		this.password = password;
		this.userId = userId;
	}

	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public int getPassword() {
		return password;
	}
	public void setPassword(int password) {
		this.password = password;
	}
	
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	@Override
	public String toString() {
		return "UserDTO [email=" + email + ", password=" + password + ", userId=" + userId + "]";
	}
	
	

}
