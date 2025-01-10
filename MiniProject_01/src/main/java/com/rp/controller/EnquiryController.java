package com.rp.controller;

import java.util.List; 

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.rp.binding.ViewEnqsFilterRequest;
import com.rp.entity.Enquiry;
import com.rp.service.EnquiryService;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;

@Controller
public class EnquiryController {
	
	@Autowired
	private EnquiryService enqService;
	
	@GetMapping("/enquiry")
	public String addEnquiryPage(Model model ) {
		
		Enquiry enquiry = new Enquiry();
		model.addAttribute("enquiry", enquiry);
		
		return "enquiryForm";
	}

	@PostMapping("/addEnq")
	public String handleAddEnquiry( Enquiry enquiry,  HttpServletRequest request, Model model) throws Exception{
		
		HttpSession session = request.getSession(false);
		Integer counsellorId =(Integer) session.getAttribute("counsellorId");
		
		boolean isSaved = enqService.addEnquiry(enquiry, counsellorId);
		if (isSaved) {
			model.addAttribute("smsg","Enquiry is Added");
		}else {
			model.addAttribute("emsg", "Failed To Add Enquiry");
		}
		 
		enquiry = new Enquiry();
		model.addAttribute("enquiry", enquiry);
		
		return"enquiryForm";
	}
	@GetMapping("/editEnq")
    public String editEnquiry(@RequestParam("enqId")  Integer enqId, Model model) {
		
    	Enquiry enquiry = enqService.getEnquiryById(enqId);
    	model.addAttribute("enquiry", enquiry);
    	
       	return "enquiryForm";
	}
	
	@GetMapping("/view-enquiries")
	public String getEnquiries(HttpServletRequest request, Model model) {
		
		HttpSession session = request.getSession(false);
		Integer counsellorId = (Integer) session.getAttribute("counsellorId");
		
		List<Enquiry> enqList = enqService.getAllEnquiries(counsellorId);
		model.addAttribute("enquiries", enqList);
		
		ViewEnqsFilterRequest filterReq = new ViewEnqsFilterRequest();
		model.addAttribute("viewEnqsFilterRequest",filterReq);
		
		return "viewEnqsPage";
	
	}
	@PostMapping("/filter-enqs")
	public String filterEnquiries(ViewEnqsFilterRequest viewEnqsFilterRequest, HttpServletRequest request, Model model ) {
		
		HttpSession session = request.getSession(false);
		Integer counsellorId = (Integer)session.getAttribute("counsellorId");
		
		List<Enquiry> enqList = enqService.getEnquiriesWithFilter(viewEnqsFilterRequest, counsellorId);
		model.addAttribute("enquiries", enqList);
		
		return"viewEnqsPage";
			}
	
}
