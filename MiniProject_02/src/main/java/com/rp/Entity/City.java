package com.rp.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "CITY_MASTER")
@Data
public class City {
	@Id
	private Integer cityId;
	private String cityName;
	
	@ManyToOne
	@JoinColumn(name="stateId")
	 private State state;
	
	private City() {
		
	}
	
	public City(Integer cityId, String cityName) {
		  super();
		  this.cityId=cityId;
		  this.cityName=cityName;
		  
	}

}
