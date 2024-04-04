package com.jspiders.multithreading.main;

import com.jspiders.multithreading.threads.Mythread8;

public class ThreadMain6 {

	public static void main(String[] args) {
		Mythread8 mythread8 = new Mythread8();
		mythread8.setName("Thread_8");
		mythread8.start();
	}
}
