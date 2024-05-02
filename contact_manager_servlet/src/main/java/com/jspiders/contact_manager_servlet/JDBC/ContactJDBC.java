package com.jspiders.contact_manager_servlet.JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.jspiders.contact_manager_servlet.entity.Contact;
import com.mysql.cj.jdbc.Driver;

public class ContactJDBC {

	static Driver driver;
	static Connection connection;
	static PreparedStatement preparedStatement;

	public static int saveContact(String fname, String lname, String mobile, String email, String dob,
			String category) {
		int res=0;
		try {

			openConnection();
			String query = "INSERT INTO contact_manager_servlet  (fname, lname, mobile, email, dob, category) VALUES (?,?,?,?,?,?)";
			preparedStatement = connection.prepareStatement(query);
			
			preparedStatement.setString(1, fname);
			preparedStatement.setString(2, lname);
			preparedStatement.setString(3, mobile);
			preparedStatement.setString(4, email);
			preparedStatement.setString(5, dob);
			preparedStatement.setString(6, category);

			preparedStatement.execute();
			res=1;
			System.out.println("Data Inserted");

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
		return res;
	}

	private static void closeConnection() throws SQLException {
		if (preparedStatement != null) {
			preparedStatement.close();
		}
		if (connection != null) {
			connection.close();
		}
		if (driver != null) {
			DriverManager.deregisterDriver(driver);
		}

	}

	private static void openConnection() throws ClassNotFoundException, SQLException {

		Class.forName("com.mysql.cj.jdbc.Driver");
		driver = new Driver();
		DriverManager.registerDriver(driver);
		connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/weje1", "root", "root");

	}

	public static List<Contact> allContacts() {
		List<Contact> contacts = new ArrayList<>();

		try {
			openConnection();
			String query="SELECT * FROM contact_manager_servlet";
			preparedStatement = connection.prepareStatement(query);
			
			ResultSet set = preparedStatement.executeQuery();
			while (set.next()) {
				Contact contact = new Contact();
				contact.setF_name(set.getString(2));
				contact.setL_name(set.getString(3));
				contact.setEmail(set.getString(4));
				contact.setDob(set.getString(5));
				contact.setMobile(set.getString(6));
				contact.setCategory(set.getString(7));
				contacts.add(contact);
			}
			for(Contact contact : contacts) {
				System.out.println(contact);
			}
			
			

		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();

		}
		finally {
			try {
				closeConnection();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}
		return contacts;
	}

	public static  List<Contact> select(String col, String name) {
		List<Contact> contacts = new ArrayList<>();

		try {
			openConnection();
	        String query = "SELECT * FROM contact_manager_servlet WHERE " + col + " LIKE '%"+name+"%'";
			
	        preparedStatement = connection.prepareStatement(query);
			
			ResultSet set = preparedStatement.executeQuery();
			while (set.next()) {
				Contact contact = new Contact();
				contact.setF_name(set.getString(2));
				contact.setL_name(set.getString(3));
				contact.setEmail(set.getString(4));
				contact.setDob(set.getString(5));
				contact.setMobile(set.getString(6));
				contact.setCategory(set.getString(7));
				contacts.add(contact);
			}
			for(Contact contact : contacts) {
				System.out.println(contact);
			}
			
			

		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();

		}
		finally {
			try {
				closeConnection();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}
		return contacts;
		
	}

	public static void DeleteOP() {
		System.out.println("Delete Operation");
		
	}

}
