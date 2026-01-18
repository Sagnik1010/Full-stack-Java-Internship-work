package com.ecommerce.week7_ecommerce_backend.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.ecommerce.week7_ecommerce_backend.repository.*;
import com.ecommerce.week7_ecommerce_backend.model.enums.entity.*;
import com.ecommerce.week7_ecommerce_backend.model.dto.OrderDTO;
import com.ecommerce.week7_ecommerce_backend.exception.InsufficientStockException;

@Service
@RequiredArgsConstructor
public class OrderService {

    private final OrderRepository orderRepo;
    private final ProductRepository productRepo;
    private final UserRepository userRepo;

    @Transactional
    public Order placeOrder(OrderDTO dto){

        User user = userRepo.findById(dto.userId).orElseThrow();
        Order order = new Order();
        order.setUser(user);

        dto.products.forEach((productId, qty)->{
            Product p = productRepo.findById(productId).orElseThrow();

            if(p.getStock() < qty)
                throw new InsufficientStockException("Not enough stock for " + p.getName());

            p.setStock(p.getStock() - qty);
            productRepo.save(p);

            OrderItem item = new OrderItem();
            item.setOrder(order);
            item.setProduct(p);
            item.setQuantity(qty);
            order.getItems().add(item);
        });

        return orderRepo.save(order);
    }
}
