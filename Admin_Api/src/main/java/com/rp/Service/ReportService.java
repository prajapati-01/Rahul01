package com.rp.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.stereotype.Service;

import com.rp.Entity.Order;
import com.rp.Repository.OrderRepo;
import com.rp.Specification.ReportSpecification;
import com.rp.dto.ReportDTO;

@Service
public class ReportService {
	 @Autowired
	    private OrderRepo orderRepo;

	    public List<Order> filterOrders(ReportDTO reportDTO) {
	        Specification<Order> specification = Specification
	                .where(ReportSpecification.hasCustomerEmail(reportDTO.getCustomerEmail()))
	                .and(ReportSpecification.hasStartDate(reportDTO.getStartDate()))
	                .and(ReportSpecification.hasEndDate(reportDTO.getEndDate()));

	        return orderRepo.findAll(specification);
	    }

}
