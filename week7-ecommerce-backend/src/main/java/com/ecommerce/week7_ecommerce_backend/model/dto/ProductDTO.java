package com.ecommerce.week7_ecommerce_backend.model.dto;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class ProductDTO {
    public String name;
    public double price;
    public int stock;
    public Long categoryId;
}
