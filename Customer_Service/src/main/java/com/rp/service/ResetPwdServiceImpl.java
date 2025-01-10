package com.rp.service;

import org.springframework.stereotype.Service;

import com.rp.Entity.Customer;
import com.rp.Repository.CustomerRepo;
import com.rp.dto.ResetPassword;
import com.rp.dto.RestResponse;

@Service
public class ResetPwdServiceImpl implements ResetPwdService{

    private CustomerRepo customerRepo;
    
    public ResetPwdServiceImpl(CustomerRepo customerRepo){
        this.customerRepo=customerRepo;
    }
    RestResponse response=new RestResponse();

    Customer customer=new Customer();
    
    @Override
    public String  resetPassword(ResetPassword resetPassword){
        System.out.println(resetPassword);
        String response;
        customer=customerRepo.findByEmail(resetPassword.getEmail());
        if(customer==null){
            response="Please enter registered email id";
            System.out.println(response);
            return response;
        }
        if(!resetPassword.getNewPwd().equals(resetPassword.getConfirmNewPwd())){
            response="Passwords must match";
            System.out.println(response);
            return response;


        }else {
            customer.setEmail(customer.getEmail());
            customer.setPassword(resetPassword.getNewPwd());
            customerRepo.save(customer);
            response="Password updated please try to login now";
            System.out.println(response);
            return response;

        
      }
    }
}

	
