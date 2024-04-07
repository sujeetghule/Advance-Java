package com.jspiders.contact_manager_app.main;

import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.jspiders.contact_manager_app.dao.ContactOperations;

public class ContactMain {
	static boolean loop = true;

	public static void main(String[] args) {
		
		
		openConnection();
		
		System.out.println("******************************************************"
				+ "\n\n************  Welcome to Conatct Appliction **********"
				+ "\n\n******************************************************");

		while (loop) {
			try {
				menu();
			} catch (Exception e) {
				e.printStackTrace();
				menu();
			}
			
		

		}
		closeConnection();
	}

	private static void menu() {
		System.out.println("\n\t**************** Main Menu **************\n");
		System.out.println("\t1.\tView Contact\n" + "\t2.\tADD Contact\n" + "\t3.\tUpdate Contact\n"
				+ "\t4.\tDelete Contact\n" + "\t5.\tSearch Contact\n" + "\t6.\tExit Contact Appliction\n");
		System.out.println("Enter Choice :- ");
		Scanner scanner = new Scanner(System.in);
		int choice = scanner.nextInt();
		scanner.nextLine();
		switch (choice) {
		case 1:
			ContactOperations.viewAllCOntact(scanner);
			break;
		case 2:
			ContactOperations.addConact(scanner);
			break;
		case 3:
			ContactOperations.updateContact(scanner);
			break;
		case 4:
			ContactOperations.deleteContact(scanner);
			break;
		case 5:
			ContactOperations.serachContact(scanner);
			break;
		case 6:
			loop = false;
			System.out.println("******************************************************"
					+ "\n\n********* Thank You !!! From Conatct Appliction ******"
					+ "\n\n******************************************************");

			break;

		default:
			System.out.println("*******************************Wrong Choice************");
			break;
		}

	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	private static EntityManagerFactory entityManagerFactory;
	private static EntityManager entityManager;
	private static EntityTransaction entityTransaction;

	
	
	public static EntityManagerFactory getEntityManagerFactory() {
		return entityManagerFactory;
	}


	public static EntityManager getEntityManager() {
		return entityManager;
	}

	

	public static EntityTransaction getEntityTransaction() {
		return entityTransaction;
	}

	
	public static void openConnection() {
		entityManagerFactory = Persistence.createEntityManagerFactory("contact_manager");
		entityManager = entityManagerFactory.createEntityManager();
		entityTransaction = entityManager.getTransaction();
	}
	public static void closeConnection() {

		if(entityManagerFactory!= null) {
			entityManagerFactory.close();
		}
		if (entityManager != null) {
			entityManager.close();
		}
		if (entityTransaction!= null) {
			if (entityTransaction.isActive()) {
				entityTransaction.rollback();
			}
		}
	}


}
