package com.jspider.demo.main;

public class check {

//	Boxing
	public static void main(String[] args) {
		byte n1 = 2;
		short n2 = 23;
		int n3 = 123;
		long n4 = 123456;
		float n5 = 123.123f;
		double n6 = 123.1234;
		char n7 = 'F';
		boolean n8 = false;

		Byte obj1 = Byte.valueOf(n1);
		System.out.println(n1);
		System.out.println(obj1);
		
		Short obj2 = Short.valueOf(n2);
		System.out.println(n2);
		System.out.println(obj2);

		Integer obj3 = Integer.valueOf(n3);
		System.out.println(n3);
		System.out.println(obj3);
		
		Long obj4 = Long.valueOf(n4);
		System.out.println(n4);
		System.out.println(obj4);
		
		Float obj5 = Float.valueOf(n5);
		System.out.println(n5);
		System.out.println(obj5);

		Double obj6 = Double.valueOf(n6);
		System.out.println(n6);
		System.out.println(obj6);
		
		Character obj7 = Character.valueOf(n7);
		System.out.println(n7);
		System.out.println(obj7);
		
		Boolean obj8 = Boolean.valueOf(n8);
		System.out.println(n8);
		System.out.println(obj8.getClass());
		
		System.out.println(obj3*obj3);
	}
}
