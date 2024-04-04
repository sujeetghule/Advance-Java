package com.jspiders.jdbc.operations;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
public class JDBCInsert {
	public static void main(String[] args) {
		
		try {
			//Load the register and Driver
			Class.forName("com.mysql.cj.jdbc.Driver");
			Driver driver = new com.mysql.cj.jdbc.Driver();
			
			DriverManager.registerDriver(driver);
			
			//Open Connection
			
			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/weje1?user=root&&password=root");
			
			//create the Statement
			Statement statement = connection.createStatement();
		
			
			//Execute the statement
			
			Boolean flag = statement.execute("INSERT INTO user VALUES(2, 'Rushikesh', 'rshikesh@gmail.com','Rush@123',440404)");
			
			//Process the Result
			System.out.println(flag);
			System.out.println("Data Inserted");
			
			
			//Close the Connection
			statement.close();
			connection.close();
			
			//De-register the database Application
			DriverManager.deregisterDriver(driver);
		
			
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
		
		 
	}
}
