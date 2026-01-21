package com.ecommerce.controller;

import com.ecommerce.model.entity.Tenant;
import com.ecommerce.service.TenantService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/tenants")
@RequiredArgsConstructor
public class TenantController {
    private final TenantService service;

    @PostMapping
    public Tenant create(@RequestBody Tenant t){
        return service.save(t);
    }
}
