package com.jspiders.collectionFramework.Vector;
import java.util.Vector;
class p6
{
	public static void main(String[] args) 
	{
		Vector a = new Vector();
		a.add("Oreo");
		a.add("Parle G");

		Vector a2 = new Vector();
		a2.add("Ice-cream");
		a2.add("Hide-n-seek");

		System.out.println(a);
		System.out.println(a2);

		a2.add(a);
		System.out.println(a2);
		System.out.println(a2.size());
		
	}
}
