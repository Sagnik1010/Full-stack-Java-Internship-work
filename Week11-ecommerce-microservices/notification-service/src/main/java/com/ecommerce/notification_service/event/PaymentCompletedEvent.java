package com.ecommerce.notification_service.event;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class PaymentCompletedEvent {

    private Long orderId;
    private String status;
}
