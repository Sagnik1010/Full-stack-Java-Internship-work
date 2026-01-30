package com.ecommerce.product_service.service;

import com.ecommerce.product_service.event.ProductCreatedEvent;
import com.ecommerce.product_service.model.Product;
import com.ecommerce.product_service.repository.ProductRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ProductService {

    private final ProductRepository repository;
    private final KafkaTemplate<String, Object> kafkaTemplate;

    // Create Product + Publish Kafka Event
    public Product createProduct(Product product) {

        Product saved = repository.save(product);

        // Publish event to Kafka topic
        ProductCreatedEvent event =
                new ProductCreatedEvent(saved.getId(), saved.getName());

        kafkaTemplate.send("product-created", event);

        return saved;
    }

    // Fetch All Products
    public List<Product> getAllProducts() {
        return repository.findAll();
    }
}


