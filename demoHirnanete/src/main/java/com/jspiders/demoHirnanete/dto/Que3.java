package com.jspiders.demoHirnanete.dto;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.jspiders.demoHirnanete.DAO.User;

public class Que3 {
	private static EntityManagerFactory entityManagerFactory;
	private static EntityManager entityManager;
	private static EntityTransaction entityTransaction;
	
	
	public static void openConnection() {
		entityManagerFactory = Persistence.createEntityManagerFactory("users");
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


	public static void main(String[] args) {
		
		User user= new User();
		user.setUsername("Sujeet");
		user.setEmail("sujeet@gmail.com");
		user.setPassword("Passords");
		user.setMobile("9988776655");
		
		openConnection();
		
		entityTransaction.begin();
		
		entityManager.persist(user);
		
		entityTransaction.commit();
		
		closeConnection();
		
	}
}
