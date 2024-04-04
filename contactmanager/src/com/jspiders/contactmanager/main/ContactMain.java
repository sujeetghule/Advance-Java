package com.jspiders.contactmanager.main;

import java.util.Scanner;

import com.jspiders.contactmanager.operations.Operations;

import jdbc.ContactJDBC;

public class ContactMain {
	public static Operations operations = new Operations();
	static boolean loop = true;

	public static void main(String[] args) {
		System.out.println("Welcome To Conatct Manager");
		while (loop) {
			App();
		}
		
		
	}

	private static void App() {
		System.out.println("\nChoose The Option\n1. ADD\n"
							+"2. View All\n"
							+"3. Edit\n"
							+"4. Delete\n"
							+"5. Search\n"
							+"6. Exit");
		try {
		Scanner scanner = new Scanner(System.in);
		int value = scanner.nextInt();
		switch (value) {
		case 1:
			Operations.addContact(scanner);
			break;
		case 2:
			Operations.viewAll();
			break;
		case 3:
		//	Operations.editContact(scanner);
			ContactJDBC.editContact(scanner);
			System.out.println("\n*********************\n");
			break;
		case 4:
//			Operations.deleteContact(scanner);
			ContactJDBC.deleteContactJDBC(scanner);

			System.out.println("\n*********************\n");

			break;
		case 5:
		//	Operations.searchContact(scanner);
			ContactJDBC.searchContactJDBC(scanner);
			System.out.println("\n*********************\n");
			
			break;
		case 6:
			System.out.println("Thank You  :) ");
			loop =false;
			
			break;

		default:
			break;
		}
		
	}
	
	catch (Exception e) {
		System.out.println(e);
	}

	}
}