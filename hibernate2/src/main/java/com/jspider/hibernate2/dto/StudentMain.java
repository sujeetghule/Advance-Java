package com.jspider.hibernate2.dto;

import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.jspider.hibernate2.dao.Student;

public class StudentMain {

	private static EntityManagerFactory entityManagerFactory;
	private static EntityManager entityManager;
	private static EntityTransaction entityTransaction;
	
	
	public static void main(String[] args) {
		
		Student s1 = setData();
		
		openConnection();
		
		entityTransaction.begin();
		
		entityManager.persist(s1);
		
		entityTransaction.commit();
		
		closeConnection();
		
	}
	public static Student setData() {
		Student student = new Student();
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter First name");
		student.setFirstName(scanner.nextLine());
		
		System.out.println("Enter Last name");
		student.setLastName(scanner.nextLine());
		
		System.out.println("Enter Last name");
		student.setMarks(scanner.nextDouble());
		scanner.close();
		
		return student;

	}

	
	public static void openConnection() {
		entityManagerFactory = Persistence.createEntityManagerFactory("student_manager");
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
