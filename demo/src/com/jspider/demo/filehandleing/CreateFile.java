package com.jspider.demo.filehandleing;

import java.io.File;
import java.io.IOException;

public class CreateFile {

	public static void main(String[] args) {
		
		File file = new File("DEMO1.txt");
		
		try {
			boolean status = file.createNewFile();
			if (status) {
				System.out.println("File is created");
			} else {
				System.out.println("File Not created");
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
			
		
	}
}
