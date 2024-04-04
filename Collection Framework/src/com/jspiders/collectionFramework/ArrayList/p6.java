package com.jspiders.collectionFramework.ArrayList;
import java.util.ArrayList;
class p6
{
	public static void main(String[] args) 
	{
		ArrayList a = new ArrayList();
		a.add("Oreo");
		a.add("Parle G");

		ArrayList a2 = new ArrayList();
		a2.add("Ice-cream");
		a2.add("Hide-n-seek");

		System.out.println(a);
		System.out.println(a2);

		a2.add(a);
		System.out.println(a2);
		System.out.println(a2.size());
		
	}
}
