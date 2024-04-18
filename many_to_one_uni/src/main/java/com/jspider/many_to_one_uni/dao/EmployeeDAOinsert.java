package com.jspider.many_to_one_uni.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.jspider.many_to_one_uni.dto.Company;
import com.jspider.many_to_one_uni.dto.Employee;

public class EmployeeDAOinsert {

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
		Company company = new Company();
		
		company.setName("TATA");
		company.setLoction("Pune");
		
		
		Employee employee1 = new Employee();
		employee1.setName("Sujeet Ghule");
		employee1.setEmail("Sujeetghule8@gmail.com");
		employee1.setMobile(7028249561l);
		employee1.setCompany(company);
		
		Employee employee2 = new Employee();
		employee2.setName("Rushikesh Jay");
		employee2.setEmail("rush@gmail.com");
		employee2.setMobile(9865323265l);
		employee2.setCompany(company);
		
		
		openConnection();
		entityTransaction.begin();
		entityManager.persist(company);
		entityManager.persist(employee1);
		entityManager.persist(employee2);
		entityTransaction.commit();
		
		closeConnection();
		
		
	}

}
