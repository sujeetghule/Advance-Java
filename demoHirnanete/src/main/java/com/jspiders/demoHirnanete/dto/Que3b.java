package com.jspiders.demoHirnanete.dto;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.jspiders.demoHirnanete.DAO.User;

public class Que3b {
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
		
		openConnection();
		
String query = "Select user from User user where id = ?1";
		Query query2 = entityManager.createQuery(query);
		query2.setParameter(1, 1);
		
		User user = (User) query2.getSingleResult();
		System.out.println(user);
		
		
		closeConnection();
		
		
		
	}
	
}
