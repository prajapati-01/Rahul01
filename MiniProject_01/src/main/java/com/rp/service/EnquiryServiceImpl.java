package com.rp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.stereotype.Service;

import com.rp.binding.ViewEnqsFilterRequest;
import com.rp.entity.Counsellor;
import com.rp.entity.Enquiry;
import com.rp.repo.CounsellorRepo;
import com.rp.repo.EnquiryRepo;

import ch.qos.logback.core.util.StringUtil;
import io.micrometer.common.util.StringUtils;

@Service
public class EnquiryServiceImpl implements EnquiryService {
	
	@Autowired
	private EnquiryRepo enqRepo;
	
	@Autowired
	private CounsellorRepo counsellorRepo;

	@Override
	public boolean addEnquiry(Enquiry enq, Integer counsellorId) throws Exception {
		
		Counsellor counsellor = counsellorRepo.findById(counsellorId).orElse(null);
		
		if(counsellor == null) {
			throw new Exception("no counsellor found");
		}
		enq.setCounsellor(counsellor);
		Enquiry save = enqRepo.save(enq);
		
		if(save.getEnqId() != null) {
			return true;
		}
		return false;
	}

	@Override
	public List<Enquiry> getAllEnquiries(Integer counsellorId) {
				return enqRepo.getEnquiriesByCounsellorId(counsellorId);
	}

	@Override
	public List<Enquiry> getEnquiriesWithFilter(ViewEnqsFilterRequest filterReq, Integer counsellorId) {
		
		Enquiry enq = new Enquiry();
		if (StringUtils.isNotEmpty(filterReq.getClassMode())) {
			enq.setClassMode(filterReq.getClassMode());
		}
		if (StringUtils.isNotEmpty(filterReq.getCourseName())) {
			enq.setCourseName(filterReq.getCourseName());
		}
		if (StringUtils.isNotEmpty(filterReq.getEnqStatus())) {
			enq.setEnqStatus(filterReq.getEnqStatus());
		}
		Example<Enquiry> of = Example.of(enq);
		List<Enquiry> enqList = enqRepo.findAll(of);

		return enqList;
	}

	@Override
	public Enquiry getEnquiryById(Integer enqId) {
			return enqRepo.findById(enqId).orElse(null);
	}

}
