package com.jspider.demo.designPattern.singleTone;

public class Account {

	private static Account account  = new Account();
	
	private Account() {
		System.out.println("Constructor invoked");
	}
	
	public static Account getAccount() {
		
		return account;
	}
}
