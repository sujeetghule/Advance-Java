package com.jspiders.multithreading.threads;

import com.jspiders.multithreading.resoures.Account;

public class Husband extends Thread{

	private Account account;

	public Husband(Account account) {
		super();
		this.account = account;
	}
	
	@Override
	public void run() {
		account.deposit(10000.00);
		account.withdro(3000.00);
	}
	 
}
