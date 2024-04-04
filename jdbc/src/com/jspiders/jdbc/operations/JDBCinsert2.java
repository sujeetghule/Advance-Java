package com.jspiders.jdbc.operations;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

import com.mysql.cj.jdbc.Driver;

public class JDBCinsert2 {
	private static Driver driver;
	private static Connection connection;
	private static Statement statement;
	private static String query;

	public static void main(String[] args) {
		

		try {
			openConnection();
			statement = connection.createStatement();

			Scanner scanner = new Scanner(System.in);
			System.out.println("Enter id");
			int id = scanner.nextInt();
			
			System.out.println("Enter name");
			String name = scanner.next();
			
			System.out.println("Enter Email");
			String email = scanner.next();
			
			System.out.println("Enter Password");
			String pass = scanner.next();
			
			System.out.println("Enter Nobile no");
			long mo = scanner.nextLong();
			
			scanner.close();
			
			
			
			query = "INSERT INTO user VALUES ("+id+", '"+name+"', '"+email+"','"+pass+"',"+mo+")";

			
			
			boolean res = statement.execute(query);

			System.out.println(res);
			System.out.println("Data Inserted");

		} catch (ClassNotFoundException | SQLException e) {
			System.out.println("Data not Inserted");
			System.out.println(e);
			//e.printStackTrace();
		} finally {
			try {
				closeConnection();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}

	}

	private static void openConnection() throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		driver = new Driver();
		DriverManager.registerDriver(driver);
		connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/weje1?user=root&&password=root");
	}

	private static void closeConnection() throws SQLException {
		if (statement != null) {
			statement.close();
		}
		if (connection != null) {
			connection.close();

		}
		if (driver != null) {
			DriverManager.deregisterDriver(driver);
		}
	}
}
