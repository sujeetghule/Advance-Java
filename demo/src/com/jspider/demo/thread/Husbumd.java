package com.jspider.demo.thread;

public class Husbumd extends Thread {

	private Account account;

	public Husbumd(Account account) {
		super();
		this.account = account;
	}
	

	@Override
	public void run() {
		account.deposite(10000);
		account.withdrol(2000);
	}
	

	
	
	
}
