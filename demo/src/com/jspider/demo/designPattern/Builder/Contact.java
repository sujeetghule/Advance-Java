package com.jspider.demo.designPattern.Builder;

public class Contact {
	
	private int id;
	private String firstName;
	private String lastName;
	private String email;
	private String address;
	
	
	@Override
	public String toString() {
		return "Contact [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", email=" + email
				+ ", address=" + address + "]";
	}
	
	public Contact(int id, String firstName, String lastName, String email, String address) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.address = address;
	}
	
	
	

}
