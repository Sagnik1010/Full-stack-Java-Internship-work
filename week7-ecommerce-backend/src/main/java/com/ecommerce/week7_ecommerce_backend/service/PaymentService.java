package com.ecommerce.week7_ecommerce_backend.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.ecommerce.week7_ecommerce_backend.repository.*;
import com.ecommerce.week7_ecommerce_backend.model.enums.entity.*;
import com.ecommerce.week7_ecommerce_backend.model.enums.*;

@Service
@RequiredArgsConstructor
public class PaymentService {

    private final PaymentRepository payRepo;
    private final OrderRepository orderRepo;

    @Transactional
    public Payment pay(Long orderId){
        Order order = orderRepo.findById(orderId).orElseThrow();

        Payment payment = new Payment();
        payment.setOrder(order);

        double amount = order.getItems().stream()
                .mapToDouble(i -> i.getProduct().getPrice() * i.getQuantity())
                .sum();

        payment.setAmount(amount);
        payment.setStatus(PaymentStatus.SUCCESS);

        order.setStatus(OrderStatus.PAID);

        return payRepo.save(payment);
    }
}

