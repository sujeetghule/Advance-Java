package com.jspiders.designpattern.main;

import com.jspiders.designpattern.creations.Account;

public class AccountMain {
	public static void main(String[] args) {
		
		Account account = Account.getObject();
		System.out.println(account);
		Account account1 = Account.getObject();
		System.out.println(account1);
		Account account2 = Account.getObject();
		System.out.println(account2);
		Account account3 = Account.getObject();
		System.out.println(account3);
	}

}
