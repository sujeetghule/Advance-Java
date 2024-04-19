package com.jspider.demo.JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

import com.mysql.cj.jdbc.Driver;

public class UpadatePrep {
	public static void main(String[] args) {
		
		try {
			
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			Driver driver = new Driver();
			
			DriverManager.registerDriver(driver);
			
			Connection connection = DriverManager.getConnection(Select.URL);
			
			PreparedStatement preparedStatement = connection.prepareStatement("UPDATE FROM demo SET id = ? where id = ?)");
			
			
			Scanner scanner = new Scanner(System.in);
			System.out.println("Enter Id to Edit");
			
			int preId = scanner.nextInt();
			scanner.nextLine();
			System.out.println("Enter new ID");
			
			int newInt = scanner.nextInt();
			
			
			preparedStatement.setInt(1, newInt);
			
			preparedStatement.setInt(2, preId);
			
			int b = preparedStatement.executeUpdate();
			System.out.println(b);
			
			scanner.close();

			
			
			
			
			
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		
		
	}

}
