package com.jspiders.contactmanager.operations;

import java.util.ArrayList;
import java.util.Scanner;

import com.jspiders.contactmanager.entity.Contact;

import jdbc.ContactJDBC;

public class Operations {

	static ArrayList<Contact> list = new ArrayList<>();

	public Operations() {
	}

//	static {
//		Contact contact = new Contact(1, "John", "Doe", "john.doe@example.com", 1234567890L, "Friend");
//		Contact contact2 = new Contact(2, "Alice", "Smith", "alice.smith@example.com", 9876543210L, "Family");
//		Contact contact3 = new Contact(3, "Bob", "Johnson", "bob.johnson@example.com", 5555555555L, "Work");
//		Contact contact4 = new Contact(4, "Emily", "Brown", "emily.brown@example.com", 9998887770L, "Friend");
//		Contact contact5 = new Contact(5, "Michael", "Jones", "michael.jones@example.com", 1112223330L, "Family");
//		Contact contact6 = new Contact(6, "Sarah", "Williams", "sarah.williams@example.com", 4444444444L, "Work");
//		Contact contact7 = new Contact(7, "David", "Wilson", "david.wilson@example.com", 7777777777L, "Friend");
//		Contact contact8 = new Contact(8, "Emma", "Taylor", "emma.taylor@example.com", 8888888888L, "Family");
//		Contact contact9 = new Contact(9, "James", "Martinez", "james.martinez@example.com", 1231231230L, "Work");
//		Contact contact10 = new Contact(10, "Olivia", "Anderson", "olivia.anderson@example.com", 9999999999L, "Friend");
//		list.add(contact);
//		list.add(contact2);
//		list.add(contact3);
//		list.add(contact4);
//		list.add(contact5);
//		list.add(contact6);
//		list.add(contact7);
//		list.add(contact8);
//		list.add(contact9);
//		list.add(contact10);
//		;
//
//	}

	public static void addContact(Scanner scanner) {

		System.out.println("Operation One");
		System.out.println("Enter Id");
		int id = scanner.nextInt();
		scanner.nextLine();
		System.out.println("Enter firat Name");
		String firstName = scanner.nextLine();
		System.out.println("Enter Last Name");
		String lastName = scanner.nextLine();
		System.out.println("Enter Email");
		String email = scanner.nextLine();
		System.out.println("Enter Moile No");
		long mobileNo = scanner.nextLong();
		scanner.nextLine();
		System.out.println("Enter Categoey\n" + "\t1. Family\n" + "\t2. Friend\n" + "\t3. Work");
		int cat = scanner.nextInt();
		String category = "";
		switch (cat) {
		case 1:
			category = "Family";
			break;
		case 2:
			category = "Friend";
			break;
		case 3:
			category = "Work";
			break;

		default:
			break;
		}

		Contact contact = new Contact(id, firstName, lastName, email, mobileNo, category);
		
		list.add(contact);
		
		ContactJDBC.addContact(id, firstName, lastName, email, mobileNo, category);

		System.out.println("********* Data Inserted ************");


	}

	public static void viewAll() {

//		System.out.println("All Contacts:");
//
//		for (Contact contact : list) {
//
//			System.out.println(contact);
//		}
		
		
		ContactJDBC.viewAllJDBC();
		
		System.out.println("\n\n*********************");


	}

	public static void deleteContact(Scanner scanner) {
		viewAll();

		System.out.println("Enter the ID Which has to be Deleted");

		int id = scanner.nextInt();
		scanner.nextLine();
		Contact contactToBeDeleted = null;

		for (Contact contact : list) {
			if (contact.getId() == id) {
				contactToBeDeleted = contact;

			}
			else {
				System.out.println("Contact Not Found");
			}
		}
		list.remove(contactToBeDeleted);
		System.out.println("Contact Deleted");
	}

	public static void searchContact(Scanner scanner) {
		System.out.println("Search By");

		System.out.println(
				"\t1. Category\n\t2. Search By ID\n\t3. Search By First Name\n\t4. Search By Last Name\n\t5. Search By Mobile No");
		int value = scanner.nextInt();
		scanner.nextLine();
		switch (value) {
		case 1:
			Operations.serachByCategory(scanner);

			break;

		case 2:
			Operations.serachById(scanner);

			break;

		case 3:
			Operations.serachByFirstNAme(scanner);

			break;

		case 4:
			Operations.serachByLastName(scanner);

			break;

		case 5:
			Operations.serachByMONumber(scanner);

			break;

		default:
			System.out.println("You Enter Wronge Value");
			break;
		}
	}

