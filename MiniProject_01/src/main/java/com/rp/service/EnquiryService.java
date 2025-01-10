package com.rp.service;

import java.util.List;

import com.rp.binding.ViewEnqsFilterRequest;
import com.rp.entity.Enquiry;

public interface EnquiryService {
	
	public boolean addEnquiry(Enquiry enq, Integer counsellorId) throws Exception;
	public List<Enquiry> getAllEnquiries(Integer counsellorId);
	public List<Enquiry> getEnquiriesWithFilter(ViewEnqsFilterRequest filterReq, Integer counsellorId);
	public Enquiry getEnquiryById(Integer enqId);

}
