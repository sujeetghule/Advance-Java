package com.jspiders.one_to_one_bi.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.jspiders.one_to_one_bi.dto.Aadhar;
import com.jspiders.one_to_one_bi.dto.Persone;

public class PersoneDAOdelete {
	private static EntityManagerFactory entityManagerFactory;
	private static EntityManager entityManager;
	private static EntityTransaction entityTransaction;
	
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
	public static void main(String[] args) {
		openConnection();
		Aadhar aadhar = entityManager.find(Aadhar.class, 1);
		Persone persone = aadhar.getPersone();
		
		entityTransaction.begin();
		
		entityManager.remove(persone);
		entityManager.remove(aadhar);
		
		entityTransaction.commit();
		
		closeConnection();
	}

}
