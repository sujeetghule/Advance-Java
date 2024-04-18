package com.jspider.demo.serilaztion;

import java.io.File;
import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class Deseralzation {

	public static void main(String[] args) {
		File file = new File("DEMONEW.txt");

		try {
			FileInputStream fileInputStream = new FileInputStream(file);
			ObjectInputStream inputStream = new ObjectInputStream(fileInputStream);
			
			Object object = inputStream.readObject();
			System.out.println(object);
			
			inputStream.close();
			
			
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
}
