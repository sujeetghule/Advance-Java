package com.jspider.demo.filehandleing;

import java.io.File;

public class FileInfo {
	public static void main(String[] args) {

		File file = new File("DEMO1.txt");

		if (file.exists()) {
			
			System.out.println(file.getName());
			System.out.println(file.getAbsolutePath());
			System.out.println(file.length());
			
			if (file.canExecute()) {
				System.out.println("File is exectable");
			} else {
				System.out.println("File is not excutable");
			}
			
			if (file.canRead()) {
				System.out.println("File is canRead");
			} else {
				System.out.println("File is not canRead");
			}
			if (file.canWrite()) {
				System.out.println("File is write");
			} else {
				System.out.println("File is not write");
			}
			
		} else {
			System.out.println("FIle Not exits");
		}

	}

}
