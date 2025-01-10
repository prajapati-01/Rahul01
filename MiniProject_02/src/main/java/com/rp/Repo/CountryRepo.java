package com.rp.Repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.rp.Entity.Country;
@Repository
public interface CountryRepo extends JpaRepository<Country, Integer> {
	

}
