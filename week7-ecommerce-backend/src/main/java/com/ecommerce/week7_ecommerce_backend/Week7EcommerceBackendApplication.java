package com.ecommerce.week7_ecommerce_backend;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;
import org.springframework.cache.annotation.EnableCaching;

@SpringBootApplication
@EnableJpaAuditing
@EnableCaching
public class Week7EcommerceBackendApplication {

	public static void main(String[] args) {
		SpringApplication.run(Week7EcommerceBackendApplication.class, args);
	}
}

