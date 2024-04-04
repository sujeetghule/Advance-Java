package com.jspides.filehandling.operations;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
public class CharStreamRead1 {
	public static void main(String[] args) {
		File file = new File("demo.txt");
		if (file.exists()) {
			try {
				FileReader fileReader = new FileReader(file);
				int ch =  fileReader.read();
				System.out.println((char)ch);
				fileReader.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		else {
			System.out.println("File Doe not exits");
		}
	}

}

