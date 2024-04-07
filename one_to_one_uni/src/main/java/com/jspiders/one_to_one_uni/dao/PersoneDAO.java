package com.jspiders.one_to_one_uni.dao;

import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.jspiders.one_to_one_uni.dto.Aadhar;
import com.jspiders.one_to_one_uni.dto.Persone;

public class PersoneDAO {

	private static EntityManagerFactory entityManagerFactory;
	private static EntityManager entityManager;
	private static EntityTransaction entityTransaction;
	
	public static void main(String[] args) {
		
		Aadhar aadhar = new Aadhar();
		Persone persone = new Persone();

		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter Name");
		String name = scanner.nextLine();
		
		System.out.println("Enter Mobile NO ");
		String mobile = scanner.nextLine();
		
		System.out.println("Enter Email");
		String email = scanner.nextLine();
		
		System.out.println("Enter Aadhar Number");
		long aadharNumber = scanner.nextLong();
		
		scanner.close();
		persone.setName(name);
		persone.setMobile(mobile);
		persone.setEmail(email);
		aadhar.setAadhar_id(aadharNumber);

		persone.setAadhar(aadhar);
		
		openConnection();
		
		entityTransaction.begin();
			
		entityManager.persist(aadhar);
		entityManager.persist(persone);
		
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
