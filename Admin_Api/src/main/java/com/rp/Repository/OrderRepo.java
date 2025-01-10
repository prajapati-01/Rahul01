package com.rp.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Query;

import com.rp.Entity.Order;

public interface OrderRepo extends JpaRepository<Order, Integer>, JpaSpecificationExecutor<Order> {

    @Query(value = "select sum(totalPrice) from Order")
    public Double findTotalAmount();

}
