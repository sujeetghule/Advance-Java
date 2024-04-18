package com.jspider.demo.thread;

public class Wife extends Thread {
	private Account account;

	public Wife (Account account) {
		super();
		this.account = account;
	}
	

	@Override
	public void run() {
		account.deposite(500);
		account.withdrol(1000);
	}
	
}
