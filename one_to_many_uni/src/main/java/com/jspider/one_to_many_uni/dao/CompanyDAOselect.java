package com.jspider.one_to_many_uni.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.jspider.one_to_many_uni.dto.Company;
import com.jspider.one_to_many_uni.dto.Employee;

public class CompanyDAOselect {

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
		
		Company company = entityManager.find(Company.class, 6);
		
		 List<Employee> employees = company.getEmployees();
		 
		 if (employees.size()>0) {
			 System.out.println(company.getCompnay_name()+" Has");
			 for (Employee employee : employees) {
					System.out.println(employee);
				}
		}
		 else {
			System.out.println("Company Does not Found");
		}
		
		
		
		closeConnection();
	}

}
