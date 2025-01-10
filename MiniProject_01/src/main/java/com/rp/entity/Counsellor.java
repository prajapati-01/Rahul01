package com.rp.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name= "counsellor_tbl")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Counsellor {
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private Integer counsellorId;

	private String name;
	
@Column(unique=true)
	private String email;
	private String pwd;
	private Integer phno;

	
	
	

}
