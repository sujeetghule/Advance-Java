package com.jspiders.multithreading.threads;

public class MyThread5 extends Thread{

	public void run() {
		for(int i=0;i<=5;i++) {
			System.out.println("Thread 5");
		}
	}
}
