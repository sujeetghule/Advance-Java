package com.jspiders.multithreading.threads;

public class MyThread9 extends Thread {
	private String message;
	public MyThread9(String mess) {
		super();
		this.message = mess;
	}
	@Override
	public void run() {
		char[] arr = message.toCharArray();
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]);
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
	}	}	}
}

