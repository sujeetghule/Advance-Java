package com.jspiders.designpattern.creations;

public class User {

	private static User user = new User();

	private User() {
		System.out.println("Constructor Invoked");
	}

	public static User getObject() {

		return user;
	}

}
