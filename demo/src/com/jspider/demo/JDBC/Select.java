package com.jspider.demo.JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.cj.jdbc.Driver;

public class Select {
	static String URL="jdbc:mysql://localhost:3306/demo?user=root&&password=root";
	
	public static void main(String[] args) {
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			Driver driver = new Driver();
			
			DriverManager.registerDriver(driver);
			
			Connection connection = DriverManager.getConnection(URL);
			
			Statement statement = connection.createStatement();
			
			ResultSet resultSet = statement.executeQuery("SElect * from demo");
			
			while (resultSet.next()) {
				System.out.println(resultSet.getInt(1));
				System.out.println(resultSet.getString(2));
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
