package com.ecommerce.order_service.controller;

import com.ecommerce.order_service.model.Order;
import com.ecommerce.order_service.service.OrderService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/orders")
@RequiredArgsConstructor
public class OrderController {

    private final OrderService service;

    // Create Order
    @PostMapping
    public Order create(@RequestBody Order order) {
        return service.createOrder(order);
    }

    // Get All Orders
    @GetMapping
    public List<Order> all() {
        return service.getAllOrders();
    }
}

