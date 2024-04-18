package com.jspiders.one_to_one_uni.dao;

import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.jspiders.one_to_one_uni.dto.Persone;

public class PersoneDAOSelect {
	
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
		System.out.println("Enter Id to Search in DB");
		Scanner scanner= new Scanner(System.in);
		int value = scanner.nextInt();
		scanner.close();
		Persone persone =  entityManager.find(Persone.class, value);
		
		if (persone != null) {
			System.err.println(persone);
		}
		else {
			System.out.println("Person NOt Found");
		}
		
		
		
		
		
		
		closeConnection();
		
		
	}

}
