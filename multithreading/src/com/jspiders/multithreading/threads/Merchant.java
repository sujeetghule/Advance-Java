package com.jspiders.multithreading.threads;

import com.jspiders.multithreading.resoures.Product;

public class Merchant extends Thread {
	private Product product;
	public Merchant(Product product) {
		super();
		this.product = product;
	}
	@Override
	public void run() {
		if(!product.Avaliable) {
			product.manufature();
	
		}
	}
}


