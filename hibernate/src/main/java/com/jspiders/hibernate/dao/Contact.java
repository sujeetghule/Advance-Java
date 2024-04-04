package com.jspiders.hibernate.dao;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;
@Data
@Entity
@Table(name = "contact_info")

public class Contact {

	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@Column( nullable = false )
	private String firstName;
	
	@Column( nullable = false )
	private String lastName;
	
	@Column (nullable = false,unique = true)
	private String Email;
	
	@Column (nullable = false,unique = true)
	private Long mobile;
	


}

