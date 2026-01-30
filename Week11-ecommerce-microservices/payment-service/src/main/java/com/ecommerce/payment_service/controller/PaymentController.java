package com.ecommerce.payment_service.controller;

import com.ecommerce.payment_service.model.Payment;
import com.ecommerce.payment_service.repository.PaymentRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/payments")
@RequiredArgsConstructor
public class PaymentController {

    private final PaymentRepository repository;

    @GetMapping
    public List<Payment> all() {
        return repository.findAll();
    }
}
