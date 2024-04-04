package com.jspiders.jdbc.operations;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

public class JDBCUpdate {
	private static Driver driver;
	private static Connection connection;
	private static Statement statement;
	private static String query;

	public static void main(String[] args) {
		try {
			openConnection();

			statement = connection.createStatement();
			query = "UPDATE user SET password = 'New Password' WHERE id = 2";

			int res = statement.executeUpdate(query);

			System.out.println(res + " row(s) affected");

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				closeConnection();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}

	private static void openConnection() throws ClassNotFoundException, SQLException, IOException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		driver = new com.mysql.cj.jdbc.Driver();
		DriverManager.registerDriver(driver);
		
		
		File file = new File("G:\\My Drive\\Q Spider\\JAVA\\J2EE E1\\jdbc\\src\\com\\jspiders\\jdbc\\db_info.txt");
		FileReader fileReader = new FileReader(file);
		
		Properties properties = new Properties();
		properties.load(fileReader);
			
		
		connection = DriverManager.getConnection(properties.getProperty("url"), properties);
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
