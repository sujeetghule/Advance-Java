package com.jspiders.serialization.operations;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import com.jspiders.serialization.objects.User;
public class Serialization {
	public static void main(String[] args) {
		File file = new File("demo.txt");
		try {
			FileOutputStream fileOutputStream = new FileOutputStream(file);
			ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
			User user = new User();
			user.setUsername("Ram");
			user.setPassword("Ram@123");
			user.setEmail("ram@gmail.com");
			user.setMobileNo(987654321);
			objectOutputStream.writeObject(user);
			System.out.println("Object is serialized");
			objectOutputStream.close();
			fileOutputStream.close();
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
} 