	private static void serachByMONumber(Scanner scanner) {
		System.out.println("Enter The Mobile Number ");
		long moNum = scanner.nextLong();
		scanner.nextLine();
		if (!list.isEmpty()) {
			for (Contact contact : list) {

				if (contact.getMobileNo() == moNum) {
					System.out.println(contact);
				}
			}

		} else {
			System.out.println("List IS Empty");
		}

	}

	private static void serachByLastName(Scanner scanner) {
		System.out.println("Enter The Last Name ");
		String firstname = scanner.nextLine();

		if (!list.isEmpty()) {
			for (Contact contact : list) {

				if (contact.getLastName().equals(firstname)) {
					System.out.println(contact);
				}
			}
		} else {
			System.out.println("List IS Empty");
		}

	}

	private static void serachByFirstNAme(Scanner scanner) {
		System.out.println("Enter The First Name ");
		String firstname = scanner.nextLine();

		if (!list.isEmpty()) {
			for (Contact contact : list) {

				if (contact.getFirstName().equals(firstname)) {
					System.out.println(contact);
				}
			}
		} else {
			System.out.println("List IS Empty");
		}

	}

	private static void serachById(Scanner scanner) {
		System.out.println("Enter The Id ");
		int id = scanner.nextInt();
		scanner.nextLine();

		if (!list.isEmpty()) {
			for (Contact contact : list) {

				if (contact.getId() == id) {
					System.out.println(contact);
				}
			}
		}

		else {
			System.out.println("List IS Empty");
		}

	}

	private static void serachByCategory(Scanner scanner) {
		System.out.println("Enter Categoey\n" + "\t1. Family\n" + "\t2. Friend\n" + "\t3. Work");

		int value = scanner.nextInt();

		switch (value) {
		case 1:
			if (list.isEmpty()) {
				System.out.println("No Friend Avaliable");
			} else {
				for (Contact contact : list) {

					if (contact.getCategory() == "Family") {
						System.out.println(contact);
					}
				}
			}
			break;
		case 2:
			if (list.isEmpty()) {
				System.out.println("No Friend Avaliable");
			} else {

				for (Contact contact : list) {

					if (contact.getCategory() == "Friend") {
						System.out.println(contact);
					}
				}
			}
			break;
		case 3:
			if (list.isEmpty()) {
				System.out.println("No Friend Avaliable");
			} else {
				for (Contact contact : list) {

					if (contact.getCategory() == "Work") {
						System.out.println(contact);
					}
				}
			}
			break;

		default:
			System.out.println("You Entered Wrong INput");
			break;
		}

	}

	public static void editContact(Scanner scanner) {
		// TODO Auto-generated method stub
		ContactJDBC.viewAllJDBC();

		System.out.println("Enter the Id Which You want to edit");
		int editId = scanner.nextInt();
		for (Contact contact : list) {

			if (contact.getId() == editId) {

				System.out.println("Enter Id");
				int id = scanner.nextInt();
				scanner.nextLine();
				System.out.println("Enter firat Name");
				String firstName = scanner.nextLine();
				System.out.println("Enter Last Name");
				String lastName = scanner.nextLine();
				System.out.println("Enter Email");
				String email = scanner.nextLine();
				System.out.println("Enter Moile No");
				long mobileNo = scanner.nextLong();
				scanner.nextLine();
				System.out.println("Enter Categoey\n" + "\t1. Family\n" + "\t2. Friend\n" + "\t3. Work");
				int cat = scanner.nextInt();
				String category = "";
				switch (cat) {
				case 1:
					category = "Family";
					break;
				case 2:
					category = "Friend";
					break;
				case 3:
					category = "Work";
					break;

				default:
					break;
				}

				contact.setId(id);
				contact.setFirstName(firstName);
				contact.setCategory(category);
				contact.setEmail(email);
				contact.setLastName(lastName);
				contact.setMobileNo(mobileNo);
				System.out.println("Contact Updated Succ....\n");
			}
		}

	}
}
