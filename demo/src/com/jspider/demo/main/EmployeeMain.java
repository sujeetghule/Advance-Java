package com.jspider.demo.main;

import com.jspider.demo.entity.Employee;

public class EmployeeMain {
	public static void main(String[] args) {
		Employee Emp1 = new Employee("Sujeet",23);
		Employee Emp2 = new Employee("Sujeet",23);

		System.out.println(Emp1);
		System.out.println(Emp2);

		if (Emp1.equals(Emp2)) {
			System.out.println("Both Are Equals");
		}
		else {
			System.out.println("Not Equals");
		}
		

	}
	
}

