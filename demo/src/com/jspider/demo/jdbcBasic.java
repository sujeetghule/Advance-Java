package com.jspider.demo;

import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;

import com.mysql.cj.jdbc.Driver;

public class jdbcBasic {

	public static Driver driver;
	public static Connection connection;
	public static Statement statement;
	public static String query;
	public static String url = "jdbc:mysql://localhost:3306/weje1?user=root&&password=root";

	public static void main(String[] args) {

		try {
			openConnection();

			Connection connection = DriverManager.getConnection(url);

//			query = "INSERT into user values (?,?,?,?,?)";
//
//			PreparedStatement preparedStatement = connection.prepareStatement(query);
//
//			System.out.println("Enter Id ");
//			Scanner scanner = new Scanner(System.in);
//			int id = scanner.nextInt();
//			scanner.nextLine();
//			System.out.println("Enter NAme");
//			String name = scanner.nextLine();
//			System.out.println("Enter Email");
//			String email = scanner.nextLine();
//
//			System.out.println("Enter Password");
//
//			String password = scanner.nextLine();
//
//			System.out.println("enter Mo No");
//			int mono = scanner.nextInt();
//
//			scanner.close();
//
//			preparedStatement.setInt(1, id);
//			preparedStatement.setString(2, name);
//			preparedStatement.setString(3, email);
//			preparedStatement.setString(4, password);
//			preparedStatement.setInt(5, mono);
//
//			preparedStatement.executeUpdate();

			
			query = "INSERT into demo values (?,?,?)";

			
			PreparedStatement preparedStatement = connection.prepareStatement(query);
			
			
			preparedStatement.setInt(1, 1);
			System.out.println("Data Instrd");
			preparedStatement.setString(2, "Rohit");
			System.out.println("Data Instrd");
			 
			FileInputStream img = new FileInputStream("G:\\My Drive\\Q Spider\\WEB TECH\\WEWE-6\\2.CSS\\images\\rohit.jpg");
			
			System.out.println("Image Loaded");
			preparedStatement.setBinaryStream(3,img);			
			
			preparedStatement.executeUpdate();
			
			System.out.println("Data Instrd");
			
			
			
			
			
			
			
			
			
			System.out.println("Data Insreted");

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				closeConnection();
			} catch (Exception e2) {
				// TODO: handle exception
			}
		}

	}

	public static void openConnection() {

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Driver driver = new Driver();
			DriverManager.registerDriver(driver);

		} catch (Exception e) {
			// TODO: handle exception
		}

	}

	public static void closeConnection() {
		try {
			statement.close();
			connection.close();
			DriverManager.deregisterDriver(driver);

		} catch (Exception e) {
			// TODO: handle exception
		}
	}
}
