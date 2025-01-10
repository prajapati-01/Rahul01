package com.rp.Dto;

import java.util.List;

import lombok.Data;

@Data
public class PurchaseDTO {
	private CustomerDTO customer;
    private AddressDTO address;
    private OrderDTO order;
    private List<OrderItemDTO> orderItems;

}
