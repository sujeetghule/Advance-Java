package com.jspider.demo.filehandleing;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class CharStreamread2 {
	public static void main(String[] args) {
		File file = new File("DEMO1.txt");

		if (file.exists()) {
			
			try {
				Scanner scanner = new Scanner(file);
				while (scanner.hasNextLine()) {
					System.out.println(scanner.nextLine());
				} 
				scanner.close();
				
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			
			
		} else {
			System.out.println("FIle Not exits");
		}
		
	}

}
