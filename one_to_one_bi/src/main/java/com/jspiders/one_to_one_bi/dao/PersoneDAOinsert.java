package com.jspiders.one_to_one_bi.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.jspiders.one_to_one_bi.dto.Aadhar;
import com.jspiders.one_to_one_bi.dto.Persone;

public class PersoneDAOinsert {
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
		
		Persone persone = new Persone();
		persone.setName("Sujeet");
		persone.setEmail("Sujeetghuule@gmail.com");
		persone.setMobile("9879879878");

		Aadhar aadhar = new Aadhar();
		aadhar.setAadhar_id(123456789123l);
		aadhar.setPersone(persone);
		
		persone.setAadhar(aadhar);
		
		
		
		openConnection();
		entityTransaction.begin();
		entityManager.persist(aadhar);
		entityManager.persist(persone);
		entityTransaction.commit();
		
		closeConnection();
	}

}
