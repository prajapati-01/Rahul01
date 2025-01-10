package com.rp.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rp.Repository.CustomerRepo;
import com.rp.Repository.OrderRepo;
import com.rp.Repository.ProductRepo;
import com.rp.dto.DashboardDTO;


@Service
public class DashboardService {
	
	 @Autowired
	    private CustomerRepo customerRepo;

	    @Autowired
	    private OrderRepo orderRepo;

	    @Autowired
	    private ProductRepo productRepo;


	    public DashboardDTO fetchDashboardValues() {
	        DashboardDTO dashboardDTO = new DashboardDTO();

	        dashboardDTO.setProductCount(productRepo.count());
	        dashboardDTO.setCustomersCount(customerRepo.count());
	        dashboardDTO.setAmountCollected(orderRepo.findTotalAmount());
	        dashboardDTO.setOrdersCount(orderRepo.count());

	        return dashboardDTO;
	    }

}
