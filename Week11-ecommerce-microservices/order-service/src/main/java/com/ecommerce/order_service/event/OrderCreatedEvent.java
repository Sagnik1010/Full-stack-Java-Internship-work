package com.ecommerce.order_service.event;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@AllArgsConstructor
public class OrderCreatedEvent {
    private Long orderId;
    private String productName;
    private double totalPrice;
}

