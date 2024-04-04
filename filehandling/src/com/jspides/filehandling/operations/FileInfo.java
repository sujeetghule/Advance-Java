package com.jspides.filehandling.operations;
import java.io.File;
public class FileInfo {
	public static void main(String[] args) {
		File file = new File("demo1.txt");

		if (file.exists()) {
			System.out.println(file.getName());
			System.out.println(file.getAbsolutePath());
			System.out.println(file.length());
			if (file.canExecute()) {
				System.out.println("File is Executable");
			} else {
				System.out.println("File Not Executable");

			}
			if (file.canWrite()) {
				System.out.println("File is Writeable");
			} else {
				System.out.println("File Not Writeable");

			}
			if (file.canRead()) {
				System.out.println("File is Readable");
			} else {
				System.out.println("File Not Readable");

			}
			
		}
		else {
			System.out.println("NO file Found");

		}
	}

}
