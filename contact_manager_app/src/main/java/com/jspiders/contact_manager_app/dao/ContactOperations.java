package com.jspiders.contact_manager_app.dao;

import java.util.List;
import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Query;

import com.jspiders.contact_manager_app.dto.Contact;
import com.jspiders.contact_manager_app.main.ContactMain;

public class ContactOperations {

	private static EntityManager entityManager = ContactMain.getEntityManager();
	private static EntityTransaction entityTransaction = ContactMain.getEntityTransaction();

	public static void viewAllCOntact(Scanner scanner) {

		Query query = entityManager.createQuery("SELECT contact_appliction FROM Contact contact_appliction");

		@SuppressWarnings("unchecked")
		List<Contact> contacts = query.getResultList();
		if (contacts.size() > 0) {
			for (Contact contact : contacts) {
				System.out.println(contact);
			}

		} else {
			System.out.println("Contact Doest exits");
		}

	}

	public static void addConact(Scanner scanner) {
		try {

			Contact contact = new Contact();

			System.out.println("Enter First Name : ");
			contact.setFirstName(scanner.nextLine());

			System.out.println("Enter Last Name : ");
			contact.setLastName(scanner.nextLine());

			System.out.println("Enter Email : ");
			contact.setEmail(scanner.nextLine());

			System.out.println("Enter Mobile : ");
			contact.setMobileNo(scanner.nextLong());

			System.out.println("Select Categoey\n" + "\t1. Family\n" + "\t2. Friend\n" + "\t3. Work");
			int cat = scanner.nextInt();
			switch (cat) {
			case 1:
				contact.setCategory("Family");
				break;
			case 2:
				contact.setCategory("Friend");
				break;
			case 3:
				contact.setCategory("Work");
				break;

			default:
				System.out.println("Wrong Input Enter Detail Again");
				addConact(scanner);
				break;
			}
			entityTransaction.begin();
			entityManager.persist(contact);
			entityTransaction.commit();
		} catch (Exception e) {
			e.printStackTrace();
			addConact(scanner);
		}

	}

	public static void updateContact(Scanner scanner) {
		System.out.println("List : ");
		viewAllCOntact(scanner);
		System.out.println("\nEnter the ID to update");
		int id = scanner.nextInt();
		Contact contact = entityManager.find(Contact.class, id);
		if (contact != null) {

			System.out.println("\t1.Update Full details\n" + "\t2.Update Only Name" + "\n\t3.Update Only Email"
					+ "\n\t4.Update Only Mobile Number" + "\n\t5.Update Only Category" + "\nEnter Choice");
			int choice = scanner.nextInt();
			scanner.nextLine();

			switch (choice) {
			case 1:
				System.out.println("Enter First Name : ");
				contact.setFirstName(scanner.nextLine());

				System.out.println("Enter Last Name : ");
				contact.setLastName(scanner.nextLine());

				System.out.println("Enter Email : ");
				contact.setEmail(scanner.nextLine());

				System.out.println("Enter Mobile : ");
				contact.setMobileNo(scanner.nextLong());

				System.out.println("Select Categoey\n" + "\t1. Family\n" + "\t2. Friend\n" + "\t3. Work");
				int cat = scanner.nextInt();
				switch (cat) {
				case 1:
					contact.setCategory("Family");
					break;
				case 2:
					contact.setCategory("Friend");
					break;
				case 3:
					contact.setCategory("Work");
					break;

				default:
					System.out.println("Wrong Input Enter Detail Again");
					updateContact(scanner);
					break;
				}
				break;
			case 2:
				System.out.println("Enter First NAme");
				String fNAme = scanner.nextLine();
				System.out.println("Enter Last Name");
				String lNAme = scanner.nextLine();
				contact.setFirstName(fNAme);
				contact.setLastName(lNAme);
				break;
			case 3:
				System.out.println("Enter Email : ");
				contact.setEmail(scanner.nextLine());
				break;
			case 4:
				System.out.println("Enter Mobile : ");
				contact.setMobileNo(scanner.nextLong());

				break;
			case 5:
				System.out.println("Select Categoey\n" + "\t1. Family\n" + "\t2. Friend\n" + "\t3. Work");
				int cate = scanner.nextInt();
				switch (cate) {
				case 1:
					contact.setCategory("Family");
					break;
				case 2:
					contact.setCategory("Friend");
					break;
				case 3:
					contact.setCategory("Work");
					break;

				default:
					System.out.println("Wrong Input Enter Detail Again");
					addConact(scanner);
					break;
				}
				break;

			default:
				System.out.println("Wrong Input Enter Detail Again");
				updateContact(scanner);
				break;
			}
			entityTransaction.begin();
			entityManager.persist(contact);
			entityTransaction.commit();

		} else {
			System.out.println("Contact Doest exits");
		}

	}

