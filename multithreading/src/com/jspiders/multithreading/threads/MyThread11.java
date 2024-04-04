package com.jspiders.multithreading.threads;

import com.jspiders.multithreading.resoures.MyResource2;

public class MyThread11 extends Thread{

	private MyResource2 myResource2;
	public MyThread11(MyResource2 myResource2) {
		super();
		this.myResource2 = myResource2;
	}
	@Override
	public void run() {
		synchronized (myResource2.Resource2) {
			System.out.println("MyThread11 Applid a lock on Resource2");
			synchronized (myResource2.Resource1) {
				System.out.println("MyThread11 Applid a lock on Resource1");
			}
		}
	}
}
