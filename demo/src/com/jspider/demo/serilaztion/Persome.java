package com.jspider.demo.serilaztion;

import java.io.Serializable;

public class Persome implements  Serializable{ 

	/**
	 * 
	 */
	private static final long serialVersionUID = -2558527042271429343L;
	private String Name;
	private String Email;
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getEmail() {
		return Email;
	}
	public void setEmail(String email) {
		Email = email;
	}
	@Override
	public String toString() {
		return "Persome [Name=" + Name + ", Email=" + Email + "]";
	}
	
	
}
