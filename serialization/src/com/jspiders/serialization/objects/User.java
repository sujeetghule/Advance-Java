package com.jspiders.serialization.objects;
import java.io.Serializable;
public class User implements Serializable {
	private static final long serialVersionUID = 1L;
	private String username;
	private String email;
	private long mobileNo;
	private String password;
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public long getMobileNo() {
		return mobileNo;
	}
	public void setMobileNo(long mobileNo) {
		this.mobileNo = mobileNo;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	@Override
	public String toString() {
		return "User [username=" + username + ", email=" + email + 
				", mobileNo=" + mobileNo + ", password=" + password
				+ "]";
	}
	
	
	
	
	
}
