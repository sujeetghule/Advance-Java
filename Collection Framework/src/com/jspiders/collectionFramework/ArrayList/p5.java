package com.jspiders.collectionFramework.ArrayList;
import java.util.ArrayList;
class p5
{
	public static void main(String[] args) 
	{
		ArrayList a = new ArrayList();
		a.add(true);
		a.add("List");
		a.add(123);
		a.add('a');
		for (int i=0;i<a.size() ;i++ )
		{
		System.out.println(a.get(i));
		}
		
	}
}
