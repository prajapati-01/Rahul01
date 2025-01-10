package com.rp.service;

import org.springframework.stereotype.Service;

@Service
public interface ForgotPwdService {
	
	public Boolean sendMail(String email);

}
