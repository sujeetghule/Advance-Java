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
@Table(name = "aadhar_info")
public class Aadhar {

	@Id
	@GeneratedValue(strategy =GenerationType.IDENTITY )
	private int id;
	
	@Column(nullable = false,unique = true)
	private long aadhar_id;
	
	@OneToOne(mappedBy = "aadhar")
	private Persone persone;
	

}
