package com.rp.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rp.Entity.Customer;
import com.rp.Repository.CustomerRepo;
import com.rp.dto.Register;

@Service
public class RegisterServiceImp implements  RegisterService{

	@Autowired
    private CustomerRepo customerRepo;

    Customer customer=new Customer();

    public RegisterServiceImp(CustomerRepo customerRepo){
        this.customerRepo=customerRepo;
    }

    @Override
    public Boolean register(Register register) {
        customer.setEmail(register.getEmail());
        customer.setPassword(register.getPassword());
        customer.setName(register.getName());
        customer.setPhoneNo(register.getPhoneNo());
        customerRepo.save(customer);
        return true;
    }

	
}


