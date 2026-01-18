package com.ecommerce.week7_ecommerce_backend.model.enums.entity;

import com.ecommerce.week7_ecommerce_backend.model.enums.OrderStatus;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import java.util.*;

@Entity
@Getter @Setter
@Table(name="orders")
public class Order extends BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    private User user;

    @Enumerated(EnumType.STRING)
    private OrderStatus status = OrderStatus.CREATED;

    @OneToMany(mappedBy="order", cascade=CascadeType.ALL)
    private List<OrderItem> items = new ArrayList<>();
}
