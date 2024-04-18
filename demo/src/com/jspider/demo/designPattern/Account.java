package com.jspider.demo.designPattern;

public class Account {

	private Account account;
	private Account() {
		super();
		System.out.println("Constructor invoked");
	}
	
	public Account createAccount() {
		if (account!=null) {
			account = new Account();
			
		}
		
		return account;
		
	}
	

}
