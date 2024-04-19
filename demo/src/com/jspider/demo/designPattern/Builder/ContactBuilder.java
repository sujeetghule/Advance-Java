package com.jspider.demo.designPattern.Builder;

public class ContactBuilder {
	
	private int id;
	private String firstName;
	private String lastName;
	private String email;
	private String address;
	
	
	public ContactBuilder setId(int id) {
		this.id = id;
		return this;

	}
	public ContactBuilder setFirstName(String firstName) {
		this.firstName = firstName;
		return this;

	}
	public ContactBuilder setLastName(String lastName) {
		this.lastName = lastName;
		return this;

	}
	public ContactBuilder setEmail(String email) {
		this.email = email;
		return this;

	}
	public ContactBuilder setAddress(String address) {
		this.address = address;
		return this;

	}
	public Contact buildContact() {
		return new Contact(id, firstName, lastName, email, address);
	}
	
	
	
	
	

}
