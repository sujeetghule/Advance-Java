package com.jspider.demo.JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.cj.jdbc.Driver;

public class Insert1 {
	
	public static void main(String[] args) {
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			Driver driver = new Driver();
			DriverManager.registerDriver(driver);
			
			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/demo?user=root&&password=root");
			
			Statement statement = connection.createStatement();	
			
			
			
			boolean value = statement.execute("insert into demo values (2,'Ram')");
			System.out.println(value);
			
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

}
