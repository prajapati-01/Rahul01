package com.rp.dto;

import java.time.LocalDate;

import lombok.Data;

@Data
public class ReportDTO {
	 private String customerEmail;
	    private LocalDate startDate;
	    private LocalDate endDate;

}
