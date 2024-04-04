package com.jspides.filehandling.operations;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
public class CharStreamWrite {
	public static void main(String[] args) {
		File file = new File("demo.text");
		if (file.exists()) {
			try {
				FileWriter fileWriter = new FileWriter(file);
				fileWriter.write("This Is the data i want to write");
				System.out.println("Data is Written");
				fileWriter.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} else {
			try {
				file.createNewFile();
				System.out.println("File is Created");
				FileWriter fileWriter = new FileWriter(file);
				fileWriter.write("This Is the data i want to write");
				System.out.println("Data is Written");
				fileWriter.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
