package com.pizza.pizzadeliverybackend.controllers;

import com.pizza.pizzadeliverybackend.models.Pizza;
import com.pizza.pizzadeliverybackend.repositories.PizzaRepository;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/pizza")
public class PizzaController {
    @Autowired
    private PizzaRepository pizzaRepository;

    @GetMapping
    public List<Pizza> list() {
        return pizzaRepository.findAll();
    }

    @GetMapping
    @RequestMapping("{id}")
    public Pizza get(@PathVariable Long id) {
        return pizzaRepository.getReferenceById(id);
    }

    @PostMapping
    public Pizza create(@RequestBody final Pizza pizza) {
        return pizzaRepository.saveAndFlush(pizza);
    }

    @RequestMapping(value = "{id}", method = RequestMethod.DELETE)
    public void delete(@PathVariable Long id) {
        pizzaRepository.deleteById(id);
    }

    @RequestMapping(value = "{id}", method = RequestMethod.PUT)
    public Pizza update(@PathVariable Long id, @RequestBody Pizza pizza) {
        Pizza existingSpeaker = pizzaRepository.getReferenceById(id);
        BeanUtils.copyProperties(pizza, existingSpeaker, "id");
        return pizzaRepository.saveAndFlush(existingSpeaker);
    }

}
