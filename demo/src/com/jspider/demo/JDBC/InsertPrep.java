package com.jspider.demo.JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.mysql.cj.jdbc.Driver;

public class InsertPrep {

	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Driver driver = new Driver();
			
			DriverManager.registerDriver(driver);
			Connection connection= DriverManager.getConnection(Select.URL);
			PreparedStatement preparedStatement = connection.prepareStatement("Insert into demo values(?,?)");
			
			preparedStatement.setInt(1, 4);
			preparedStatement.setString(2, "New Value");
			
			boolean execute = preparedStatement.execute();
			System.out.println(execute);
			
			
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}	
	
	
		
	
	
}
