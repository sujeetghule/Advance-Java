package com.jspider.hibernate2.dao;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Data;

@Data
@Entity
public class Student {
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private int rollNo;
	
	@Column(nullable = false)
	private String  firstName;
	
	@Column(nullable = false)
	private String  lastName;
	
	@Column(nullable = false )
	private double marks;
	

}
