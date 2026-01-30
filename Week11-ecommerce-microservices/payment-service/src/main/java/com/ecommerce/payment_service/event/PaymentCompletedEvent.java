package com.ecommerce.payment_service.event;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@AllArgsConstructor
public class PaymentCompletedEvent {
    private Long orderId;
    private String status;
}
