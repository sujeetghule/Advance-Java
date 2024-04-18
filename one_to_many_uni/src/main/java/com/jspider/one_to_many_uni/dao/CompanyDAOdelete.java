package com.jspider.one_to_many_uni.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.jspider.one_to_many_uni.dto.Company;

public class CompanyDAOdelete {
	private static EntityManagerFactory entityManagerFactory;
	private static EntityManager entityManager;
	private static EntityTransaction entityTransaction;
	
	private static void openConnection() {

		entityManagerFactory = Persistence.createEntityManagerFactory("persone");
		entityManager = entityManagerFactory.createEntityManager();
		entityTransaction = entityManager.getTransaction(); 
		
	}

	private static void closeConnection() {
		if (entityManager != null) {
			entityManager.close();
		}
		if (entityManagerFactory != null) {
			entityManagerFactory.close();
		}
		if (entityTransaction != null) {
			if (entityTransaction.isActive()) {
				entityTransaction.rollback();
			}
		}
	}
	
	public static void main(String[] args) {
		openConnection();
		
	 Company company = 	entityManager.find(Company.class, 3);
	
	 if (company != null) {
		entityTransaction.begin();
		entityManager.remove(company);
		entityTransaction.commit();
	}else {
		System.out.println("Company Does Not Exits");
	}
		
		closeConnection();
	}

}
