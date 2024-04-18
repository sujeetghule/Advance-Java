package com.jspider.demo.thread;

public class AccountAction {

	public static void main(String[] args) {
		
		Account account = new Account(2000);
		
		Husbumd husbumd = new Husbumd(account);
		Wife wife = new Wife(account);
		
		husbumd.start();
		wife.start();
		
	}
}
