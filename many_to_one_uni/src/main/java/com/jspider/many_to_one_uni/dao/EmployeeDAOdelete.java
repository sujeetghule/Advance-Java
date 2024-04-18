package com.jspider.many_to_one_uni.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.jspider.many_to_one_uni.dto.Employee;

public class EmployeeDAOdelete {
	private static EntityManagerFactory entityManagerFactory;
	private static EntityManager entityManager;
	private static EntityTransaction entityTransaction;

	public static void openConnection() {
		entityManagerFactory = Persistence.createEntityManagerFactory("employee");
		entityManager = entityManagerFactory.createEntityManager();
		entityTransaction = entityManager.getTransaction();
	}

	public static void closeConnection() {
		if (entityManagerFactory != null) {
			entityManagerFactory.close();
		}
		if (entityManager != null) {
			entityManager.close();
		}
		if (entityTransaction != null) {
			if (entityTransaction.isActive()) {
				entityTransaction.rollback();
			}
		}
	}
	

	public static void main(String[] args) {
		
		openConnection();
		
		Employee employee = entityManager.find(Employee.class, 2);
		
		entityTransaction.begin();
		
		entityManager.remove(employee);
		
		entityTransaction.commit();
		
		
		
		closeConnection();
		
		
	}
}
