-- src/main/resources/schema.sql

CREATE TABLE IF NOT EXISTS vvuser (
    id SERIAL PRIMARY KEY,
    name VARCHAR(255) NOT NULL,
    email VARCHAR(255) NOT NULL
);

