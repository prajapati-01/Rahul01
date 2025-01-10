package com.rp.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rp.Entity.Order;
import com.rp.Service.DashboardService;
import com.rp.Service.ReportService;
import com.rp.dto.DashboardDTO;
import com.rp.dto.ReportDTO;

@CrossOrigin("http://localhost:4200/")
@RestController
@RequestMapping(value = "/api/admin")
public class AdminController {
	 @Autowired
	    public DashboardService dashboardService;

	    @Autowired
	    public ReportService reportService;

	    @GetMapping(value = "/dashboard")
	    public ResponseEntity<DashboardDTO> getDashboardData() {
	        DashboardDTO dashboardDTO = dashboardService.fetchDashboardValues();
	        return new ResponseEntity<>(dashboardDTO, HttpStatus.OK);
	    }

	    @PostMapping(value = "/filter")
	    public List<Order> filterOrders(@RequestBody ReportDTO reportDTO) {
	        return reportService.filterOrders(reportDTO);
	    }

}
