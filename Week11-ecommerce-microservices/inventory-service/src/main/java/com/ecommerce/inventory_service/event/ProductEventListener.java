package com.ecommerce.inventory_service.event;

import com.ecommerce.product_service.event.ProductCreatedEvent;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class ProductEventListener {

    // Listens to events from product-service
    @KafkaListener(topics = "product-created", groupId = "inventory-group")
    public void consume(ProductCreatedEvent event) {

        System.out.println("✅ Inventory Service received new product:");
        System.out.println("Product ID: " + event.getProductId());
        System.out.println("Product Name: " + event.getName());

        // Here you would normally:
        // → create stock entry in inventory database
    }
}