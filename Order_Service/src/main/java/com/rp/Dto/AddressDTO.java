package com.rp.Dto;

import com.rp.Entity.Customer;

import jakarta.persistence.ManyToOne;
import lombok.Data;

@Data
public class AddressDTO {

    private String houseno;
    private String street;
    private String city;
    private String state;
    private String zipCode;
    private String country;
    @ManyToOne
    private Customer customer;
}