	public static void deleteContact(Scanner scanner) {
		System.out.println("List : ");
		viewAllCOntact(scanner);
		System.out.println("\nEnter the ID to be Deleted");
		int id = scanner.nextInt();

		Contact contact = entityManager.find(Contact.class, id);
		if (contact != null) {
			entityTransaction.begin();
			entityManager.remove(contact);
			entityTransaction.commit();

			System.out.println("\t**********Contat Deleted !!!!!*******");

		} else {
			System.out.println("Contact Doest exits");
		}

	}

	public static void serachContact(Scanner scanner) {
		System.out.println("\t***** Search By *****");
		System.out.println(
				"\t1. Search By ID\n\t2. Category\n\t3. Search By First Name\n\t4. Search By Last Name\n\t5. Search By Mobile No");
		int value = scanner.nextInt();
		scanner.nextLine();
		switch (value) {
		case 1:
			System.out.println("Enter Id to Find Details");
			int tid = scanner.nextInt();
			scanner.nextLine();

			Contact contact = entityManager.find(Contact.class, tid);
			if (contact != null) {
				System.out.println(contact);
			} else {
				System.out.println("Contact Doest exits");
			}

			break;
		case 2:
			System.out.println("Choose Category to Find Details");

			System.out.println("\n\t1. Family\n" + "\t2. Friend\n" + "\t3. Work");
			int cate = scanner.nextInt();
			String choice;
			if (cate == 1) {
				choice = "Family";
			} else if (cate == 2) {
				choice = "Friend";
			} else if (cate == 3) {
				choice = "Work";
			} else {
				choice = null;
			}
			if (choice != null) {
				Query query = entityManager
						.createQuery("SELECT contact_appliction FROM Contact contact_appliction WHERE Category = ?1 ");

				query.setParameter(1, choice);

				@SuppressWarnings("unchecked")
				List<Contact> contacts = query.getResultList();

				if (contacts.size() > 0) {
					for (Contact contact2 : contacts) {
						System.out.println(contact2);
					}
				} else {
					System.out.println("Contact Doest exits");

				}
			} else {
				System.out.println("Wrong Input Enter Detail Again");
				serachContact(scanner);
			}

			break;
		case 3:
			System.out.println("Enter First Name to Find Details");
			String fname = scanner.nextLine();

			Query query = entityManager
					.createQuery("SELECT contact_appliction FROM Contact contact_appliction WHERE FirstName = ?1 ");

			query.setParameter(1, fname);
			@SuppressWarnings("unchecked")
			List<Contact> contacts = query.getResultList();

			if (contacts.size()>0) {
				for (Contact contact2 : contacts) {
					System.out.println(contact2);
				}
			} else {
				System.out.println("Contact Doest exits");
			}

			break;
		case 4:
			System.out.println("Enter Last Name to Find Details");
			String lname = scanner.nextLine();

			Query query2 = entityManager
					.createQuery("SELECT contact_appliction FROM Contact contact_appliction WHERE LastName = ?1 ");

			query2.setParameter(1, lname);
			@SuppressWarnings("unchecked")
			List<Contact> contacts2 = query2.getResultList();

			if (contacts2.size()>0) {
				for (Contact contact2 : contacts2) {
					System.out.println(contact2);
				}
			} else {
				System.out.println("Contact Doest exits");
			}
			break;
		case 5:
			System.out.println("Enter Mobile Number to Find Details");
			long mo_no = scanner.nextLong();

			Query query_mo = entityManager
					.createQuery("SELECT contact_appliction FROM Contact contact_appliction WHERE MobileNo = ?1 ");

			query_mo.setParameter(1, mo_no);
			@SuppressWarnings("unchecked")
			List<Contact> contacts_mo = query_mo.getResultList();

			if (contacts_mo.size()>0) {
				for (Contact contact2 : contacts_mo) {
					System.out.println(contact2);
				}
			} else {
				System.out.println("Contact Doest exits");
			}
			break;

		default:
			System.out.println("Wrong Input Enter Detail Again");
			serachContact(scanner);
			break;
		}

	}

}
