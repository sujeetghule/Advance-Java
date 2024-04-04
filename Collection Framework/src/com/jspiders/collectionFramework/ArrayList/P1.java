package com.jspiders.collectionFramework.ArrayList;

import java.util.ArrayList;

public class P1 {

	public static void main(String[] args) {
		ArrayList obj = new ArrayList();
		System.out.println(obj.isEmpty());
		System.out.println(obj);
		obj.add("List");
		obj.add(123);
		obj.add('A');
		obj.add(100.101);
		System.out.println(obj);
		System.out.println(obj.isEmpty());
		System.out.println(obj.size());
	}
}
