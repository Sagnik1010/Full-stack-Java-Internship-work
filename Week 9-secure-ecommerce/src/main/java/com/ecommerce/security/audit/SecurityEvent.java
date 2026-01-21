package com.ecommerce.security.audit;

import java.time.LocalDateTime;

public class SecurityEvent {
    public String event;
    public LocalDateTime time = LocalDateTime.now();
}

