package com.jspider.demo.designPattern.singleTone;

public class AccountMain {

	public static void main(String[] args) {
		
		Account account = Account.getAccount();
		System.out.println(account);
		
		Account account2 = Account.getAccount();
		System.out.println(account2);
		
		Account account3 = Account.getAccount();
		System.out.println(account3);
		
	}
}
