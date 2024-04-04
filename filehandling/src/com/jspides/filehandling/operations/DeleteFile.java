package com.jspides.filehandling.operations;
import java.io.File;
public class DeleteFile {
	public static void main(String[] args) {
		File file = new File("G:\\My Drive\\Q Spider\\JAVA\\J2EE E1\\demo1.txt");
		
		if(file.exists()) {
			boolean status = file.delete();
			if(status) {
				System.out.println("File is Deleted");
			}else {
				System.out.println("File is not deleted");
			}
			
		}
		else {
			System.out.println("NO file Found");
		}
	}
}

