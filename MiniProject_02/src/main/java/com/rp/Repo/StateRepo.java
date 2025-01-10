package com.rp.Repo;

import java.util.List;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.rp.Entity.State;

public interface StateRepo extends JpaRepository<State, Integer> {
	
	@Query(value="select * from STATE_MASTER where country_id=:countryId", nativeQuery=true)
	public List<State> getStatesBycountryId(Integer countryId);

}
