package com.jspider.demo.filehandleing;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class ByteRead {
	public static void main(String[] args) throws IOException {
		File file = new File("DEMO1.txt");

		if (file.exists()) {
			FileReader fileReader = new FileReader(file);
			
			int read = fileReader.read();
			System.out.println((char)read);
			fileReader.close();
			

		} else {
			System.out.println("File does not exits");
		}
	}

}
