# Pizza

Note: You can find the frontend codebase (and set up instructions) for this project [here](https://github.com/Conor-Developer/pizza_delivery_frontend)

## Reflection

In this project, I further expanded my skills with React. I was able to build a shopping basket function that allows the user to add items to their cart, view costs and amend quantities.

Furthermore, I was able to use my new Java skills to create a backend server with CRUD capability using the Spring boot framework.

## Goal of the project

To provide an online ordering tool to allow customers to place orders at their favourite pizza restaurant.

## Tech stack

- [React](https://reactjs.org/) for front end development.
- [Java Spring Boot](https://spring.io/projects/spring-boot/) for front end development.
- [PostgresSQl](https://www.postgresql.org/) to create a database.
- [GitHub](https://github.com/) and Git for version control.

## Features

- Users can choose from a selection of portion sizes for various food items
- Users can add food items to a basket
- Users can adjust quantity of each food item in food basket
- Users can remove food items from the food basket
- Users can review subtotal, additional fees and total price

## Getting started

To explore the codebase follow this set-up:

### Set up your project - Backend

### Database Setup

- You must open psql from the root directory of this project!

1. Connect to psql
2. Create the database using the psql command CREATE DATABASE pizza;
3. Connect to the database using the pqsl command \c pizza;
4. Run the query we have saved in the file from the root directory of this project by running \i ./db/migrations/01_create_pizza_table.sql
5. Run the query we have saved in the file from the root directory of this project by running \i ./db/migrations/02_create_pizza_price_table.sql
6. Run the query we have saved in the file from the root directory of this project by running \i ./db/migrations/03_add_data_to_pizza_price_table.sql
7. Run the query we have saved in the file from the root directory of this project by running \i ./db/migrations/04_add_data_to_pizza_table.sql

### Environment Variables Setup
 
1. Assuming Intellij is used, go to: Run -> Edit Configurations -> Modify options -> Environment Variables
2. Add the following variables:
3. Variable Name: DB_PASS       Value: YOUR DATABASE PASS HERE
4. Variable Name: DB_USERNAME   Value: YOUR DATABASE NAME HERE
5. Variable Name: DB_URL        Value: jdbc:postgresql://localhost:5432/pizza

### Start Server

Run server: src -> main -> java -> Run File: PizzaDeliveryBackendApplication