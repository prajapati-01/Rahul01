package com.rp.service;

import org.springframework.stereotype.Service;

import com.rp.dto.ResetPassword;

@Service
public interface ResetPwdService {
	 public String resetPassword(ResetPassword resetPassword);

}
