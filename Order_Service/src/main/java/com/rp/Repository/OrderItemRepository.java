package com.rp.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rp.Dto.OrderItemDTO;
import com.rp.Entity.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {

    void save(OrderItemDTO item);

}
