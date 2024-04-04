package com.jspider.demo;

public class Lazy {
	private static Lazy lazy = new Lazy();
	
	private Lazy(){
		System.out.println("Constructor Invoked");
	}
	
	public static Lazy createObject() {
		
		return lazy;
	}
	
	public static void main(String[] args) {
		Lazy l1 = createObject();
		System.out.println(l1);
		
		Lazy l2 = createObject();
		System.out.println(l2);
		
		Lazy l3 = createObject();
		System.out.println(l3);
	}
}
