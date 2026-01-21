package com.ecommerce.security.audit;

import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class SecurityAuditAspect {

    @After("execution(* com.ecommerce.controller.*.*(..))")
    public void logEvent(){
        System.out.println("SECURITY AUDIT: Controller accessed");
    }
}