package com.jspider.demo.serilaztion;

import java.io.File;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class Seralazartion {
	
	public static void main(String[] args) {
		File file = new File("DEMONEW.txt");
		
		try {
			FileOutputStream fileOutputStream = new FileOutputStream(file);
			ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
			
			Persome persome = new Persome();
			persome.setName("Suyash");
			persome.setEmail("Suysh@123");
			
			objectOutputStream.writeObject(persome);
			
			System.out.println("Object IS Seralized");
			objectOutputStream.close();
			fileOutputStream.close();
			
			
			
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		
	}

}
