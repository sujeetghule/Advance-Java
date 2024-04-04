package com.jspides.filehandling.operations;
import java.io.File;
import java.io.IOException;
public class CreateFile2 {
	public static void main(String[] args) {
		File file = new File("G:\\My Drive\\Q Spider\\JAVA\\J2EE E1\\demo1.txt");
		
		try {
			boolean status = file.createNewFile();
			if(status) {
				System.out.println("File is Craeted");

			}else {
				System.out.println("File is Alrady Exist");

			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
