package com.jspider.demo.task;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.cj.jdbc.Driver;

public class Que1 {

public static void main(String[] args) {
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			Driver driver = new Driver();
			DriverManager.registerDriver(driver);
			
			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/demo?user=root&&password=root");
			
			Statement statement = connection.createStatement();	
			
		
			
			System.out.println("Enter Id");
			
		
			
			boolean value = statement.execute("insert into contact values (2,'suyash','suyasht@gmail.com','newpassword',666999666)");
			System.out.println(value);
			
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
	
}
