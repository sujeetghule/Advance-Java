package com.jspides.filehandling.operations;
import java.io.File;
import java.io.IOException;
public class CreateFile {

	public static void main(String[] args) {
		File file = new File("demo1.txt");
		
		try {
			boolean status = file.createNewFile();
			if (status) {
				System.out.println("File is Created ");
			}
			else {
				System.out.println("File is Alreday Exits");
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
