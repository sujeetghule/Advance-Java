package com.jspiders.multithreading.main;

import com.jspiders.multithreading.threads.MyThread9;

public class ThreadMain7 {

	public static void main(String[] args) {
		MyThread9 myThread9 = new MyThread9("Java Is programming");
		myThread9.start();
	}
}