CREATE TABLE category(
 id SERIAL PRIMARY KEY,
 name VARCHAR(100) UNIQUE NOT NULL
);

CREATE TABLE users(
 id SERIAL PRIMARY KEY,
 email VARCHAR(120) UNIQUE NOT NULL,
 password VARCHAR(120),
 name VARCHAR(120),
 role VARCHAR(20)
);

CREATE TABLE product(
 id SERIAL PRIMARY KEY,
 name VARCHAR(120),
 description TEXT,
 price DOUBLE PRECISION,
 stock INT,
 category_id INT REFERENCES category(id)
);

CREATE TABLE orders(
 id SERIAL PRIMARY KEY,
 user_id INT REFERENCES users(id),
 status VARCHAR(30)
);

CREATE TABLE order_item(
 id SERIAL PRIMARY KEY,
 order_id INT REFERENCES orders(id),
 product_id INT REFERENCES product(id),
 quantity INT
);

CREATE TABLE payment(
 id SERIAL PRIMARY KEY,
 order_id INT REFERENCES orders(id),
 amount DOUBLE PRECISION,
 status VARCHAR(30)
);
