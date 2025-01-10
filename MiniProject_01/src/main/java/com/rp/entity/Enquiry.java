package com.rp.entity;



import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;



@Entity
@Table(name="enquiry_tbl")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Enquiry {
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private Integer enqId;
	
	private String name;
	private Integer sphno;
	private String classMode;
	private String courseName;
	private String enqStatus;
		
	@ManyToOne
	@JoinColumn(name="counsellorId")
	 private Counsellor counsellor;
	




}
