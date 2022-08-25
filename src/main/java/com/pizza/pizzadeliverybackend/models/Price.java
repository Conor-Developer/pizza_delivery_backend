package com.pizza.pizzadeliverybackend.models;
import javax.persistence.*;

@Entity(name = "pizza_price")
public class Price {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Long id;
    private double small;
    private double medium;
    private double large;
    private double extra_large;

    public Price(){
    }


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public double getSmall() {
        return small;
    }

    public void setSmall(double small) {
        this.small = small;
    }

    public double getMedium() {
        return medium;
    }

    public void setMedium(double medium) {
        this.medium = medium;
    }

    public double getLarge() {
        return large;
    }

    public void setLarge(double large) {
        this.large = large;
    }

    public double getExtra_large() {
        return extra_large;
    }

    public void setExtra_large(double extra_large) {
        this.extra_large = extra_large;
    }
}
