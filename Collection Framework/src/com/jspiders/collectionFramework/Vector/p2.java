package com.jspiders.collectionFramework.Vector;
import java.util.Vector;
class p2 
{
	public static void main(String[] args) 
	{
		Vector a = new Vector();

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
