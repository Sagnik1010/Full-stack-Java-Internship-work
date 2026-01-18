# Week7 E-commerce Backend

## How to Run

1. Install PostgreSQL
2. Create database: ecommerce
3. Update username/password in application.yml
4. Run:
   mvn spring-boot:run

## API Endpoints

POST /api/users        → Register User  
POST /api/products     → Add Product  
GET  /api/products     → View Products  
POST /api/orders       → Place Order  
POST /api/payments/{orderId} → Make Payment

## Features

- PostgreSQL + Flyway Migrations
- JPA Entity Relationships
- Transactional Order Processing
- Stock Management
- Caching Enabled
