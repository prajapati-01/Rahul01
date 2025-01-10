package com.rp.Binding;

import lombok.Data;

@Data
public class RegisterForm {
	private Integer userId;
	private String uname;
	private String email;
	private String pwd;
	private Integer countryId;
	private Integer stateId;
	private Integer cityId;
	private String pwdUpdated;
	

}
