package com.ecommerce.week7_ecommerce_backend.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import com.ecommerce.week7_ecommerce_backend.service.PaymentService;
import com.ecommerce.week7_ecommerce_backend.model.enums.entity.Payment;

@RestController
@RequestMapping("/api/payments")
@RequiredArgsConstructor
public class PaymentController {

    private final PaymentService service;

    @PostMapping("/{orderId}")
    public Payment pay(@PathVariable Long orderId){
        return service.pay(orderId);
    }
}

