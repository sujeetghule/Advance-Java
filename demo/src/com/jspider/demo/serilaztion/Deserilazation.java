package com.jspider.demo.serilaztion;

import java.io.File;
import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class Deserilazation {
	
	public static void main(String[] args) {
		try {
			
			File file = new File("Demo.txt");
			
			FileInputStream fileInputStream = new FileInputStream(file);
			ObjectInputStream inputStream = new ObjectInputStream(fileInputStream);
			
			Persone persone =  (Persone) inputStream.readObject();
			System.out.println(persone);
			inputStream.close();
			
		} catch (Exception e) {
			// TODO: handle exception
		}
	}

}
