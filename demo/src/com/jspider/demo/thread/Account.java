package com.jspider.demo.thread;

public class Account {
	
	private double accountBalance;

	public Account(double accountBalance) {
		super();
		this.accountBalance = accountBalance;
	}
	
	public void deposite(double ammount) {
		System.out.println("Account BAlance : " + accountBalance);
		accountBalance += ammount;
		System.out.println("Ammount Creadted "+ammount);
		System.out.println("Updated BAlance : " + accountBalance);

		
	}
	
public   void withdrol(double ammount) {
	System.out.println("Account BAlance : " + accountBalance);
	accountBalance -= ammount;
	System.out.println("Ammount Debeted "+ammount);
	System.out.println("Updated BAlance : " + accountBalance);


	}
	

}
