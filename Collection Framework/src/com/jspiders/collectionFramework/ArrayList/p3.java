package com.jspiders.collectionFramework.ArrayList;

import java.util.ArrayList;
class p3 
{
	public static void main(String[] args) 
	{
		ArrayList a = new ArrayList();
		a.add(true);
		a.add("List");
		a.add(123);
		a.add('a');
		System.out.println(a);
		System.out.println(a.get(2));
		System.out.println(a.contains(123));
	}
}
