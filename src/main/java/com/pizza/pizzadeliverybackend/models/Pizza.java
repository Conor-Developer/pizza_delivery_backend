package com.pizza.pizzadeliverybackend.models;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;


@Entity(name = "pizza")
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})

public class Pizza {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String type;

    @OneToOne
    @JoinColumn(name="pizza_price_id")
    private Price prices;

    public Pizza(){
    }

    public Price getPrices() {
        return prices;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
