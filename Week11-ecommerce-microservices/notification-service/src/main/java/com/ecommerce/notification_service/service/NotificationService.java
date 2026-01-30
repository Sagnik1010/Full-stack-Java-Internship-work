package com.ecommerce.notification_service.service;

import com.ecommerce.notification_service.event.PaymentCompletedEvent;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class NotificationService {

    // Consume payment-completed event
    @KafkaListener(topics = "payment-completed", groupId = "notification-group")
    public void sendNotification(PaymentCompletedEvent event) {

        System.out.println("📧 Sending notification...");
        System.out.println("Order ID: " + event.getOrderId());
        System.out.println("Payment Status: " + event.getStatus());

        // In real system:
        // → Send Email
        // → Send SMS
        // → Push Notification

        System.out.println("✅ Notification sent successfully!");
    }
}
