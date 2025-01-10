package com.rp.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rp.entity.Counsellor;

public interface CounsellorRepo extends JpaRepository<Counsellor, Integer> {
	
	public Counsellor findByEmail(String email);
	public Counsellor findByEmailAndPwd(String email, String Pwd);

}
