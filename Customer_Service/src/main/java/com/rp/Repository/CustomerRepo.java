package com.rp.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rp.Entity.Customer;

public interface CustomerRepo extends JpaRepository<Customer,Integer> {
    public Customer findByEmailAndPassword(String email,String pwd);

    public Customer findByEmail(String email);
}
