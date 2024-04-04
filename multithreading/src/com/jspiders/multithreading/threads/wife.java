package com.jspiders.multithreading.threads;

import com.jspiders.multithreading.resoures.Account;

public class wife extends Thread {

	private Account account;

	public wife(Account account) {
		super();
		this.account = account;
	}
	
	@Override
	public void run() {
		account.deposit(2000);
		account.withdro(8000);
	}
	
}
