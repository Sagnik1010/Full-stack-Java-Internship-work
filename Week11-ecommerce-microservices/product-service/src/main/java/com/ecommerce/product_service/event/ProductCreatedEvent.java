package com.ecommerce.product_service.event;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@AllArgsConstructor
public class ProductCreatedEvent {
    private Long productId;
    private String name;
}
