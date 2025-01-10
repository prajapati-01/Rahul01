package com.rp.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.rp.Dto.AddressDTO;
import com.rp.Entity.Address;

@Repository
public interface AddressRepository extends JpaRepository<Address, Long> {

    Address save(AddressDTO address);
   

}
