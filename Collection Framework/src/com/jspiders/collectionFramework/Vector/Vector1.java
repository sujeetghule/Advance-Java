package com.jspiders.collectionFramework.Vector;

import java.util.Vector;

public class Vector1 {

	public static void main(String[] args) {
		Vector obj = new Vector();
		System.out.println(obj.isEmpty());
		System.out.println(obj);
		obj.add("List");
		obj.add(123);
		obj.add('A');
		obj.add(100.101);
		System.out.println(obj);
		System.out.println(obj.isEmpty());
	}
}
