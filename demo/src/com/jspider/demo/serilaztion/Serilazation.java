package com.jspider.demo.serilaztion;

import java.io.File;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class Serilazation {

	public static void main(String[] args) {
		Persone persone = new Persone();
		persone.setEmail("Sujeet");
		persone.setName("Sujeet Ghule");
		
		
		try {
			File file = new File("Demo.txt");
			
			FileOutputStream fileOutputStream = new FileOutputStream(file);
			
			ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
			
			objectOutputStream.writeObject(persone);
			
			System.out.println("Object is swerilazed");
			objectOutputStream.close();

			
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		
		
	}
}
