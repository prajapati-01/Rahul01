package com.rp.Repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.rp.Entity.City;
public interface CityRepo extends JpaRepository<City, Integer> {
	
	@Query(value="select * from City_MASTER where state_id=:stateId", nativeQuery=true)
	public List<City> getCitiesByStateId(Integer stateId);

}
