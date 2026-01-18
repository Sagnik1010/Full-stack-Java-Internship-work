package com.ecommerce.week7_ecommerce_backend.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.ecommerce.week7_ecommerce_backend.model.enums.entity.Payment;

public interface PaymentRepository extends JpaRepository<Payment,Long> {}

