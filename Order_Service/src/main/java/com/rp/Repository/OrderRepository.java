package com.rp.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rp.Dto.OrderDTO;
import com.rp.Entity.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {
    public Order findByRazorPayOrderId(String razorPayOrderId);

    public Order save(OrderDTO order);
}
