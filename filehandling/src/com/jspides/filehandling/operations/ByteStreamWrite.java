package com.jspides.filehandling.operations;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
public class ByteStreamWrite {
	public static void main(String[] args) {
		File file = new File("demo.txt");
		if (file.exists()) {	
			try {
				FileOutputStream fileOutputStream = new FileOutputStream(file);
				fileOutputStream.write(258);
				System.out.println("Data is Written");
				fileOutputStream.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}			
		}
		else {
			try {
				file.createNewFile();
				System.out.println("File is created");
				FileOutputStream fileOutputStream = new FileOutputStream(file);
				fileOutputStream.write(20);
				System.out.println("Data is Written");
				fileOutputStream.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
	}

}
