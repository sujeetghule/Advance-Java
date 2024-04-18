package com.jspider.many_to_many_uni.dao;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.jspider.many_to_many_uni.dto.Student;
import com.jspider.many_to_many_uni.dto.Subject;

public class StudentDAOinsert {
	private static EntityManagerFactory entityManagerFactory;
	private static EntityManager entityManager;
	private static EntityTransaction entityTransaction;

	public static void openConnection() {
		entityManagerFactory = Persistence.createEntityManagerFactory("student");
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

		Subject s1 = new Subject();
		s1.setName("Core Java");
		s1.setFees(15500);

		Subject s2 = new Subject();
		s2.setName("SQL");
		s2.setFees(11111);

		List<Subject> subjects = new ArrayList<>();
		subjects.add(s1);
		subjects.add(s2);

		Student student1 = new Student();
		student1.setName("Sujeet Ghule");
		student1.setMobile(8798798798l);
		student1.setEmail("sujeetghule12@gamil.com");
		student1.setSubjects(subjects);

		Student student2 = new Student();
		student2.setName("Rushi Ghule");
		student2.setMobile(9999999999l);
		student2.setEmail("Rushi@gamil.com");
		student2.setSubjects(subjects);
		
		openConnection();

		entityTransaction.begin();

		entityManager.persist(s1);
		entityManager.persist(s2);
		
		entityManager.persist(student1);
		entityManager.persist(student2);

		entityTransaction.commit();

		closeConnection();

	}
}
