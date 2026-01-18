package com.ecommerce.week7_ecommerce_backend.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.ecommerce.week7_ecommerce_backend.model.enums.entity.Order;
import java.util.List;

public interface OrderRepository extends JpaRepository<Order,Long> {
    List<Order> findByUserId(Long userId);
}
