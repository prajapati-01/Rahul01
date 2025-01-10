package com.rp.service;

import java.util.List;
import java.util.stream.Collectors;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rp.binding.DashboardResponse;
import com.rp.entity.Counsellor;
import com.rp.entity.Enquiry;
import com.rp.repo.CounsellorRepo;
import com.rp.repo.EnquiryRepo;

@Service
public class CounsellorServiceImpl implements CounsellorService {
	
	@Autowired
	private CounsellorRepo counsellorRepo;
	
	@Autowired
	private EnquiryRepo enqRepo;

	@Override
	public Counsellor login(String email, String pwd) {
		Counsellor counsellor = counsellorRepo.findByEmailAndPwd(email, pwd);
			return counsellor;
	}

	@Override
	public boolean register(Counsellor counsellor) {
		Counsellor savedCounsellor = counsellorRepo.save(counsellor);
		if(null != savedCounsellor.getCounsellorId()) {
			return true;
	}
		return false;
	}

	@Override
	public DashboardResponse getDashboardInfo(Integer counsellorId) {
		
		DashboardResponse response = new DashboardResponse();
		List<Enquiry> enqList = enqRepo.getEnquiriesByCounsellorId(counsellorId);
		int totalEnqs = enqList.size();
		
		int enrolledEnqs = enqList.stream().filter(e -> e.getEnqStatus().equals("enrolled"))
				                                                      .collect(Collectors.toList())
                                                                      .size();
		int lostEnqs = enqList.stream().filter(e -> e.getEnqStatus().equals("lost"))
                                                              .collect(Collectors.toList())
                                                              .size();
		int openEnqs = enqList.stream().filter(e -> e.getEnqStatus().equals("open"))
                                                              .collect(Collectors.toList())
                                                              .size();
		response.setTotalEnqs(totalEnqs);
		response.setEnrolledEnqs(enrolledEnqs);
		response.setLostEnqs(lostEnqs);
		response.setOpenEnqs(openEnqs);
		
		return response;
	}

	@Override
	public Counsellor findByEmail(String email) {
				return counsellorRepo.findByEmail(email);
	}

}
