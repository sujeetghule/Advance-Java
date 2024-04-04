package com.jspiders.hibernate.dto;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.jspiders.hibernate.dao.Contact;

public class ContactFindMain {
	
	private static EntityManagerFactory entityManagerFactory;
	private static EntityManager entityManager;
	private static EntityTransaction entityTransaction;
	
	public static void main(String[] args) {
		openConnection();
		
		Contact contact = entityManager.find(Contact.class, 1);
		if (contact!=null) {
			
			System.out.println(contact);
			
		}
		else {
			System.out.println("Conatact Not FOUND");
		}
		
		closeConnection();
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
