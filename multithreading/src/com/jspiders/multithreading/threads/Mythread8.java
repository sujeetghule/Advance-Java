package com.jspiders.multithreading.threads;

public class Mythread8 extends Thread {

	@Override
	public void run() {
		for(int i= 1;i<5;i++) {
			System.out.println("Hello From "+this.getName());
			if(i==3) {
				//this.stop();
			}
		}
	}
	
}
