package com.ecommerce.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.ecommerce.model.entity.Tenant;

public interface TenantRepository extends JpaRepository<Tenant,Long> {}
