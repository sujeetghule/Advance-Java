package com.jspiders.multithreading.threads;

public class MyThread3 extends Thread {
	@Override
	public void run() {
		System.out.println(this.getId());
		System.out.println(this.getName());
		System.out.println(this.getPriority());

	}
}
