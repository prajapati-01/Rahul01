package com.rp.service;

import org.springframework.stereotype.Service;

import com.rp.dto.Register;
@Service
public interface RegisterService {
	 public Boolean register(Register register);

}
