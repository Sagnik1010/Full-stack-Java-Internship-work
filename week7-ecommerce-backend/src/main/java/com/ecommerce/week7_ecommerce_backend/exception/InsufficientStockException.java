package com.ecommerce.week7_ecommerce_backend.exception;

public class InsufficientStockException extends RuntimeException {
    public InsufficientStockException(String msg){
        super(msg);
    }
}
