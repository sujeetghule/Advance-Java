package com.jspiders.contact_manager_servlet.entity;

public class Contact {
	
	private String f_name;
	private String l_name;
	private String email;
	private String dob;
	private String mobile;
	private String category;
	
	public String getF_name() {
		return f_name;
	}
	public void setF_name(String f_name) {
		this.f_name = f_name;
	}
	public String getL_name() {
		return l_name;
	}
	public void setL_name(String l_name) {
		this.l_name = l_name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getDob() {
		return dob;
	}
	public void setDob(String dob) {
		this.dob = dob;
	}
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	@Override
	public String toString() {
		return "Contact [f_name=" + f_name + ", l_name=" + l_name + ", email=" + email + ", dob=" + dob + ", mobile="
				+ mobile + ", category=" + category + "]";
	}
	
	
	
}
