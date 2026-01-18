package com.ecommerce.week7_ecommerce_backend.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import com.ecommerce.week7_ecommerce_backend.service.ProductService;
import com.ecommerce.week7_ecommerce_backend.model.dto.ProductDTO;
import com.ecommerce.week7_ecommerce_backend.model.enums.entity.Product;

@RestController
@RequestMapping("/api/products")
@RequiredArgsConstructor
public class ProductController {

    private final ProductService service;

    @PostMapping
    public Product create(@RequestBody ProductDTO dto){
        return service.create(dto);
    }

    @GetMapping
    public Iterable<Product> all(){
        return service.all();
    }
}

