package com.jspider.demo.thread;

public class T1Main extends Thread{

	public static void main(String[] args) {
		T1 t1 = new T1();
		T2 t2 = new T2();
		
		t1.start();
		t2.start();
	}
}
