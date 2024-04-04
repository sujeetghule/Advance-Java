package com.jspiders.jdbc.operations;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import com.mysql.cj.jdbc.Driver;

public class JDBCSelect {

	private static Driver driver;
	private static Connection connection;
	private static Statement statement;
	private static String query;
	private static ResultSet resultSet;

	public static void main(String[] args) {

		try {
			openConnection();
			statement = connection.createStatement();

			query = "SELECT * FROM user";
			
			
			
			boolean res = statement.execute(query);

			System.out.println(res);

			resultSet = statement.getResultSet();

			while (resultSet.next()) {
				System.out.println(resultSet.getInt(1) + "\t");
				System.out.println(resultSet.getString(2) + "\t");
				System.out.println(resultSet.getString(3) + "\t");
				System.out.println(resultSet.getString(4) + "\t");
				System.out.println(resultSet.getInt(5) + "\t");
				System.out.println(" ");

			}

		} catch (ClassNotFoundException | SQLException e) {
			System.out.println("Data not Inserted");
			System.out.println(e);
			// e.printStackTrace();
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
		if (resultSet != null) {
			resultSet.close();

		}
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
