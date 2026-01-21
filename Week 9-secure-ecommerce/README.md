# Week9 Secure E-commerce Platform

## Run

1. Create database secure_ecommerce in PostgreSQL
2. Update application.yml credentials
3. Run:
   mvn spring-boot:run

## Test

POST /api/auth/login
Body:
{ "username":"admin", "password":"admin" }

Returns JWT Token.
