package com.jspiders.contact_manager_app.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "Contact_appliction")
public class Contact {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int Id;
	
	@Column(nullable = false, unique = false)
	private String FirstName;
	
	@Column(nullable = false, unique = false)
	private String LastName;

	@Column(nullable = false, unique = true)
	private String Email;

	@Column(nullable = false, unique = true)
	private long MobileNo;
	
	@Column(nullable = false, unique = false)
	private String Category;

}
