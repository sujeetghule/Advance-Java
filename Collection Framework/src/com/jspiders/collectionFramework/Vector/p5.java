package com.jspiders.collectionFramework.Vector;
import java.util.Vector;
class p5
{
	public static void main(String[] args) 
	{
		Vector a = new Vector();
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
