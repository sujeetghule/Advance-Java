package com.jspiders.collectionFramework.Vector;
import java.util.Vector;
class p3 
{
	public static void main(String[] args) 
	{
		Vector a = new Vector();
		a.add(true);
		a.add("List");
		a.add(123);
		a.add('a');
		System.out.println(a);
		System.out.println(a.get(2));
		System.out.println(a.contains(123));
	}
}
