package com.jspider.one_to_many_uni.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.jspider.one_to_many_uni.dto.Company;
import com.jspider.one_to_many_uni.dto.Employee;

public class CompanyDAOdelete2 {
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

		Company company = entityManager.find(Company.class, 3);

		List<Employee> employees = company.getEmployees();

		Employee employeeToBeDETETED = null;

		for (Employee employee : employees) {
			if (employee.getId() == 6) {
				employeeToBeDETETED = employee;
			}
		}

		if (employeeToBeDETETED != null) {
			employees.remove(employeeToBeDETETED);
			company.setEmployees(employees);
			entityTransaction.begin();
			entityManager.persist(company);
			;
			entityTransaction.commit();

			Employee employee = entityManager.find(Employee.class, 6);
			entityTransaction.begin();
			entityManager.remove(employee);
			entityTransaction.commit();

			System.out.println("Employee Deteted Succesfully");

		} else {

			System.out.println("Emp not Found");
		}

		closeConnection();

	}

}
