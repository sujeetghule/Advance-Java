package com.jspides.filehandling.operations;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class ByteStreamRead {
	public static void main(String[] args) {
		File file = new File("demo.txt");
		if (file.exists()) {
			try {
				FileInputStream fileInputStream = new FileInputStream(file);
				int b = fileInputStream.read();
				System.out.println(b);
				System.out.println("Data Featch From file");
				fileInputStream.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}else {
			System.out.println("File not Exists");
		}
		
	}

}
