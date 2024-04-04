package com.jspiders.multithreading.resoures;

public class Account {

	private double AccountBalance;

	public Account(double accountBalance) {
		AccountBalance = accountBalance;
	}
	
	public synchronized void deposit(double ammout) {
		System.out.println("Ammount of Rs "+ammout+" is Credited");
		AccountBalance+=ammout;
		System.out.println("Currnt Account Balance : "+AccountBalance+"\n");
	}
	
	public synchronized void withdro(double ammout) {
		System.out.println("Ammount of Rs "+ammout+" is Debited");
		AccountBalance-=ammout;
		System.out.println("Currnt Account Balance : "+AccountBalance+"\n");
	}
	
}
