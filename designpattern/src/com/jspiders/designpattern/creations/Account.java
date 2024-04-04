package com.jspiders.designpattern.creations;

public class Account {

	private static Account account;

	private Account() {
		System.out.println("Constructor Invoked");
	}
	
	public static Account getObject() {
		if (account==null) {
			account = new Account();
		}
		return account;
	}

	
	
}
