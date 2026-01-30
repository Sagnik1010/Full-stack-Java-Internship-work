package com.ecommerce.product_service.controller;

import com.ecommerce.product_service.model.Product;
import com.ecommerce.product_service.service.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/products")
@RequiredArgsConstructor
public class ProductController {

    private final ProductService service;

    // Create Product
    @PostMapping
    public Product create(@RequestBody Product product) {
        return service.createProduct(product);
    }

    // Get All Products
    @GetMapping
    public List<Product> all() {
        return service.getAllProducts();
    }
}

