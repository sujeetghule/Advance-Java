package com.jspider.demo.JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.cj.jdbc.Driver;

public class Update {

	
	public static void main(String[] args) {
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Driver driver = new Driver();
			
			DriverManager.registerDriver(driver);
			
			Connection connection = DriverManager.getConnection(Select.URL);
			
			Statement statement = connection.createStatement();
			
			int i = statement.executeUpdate("update demo set id = 123 where id = 1");

			System.out.println(i);
			
			statement.close();
			connection.close();
			DriverManager.deregisterDriver(driver);
			
			
			
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
	}
	
}
