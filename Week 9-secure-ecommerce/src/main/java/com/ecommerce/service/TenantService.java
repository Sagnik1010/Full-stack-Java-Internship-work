package com.ecommerce.service;

import com.ecommerce.repository.TenantRepository;
import com.ecommerce.model.entity.Tenant;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class TenantService {
    private final TenantRepository repo;
    public Tenant save(Tenant t){ return repo.save(t); }
}
