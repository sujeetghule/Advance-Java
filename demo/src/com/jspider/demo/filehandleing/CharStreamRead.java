package com.jspider.demo.filehandleing;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class CharStreamRead {

public static void main(String[] args) {
	File file = new File("DEMO1.txt");
	if (file.exists()) {
		System.out.println("File is under Exeution");
		try {
			FileInputStream fileInputStream = new FileInputStream(file);
			
			int read = fileInputStream.read();
			
			System.out.println(read);
			fileInputStream.close();
			
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		

	} else {
		System.out.println("File does not exits");
	}
}
}
