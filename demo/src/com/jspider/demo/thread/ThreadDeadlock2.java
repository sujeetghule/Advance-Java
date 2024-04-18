package com.jspider.demo.thread;

public class ThreadDeadlock2 extends Thread {
	private Resource resource1;

	public ThreadDeadlock2(Resource resource1) {
		super();
		this.resource1 = resource1;
	}
	
	@Override
	public void run() {
		synchronized (resource1.resource1) {
			System.out.println("My Applid a lock on Resource1");
			synchronized (resource1.resource2) {
				System.out.println("MyThread Applid a lock on Resource2");
			}
		}
	}
}
