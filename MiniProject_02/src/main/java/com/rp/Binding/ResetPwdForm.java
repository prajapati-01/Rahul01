package com.rp.Binding;

import lombok.Data;

@Data
public class ResetPwdForm {
	private Integer userId;
	private String email;
	private String newPwd;
	private String confirmPwd;

}
