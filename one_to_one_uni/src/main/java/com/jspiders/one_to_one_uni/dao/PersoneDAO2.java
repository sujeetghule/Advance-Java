package com.jspiders.one_to_one_uni.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.jspiders.one_to_one_uni.dto.Aadhar;
import com.jspiders.one_to_one_uni.dto.Persone;

public class PersoneDAO2 {
	private static EntityManagerFactory entityManagerFactory;
	private static EntityManager entityManager;
	private static EntityTransaction entityTransaction;
	
	
	public static void main(String[] args) {
		openConnection();
		entityTransaction.begin();
		
		Persone persone= entityManager.find(Persone.class, 2);
		Aadhar aadhar= entityManager.find(Aadhar.class, 3);
		
		if (persone!=null) {
			if (aadhar != null) {
				entityManager.remove(persone);
				entityManager.remove(aadhar);
			}
			else {
				System.out.println("Aadhar Does not Exits");
			}
		} else {
			System.out.println("Persone Does Not Exits");
		}
		entityTransaction.commit();
		closeConnection();
	}
	
	
	public static void openConnection() {
		entityManagerFactory = Persistence.createEntityManagerFactory("persone");
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
