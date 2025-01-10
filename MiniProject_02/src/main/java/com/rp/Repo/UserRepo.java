package com.rp.Repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.rp.Entity.User;

public interface UserRepo extends JpaRepository<User, Integer> {
	
        public User findByEmail(String email);
		public User findByEmailAndPwd(String email, String pwd);


}
