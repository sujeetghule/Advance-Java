package com.jspiders.contactmanager.entity;

public class Contact {
	private int Id;
	private String FirstName;
	private String LastName;
	private String Email;
	private long MobileNo;
	private String Category;
	
	public Contact(int id, String firstName, String lastName, String email, Long mobileNo, String category) {
		super();
		Id = id;
		FirstName = firstName;
		LastName = lastName;
		Email = email;
		MobileNo = mobileNo;
		Category = category;
	}

	public int getId() {
		return Id;
	}

	public void setId(int id) {
		Id = id;
	}

	public String getFirstName() {
		return FirstName;
	}

	public void setFirstName(String firstName) {
		FirstName = firstName;
	}

	public String getLastName() {
		return LastName;
	}

	public void setLastName(String lastName) {
		LastName = lastName;
	}

	public String getEmail() {
		return Email;
	}

	public void setEmail(String email) {
		Email = email;
	}

	public long getMobileNo() {
		return MobileNo;
	}

	public void setMobileNo(Long mobileNo) {
		MobileNo = mobileNo;
	}

	public String getCategory() {
		return Category;
	}

	public void setCategory(String category) {
		Category = category;
	}

	@Override
	public String toString() {
		return "Contact [Id=" + Id + ", FirstName=" + FirstName + ", LastName=" + LastName + ", Email=" + Email
				+ ", MobileNo=" + MobileNo + ", Category=" + Category + "]";
	}
	
	

	
}
