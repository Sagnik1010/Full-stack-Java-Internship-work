package com.ecommerce.order_service.event;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class ProductCreatedEvent {
    private Long productId;
    private String name;
}

