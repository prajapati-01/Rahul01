package com.rp.Entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name="USER_MASTER")
@Data
public class User {
	@Id
	@GeneratedValue(strategy= GenerationType.SEQUENCE)
	@Column(name = "userId", nullable = false)
	private Integer userId;
	
	
	private String uname;
	private String email;
	private String pwd;
	private Integer countryId;
	private Integer stateId;
	private Integer cityId;
	private String pwdUpdated;
	
	

}
