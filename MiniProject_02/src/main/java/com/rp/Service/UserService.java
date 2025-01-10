package com.rp.Service;

import java.util.Map;

import com.rp.Binding.LoginForm;
import com.rp.Binding.RegisterForm;
import com.rp.Binding.ResetPwdForm;
import com.rp.Entity.User;

public interface UserService {
	
	public Map<Integer, String> getCountries();
	
	public Map<Integer, String> getStates(Integer countryId);
	
	public Map<Integer, String> getCities(Integer stateId);
	
	public User getUser(String email);
	
	public boolean saveUser(RegisterForm formObj);
	
	public User login(LoginForm formObj);

	public boolean resetPwd(ResetPwdForm formObj);

}
