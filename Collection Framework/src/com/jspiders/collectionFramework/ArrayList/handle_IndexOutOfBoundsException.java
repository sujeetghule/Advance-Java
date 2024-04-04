package com.jspiders.collectionFramework.ArrayList;

import java.util.ArrayList;
class handle_IndexOutOfBoundsException
{
	public static void main(String[] args) 
	{
		ArrayList a = new ArrayList();
		a.add("Apple");
		a.add("Mango");
		a.add("Kivi");
		a.add("Banana");
		System.out.println(a);
		System.out.println(a.get(2));
		System.out.println(a.get(3));
		try
		{
		System.out.println(a.get(9));	
		}
		catch (Exception e)
		{
		System.out.println(e);
		}
		

	}
}
