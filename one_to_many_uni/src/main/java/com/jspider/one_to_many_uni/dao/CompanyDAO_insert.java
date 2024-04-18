package com.jspider.one_to_many_uni.dao;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.jspider.one_to_many_uni.dto.Company;
import com.jspider.one_to_many_uni.dto.Employee;

public class CompanyDAO_insert {
	private static EntityManagerFactory entityManagerFactory;
	private static EntityManager entityManager;
	private static EntityTransaction entityTransaction;
	
	public static void main(String[] args) {
		
		Employee employee1 = new Employee();
		employee1.setName("Sujeet Ghule");
		employee1.setEmail("sujeetghule8@gmail.com");
		employee1.setMobile(7028249561l);
	
		Employee employee2 = new Employee();
		employee2.setName("Suyash Chandurkar");
		employee2.setEmail("susyshC@mail.com.com");
		employee2.setMobile(9696969696l);
		
		List<Employee> employees = new ArrayList<>();
		employees.add(employee1);
		employees.add(employee2);
		
		Company company = new Company();
		company.setCompnay_name("Tata");
		company.setCompany_location("Pune");
		company.setEmployees(employees);
		
		openConnection();
		
		entityTransaction.begin();
		
		
		entityManager.persist(company);

		
		entityTransaction.commit();
		closeConnection();
	}
	
	
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

}
