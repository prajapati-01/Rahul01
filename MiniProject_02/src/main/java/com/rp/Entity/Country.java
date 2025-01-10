package com.rp.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "COUNTRY_MASTER")
@Data
public class Country {
	@Id
	private Integer countryId;
	private String countryName;
	
	public Country() {
	}
	
	public Country(Integer countryId, String countryName	) {
		this.countryId = countryId;
		this.countryName= countryName;
		}

}
