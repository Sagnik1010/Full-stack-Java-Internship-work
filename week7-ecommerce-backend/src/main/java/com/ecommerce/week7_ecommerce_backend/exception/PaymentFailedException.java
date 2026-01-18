package com.ecommerce.week7_ecommerce_backend.exception;

public class PaymentFailedException extends RuntimeException {
    public PaymentFailedException(String msg){
        super(msg);
    }
}
