package com.jspider.demo.filehandleing;

import java.io.File;

public class DeleteFile {
	public static void main(String[] args) {
		
		File file = new File("DEMO1.txt");

		if (file.exists()) {
			System.out.println("File is Present");
			boolean status = file.delete();
			if (status) {
				System.out.println("File is deleted");
			} else {
				System.out.println("File is  NOT deleted");

			}
		} else {

			System.out.println("File not exits");
		}
	}

}
