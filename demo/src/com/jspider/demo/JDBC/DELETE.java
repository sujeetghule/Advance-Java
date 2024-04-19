package com.jspider.demo.JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

import com.mysql.cj.jdbc.Driver;

public class DELETE {

	
	public static void main(String[] args) {
		try {
			
			Class.forName("com.mysql.cj.jdbc.Driver");
			Driver driver = new Driver();
			
			DriverManager.registerDriver(driver);
			Connection connection = DriverManager.getConnection(Select.URL);
			Statement statement= connection.createStatement();
			
			boolean b = statement.execute("delete from demo where id = 123");
			
			System.out.println(b);
			
			statement.close();
			connection.close();
			DriverManager.deregisterDriver(driver);
			
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
	
}
