package com.ecommerce.week7_ecommerce_backend.model.enums.entity;

import com.ecommerce.week7_ecommerce_backend.model.enums.PaymentStatus;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter @Setter
public class Payment extends BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToOne
    private Order order;

    private double amount;

    @Enumerated(EnumType.STRING)
    private PaymentStatus status;
}
