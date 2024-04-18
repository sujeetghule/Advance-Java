package com.jspider.demo.filehandleing;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileByteWrite {

	public static void main(String[] args) {
		File file = new File("DEMO1.txt");

		if (file.exists()) {
			
			try {
				FileOutputStream fileOutputStream = new FileOutputStream(file);
				
				fileOutputStream.write(1760);
				
				System.out.println("File Witeed");
				fileOutputStream.close();
				
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			
			
		} else {
			System.out.println("FIle Not exits");
		}
		
	}
}
