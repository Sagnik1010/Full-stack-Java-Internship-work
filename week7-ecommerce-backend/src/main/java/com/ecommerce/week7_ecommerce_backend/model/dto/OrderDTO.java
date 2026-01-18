package com.ecommerce.week7_ecommerce_backend.model.dto;

import lombok.Getter;
import lombok.Setter;
import java.util.Map;

@Getter @Setter
public class OrderDTO {
    public Long userId;
    public Map<Long,Integer> products;
}

