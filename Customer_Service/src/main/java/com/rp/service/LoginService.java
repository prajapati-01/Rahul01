package com.rp.service;

import org.springframework.stereotype.Service;

import com.rp.dto.Login;

@Service
public interface LoginService {
	
	public Login loginHandle(Login login);
	

}
