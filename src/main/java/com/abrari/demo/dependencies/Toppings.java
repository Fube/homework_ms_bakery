package com.abrari.demo.dependencies;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Toppings {

    @Value("sprinkles")
    String toppingType;

    public String getToppingType() {
        return toppingType;
    }

    public void setToppingType(String toppingType) {
        this.toppingType = toppingType;
    }

    @Override
    public String toString() {
        return "Toppings{" +
                "toppingType='" + toppingType + '\'' +
                '}';
    }
}
