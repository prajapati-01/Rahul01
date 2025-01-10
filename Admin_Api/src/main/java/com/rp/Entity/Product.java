package com.rp.Entity;

import java.math.BigDecimal;

import java.time.LocalDate;
import java.util.Date;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.Data;

@Entity
@Data
public class Product {
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private Long id;
	
	private String name;
	private String description;
	private String title;
	private BigDecimal unitPrice;
	private String imageUrl;
	private Boolean active;
	private Integer unitsInStock;
	private Date dateCreated;
	private Date lastUpdate;
	
	@ManyToOne
	@JoinColumn(name = "category_id", nullable = false)
	private Category category;

	
	
	
	
	

}
