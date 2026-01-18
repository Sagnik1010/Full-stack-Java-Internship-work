package com.ecommerce.week7_ecommerce_backend.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import com.ecommerce.week7_ecommerce_backend.service.OrderService;
import com.ecommerce.week7_ecommerce_backend.model.dto.OrderDTO;
import com.ecommerce.week7_ecommerce_backend.model.enums.entity.Order;

@RestController
@RequestMapping("/api/orders")
@RequiredArgsConstructor
public class OrderController {

    private final OrderService service;

    @PostMapping
    public Order placeOrder(@RequestBody OrderDTO dto){
        return service.placeOrder(dto);
    }
}
