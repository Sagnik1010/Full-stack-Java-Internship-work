package com.ecommerce.week7_ecommerce_backend.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.cache.annotation.Cacheable;
import com.ecommerce.week7_ecommerce_backend.repository.*;
import com.ecommerce.week7_ecommerce_backend.model.enums.entity.*;
import com.ecommerce.week7_ecommerce_backend.model.dto.ProductDTO;

@Service
@RequiredArgsConstructor
public class ProductService {

    private final ProductRepository repo;
    private final CategoryRepository catRepo;

    public Product create(ProductDTO dto){
        Category cat = catRepo.findById(dto.categoryId).orElseThrow();
        Product p = new Product();
        p.setName(dto.name);
        p.setPrice(dto.price);
        p.setStock(dto.stock);
        p.setCategory(cat);
        return repo.save(p);
    }

    @Cacheable("products")
    public Iterable<Product> all(){
        return repo.findAll();
    }
}
