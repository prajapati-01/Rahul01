package com.rp.repo;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.rp.entity.Enquiry;

public interface EnquiryRepo extends JpaRepository<Enquiry, Integer> {	
	
		@Query(value="select * from enquiry_tbl where counsellor_id=:counsellorId", nativeQuery=true)
		public List<Enquiry> getEnquiriesByCounsellorId(Integer counsellorId);

		
		
}
