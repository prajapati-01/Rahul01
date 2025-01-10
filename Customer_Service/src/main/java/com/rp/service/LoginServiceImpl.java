package com.rp.service;

import org.springframework.stereotype.Service;

import com.rp.Entity.Customer;
import com.rp.Repository.CustomerRepo;
import com.rp.dto.Login;

@Service
public class LoginServiceImpl implements LoginService{

    private CustomerRepo customerRepo;

    public LoginServiceImpl(CustomerRepo customerRepo){
        this.customerRepo=customerRepo;
    }

    @Override
    public Login loginHandle(Login login) {
        Customer customer=customerRepo.findByEmailAndPassword(login.getEmail(),login.getPassword());
        Login login1=new Login();
        if(customer!=null){
            login1.setEmail(customer.getEmail());
            login1.setPassword(customer.getPassword());
            return login1;
        }
        System.out.println(login1.getEmail()+" "+login1.getPassword());
        return login1;
    }
}

