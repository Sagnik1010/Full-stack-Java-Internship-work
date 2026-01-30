package com.ecommerce.payment_service.event;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class OrderCreatedEvent {
    private Long orderId;
    private String productName;
    private double totalPrice;
}
