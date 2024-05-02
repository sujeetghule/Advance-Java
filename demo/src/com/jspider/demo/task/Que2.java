package com.jspider.demo.task;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

import com.mysql.cj.jdbc.Driver;

public class Que2 {
	public static void main(String[] args) {

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");

			Driver driver = new Driver();
			DriverManager.registerDriver(driver);

			Connection connection = DriverManager
					.getConnection("jdbc:mysql://localhost:3306/demo?user=root&&password=root");

			Statement statement = connection.createStatement();

			Scanner scanner = new Scanner(System.in);
			
			
			System.out.println("Enter Email to find");
			String email = scanner.nextLine();
			
			System.out.println("enter the password");
			String pass = scanner.nextLine();
			
			scanner.close();
			ResultSet resultSet = statement.executeQuery("Select * from contact where email = '"+email+"' AND password ='"+pass+"'");
			
			
			
			
			if (resultSet.next()) {
				System.out.println("Data Found \n");
				
				System.out.println(resultSet.getInt(1));
				System.out.println(resultSet.getString(2));
				System.out.println(resultSet.getString(3));
				System.out.println(resultSet.getString(4));
				System.out.println(resultSet.getInt(5));

			}
			else {
				System.out.println("Data Not found");
			}

			statement.close();
			connection.close();
			DriverManager.deregisterDriver(driver);

		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
