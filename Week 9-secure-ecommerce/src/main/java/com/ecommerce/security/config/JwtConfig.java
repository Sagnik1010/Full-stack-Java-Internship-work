package com.ecommerce.security.config;

import org.springframework.context.annotation.Configuration;

@Configuration
public class JwtConfig {
    public static final String SECRET = "secure-ecommerce-secret";
    public static final long EXPIRATION = 86400000;
}