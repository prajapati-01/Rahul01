package com.rp.service;

import com.rp.binding.DashboardResponse;
import com.rp.entity.Counsellor;

public interface CounsellorService {
	
	public Counsellor login(String email, String pwd);
	public boolean register(Counsellor counsellor);
	public DashboardResponse getDashboardInfo(Integer cousellorId);
	public Counsellor findByEmail(String email);

}
