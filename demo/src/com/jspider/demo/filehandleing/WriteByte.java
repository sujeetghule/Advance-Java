package com.jspider.demo.filehandleing;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class WriteByte {
	public static void main(String[] args) {

		File file = new File("DEMO1.txt");
		if (file.exists()) {
			System.out.println("File is under Exeution");
			try {
				FileWriter fileWriter = new FileWriter(file);
				fileWriter.write("Java is the programming language");
				
				fileWriter.close();
				System.out.println("File is writeed");
				
				
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			
			
			

		} else {
			System.out.println("File does not exits");
		}

	}

}
