package com.jspiders.one_to_one_bi.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;



import lombok.Data;

@Data
@Entity
@Table(name = "persone_info")

public class Persone {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id ;
	
	@Column(nullable = false, unique = false )
	private String name;
	
	@Column(nullable = false, unique = true )
	private String email;
	
	@Column(nullable = false, unique = true )
	private String mobile;
	
	@OneToOne
	private Aadhar aadhar;
}
