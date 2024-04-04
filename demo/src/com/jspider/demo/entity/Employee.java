package com.jspider.demo.entity;

public class Employee {

	String Name;
	int age;

	public Employee(String n,int a) {
		// TODO Auto-generated constructor stub
		this.Name = n;
		this.age = a;
	}

	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		boolean a = false;
		Employee e2 = (Employee) obj;
		if (this.Name == e2.Name
				&& this.age==e2.age) {
			a = true;
		}
		return a;
	}

	
}
