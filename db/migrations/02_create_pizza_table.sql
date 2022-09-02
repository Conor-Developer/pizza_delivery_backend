CREATE TABLE pizza(
                          id SERIAL PRIMARY KEY,
                          type VARCHAR(60) NOT NULL,
                          pizza_price_id INTEGER REFERENCES pizza_price (id),
                          image VARCHAR
);