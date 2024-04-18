package com.jspider.demo.thread;

public class ThreadDeadLockMain {
	public static void main(String[] args) {
		
		Resource resource = new Resource();
		
		ThreadDeadlock1 deadlock1 = new ThreadDeadlock1(resource);
		
		ThreadDeadlock2 deadlock2 = new ThreadDeadlock2(resource);
		
		
		deadlock1.start();
		deadlock2.start();
		
		
	}

}
