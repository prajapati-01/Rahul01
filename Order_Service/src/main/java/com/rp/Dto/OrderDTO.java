package com.rp.Dto;

import java.util.List;

import com.rp.Entity.Address;
import com.rp.Entity.Customer;
import com.rp.Entity.OrderItem;

import jakarta.persistence.ElementCollection;
import jakarta.persistence.ManyToOne;
import lombok.Data;

@Data
public class OrderDTO {

    private int totalquantity;
    private double totalprice;
    private String razorPayOrderId;
    private String orderStatus;
    private String razorpayPaymentId;
    
    @ManyToOne
    private Customer customer;
    
    @ManyToOne
    private Address address;
    
    @ElementCollection
    private List<OrderItem> orderItems; 
}