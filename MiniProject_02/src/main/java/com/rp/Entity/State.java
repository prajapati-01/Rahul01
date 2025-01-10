package com.rp.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "STATE_MASTER")
@Data
public class State {
	@Id
	private Integer stateId;
	private String stateName;

	@ManyToOne
	@JoinColumn(name="countryId")
	 private Country country;
	
	public State() {
		}
	public State(Integer stateId, String stateName) {
		   this.stateId = stateId;
		   this.stateName = stateName; 
		   
	}

}
