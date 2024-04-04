package com.jspides.filehandling.operations;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
public class CharStreamRead2 {
	public static void main(String[] args) {
		File file = new File("demo.txt");
		if (file.exists()) {	
			try {
				Scanner scanner = new Scanner(file);
				
				while(scanner.hasNext()) {
					System.out.println(scanner.next());
				}
				System.out.println("Data above Data is fetch");
				scanner.close();
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		else {
			System.out.println("File Not Found");
		}
	}

}
