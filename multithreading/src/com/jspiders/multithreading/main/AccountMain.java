package com.jspiders.multithreading.main;

import com.jspiders.multithreading.resoures.Account;
import com.jspiders.multithreading.threads.Husband;
import com.jspiders.multithreading.threads.wife;

public class AccountMain {

	public static void main(String[] args) {
		Account  account = new Account(10000);
		
		Husband husband= new Husband(account);
		wife wife = new wife(account);
		
		husband.start();
		wife.start();
	}
	
}
