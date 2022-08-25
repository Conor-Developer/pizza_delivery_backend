package com.pizza.pizzadeliverybackend.repositories;

import com.pizza.pizzadeliverybackend.models.Price;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PriceRepository extends JpaRepository<Price, Long> {
}
