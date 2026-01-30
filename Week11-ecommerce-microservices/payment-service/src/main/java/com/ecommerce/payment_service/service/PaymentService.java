package com.ecommerce.payment_service.service;

import com.ecommerce.payment_service.event.OrderCreatedEvent;
import com.ecommerce.payment_service.event.PaymentCompletedEvent;
import com.ecommerce.payment_service.model.Payment;
import com.ecommerce.payment_service.repository.PaymentRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class PaymentService {

    private final PaymentRepository repository;
    private final KafkaTemplate<String, Object> kafkaTemplate;

    // Consume order-created event
    @KafkaListener(topics = "order-created", groupId = "payment-group")
    public void processPayment(OrderCreatedEvent event) {

        System.out.println("💰 Processing payment for order: " + event.getOrderId());

        // Simulate payment processing
        Payment payment = new Payment();
        payment.setOrderId(event.getOrderId());
        payment.setAmount(event.getTotalPrice());
        payment.setStatus("SUCCESS");

        repository.save(payment);

        // Publish payment-completed event
        PaymentCompletedEvent completedEvent =
                new PaymentCompletedEvent(event.getOrderId(), "SUCCESS");

        kafkaTemplate.send("payment-completed", completedEvent);

        System.out.println("✅ Payment completed for order: " + event.getOrderId());
    }
}

