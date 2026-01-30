package com.ecommerce.order_service.service;

import com.ecommerce.order_service.event.OrderCreatedEvent;
import com.ecommerce.order_service.model.Order;
import com.ecommerce.order_service.repository.OrderRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class OrderService {

    private final OrderRepository repository;
    private final KafkaTemplate<String, Object> kafkaTemplate;

    // Create Order + Publish Event
    public Order createOrder(Order order) {

        order.setStatus("CREATED");
        Order saved = repository.save(order);

        // Publish Kafka Event
        OrderCreatedEvent event =
                new OrderCreatedEvent(saved.getId(),
                        saved.getProductName(),
                        saved.getTotalPrice());

        kafkaTemplate.send("order-created", event);

        return saved;
    }

    // Get All Orders
    public List<Order> getAllOrders() {
        return repository.findAll();
    }
}
