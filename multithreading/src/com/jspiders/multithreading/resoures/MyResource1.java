package com.jspiders.multithreading.resoures;

public class MyResource1 {
	public void messsage() {
		for(int i = 0;i<5;i++) {
			System.out.println("Hellow From "+Thread.currentThread().getName());
		}
	}
}
