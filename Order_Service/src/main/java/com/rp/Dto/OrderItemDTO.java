package com.rp.Dto;

import lombok.Data;

@Data
public class OrderItemDTO {

    private String imageUrl;
    private double unitPrice;
    private int quantity;
    private String prodname;

}
