package com.pizza.pizzadeliverybackend.repositories;

import com.pizza.pizzadeliverybackend.models.Pizza;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PizzaRepository extends JpaRepository<Pizza, Long> {

}
