package com.jspiders.hibernate.dto;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.jspiders.hibernate.dao.Contact;

public class ContactMain {

	private static EntityManagerFactory entityManagerFactory;
	private static EntityManager entityManager;
	private static EntityTransaction entityTransaction;
	
	
	public static void main(String[] args) {
		
		Contact contact = new Contact();
		
	//	contact.setId(2);
		contact.setFirstName("Suyash");
		contact.setLastName("Chandurkar");
		contact.setEmail("Suyash@gmail.com");
		contact.setMobile(989898989l);

		openConnection();
		
		entityTransaction.begin();
		
		entityManager.persist(contact);
		
		
		entityTransaction.commit();
		
		
		closeConnection();
		
		
	}
	
	public static void openConnection() {
		entityManagerFactory = Persistence.createEntityManagerFactory("contact_manager");
		
		entityManager = entityManagerFactory.createEntityManager();
		
		entityTransaction = entityManager.getTransaction();
		
	}
	public static void closeConnection() {
		
		if (entityManagerFactory!= null) {
			entityManagerFactory.close();
		}
		if (entityManager!=null) {
			entityManager.close();
		}
		if(entityTransaction != null) {
			if (entityTransaction.isActive()) {
				entityTransaction.rollback();
			}
		}
		
		
	}
	
	                                                                                                                                                 
	
	
}
