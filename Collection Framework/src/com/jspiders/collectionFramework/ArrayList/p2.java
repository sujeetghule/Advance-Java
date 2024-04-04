package com.jspiders.collectionFramework.ArrayList;

import java.util.ArrayList;
class p2 
{
	public static void main(String[] args) 
	{
		ArrayList a = new ArrayList();

		System.out.println(a);
		System.out.println(a.isEmpty());
		a.add(true);
		a.add("List");
		a.add(123);
		a.add(123);
		a.add(100.123);
		a.add('a');
		a.add('a');
		System.out.println(a);
		System.out.println(a.isEmpty());
		System.out.println(a.size());
	}
}
