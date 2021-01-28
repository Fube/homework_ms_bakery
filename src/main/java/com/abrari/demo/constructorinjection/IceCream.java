package com.abrari.demo.constructorinjection;

import com.abrari.demo.dependencies.Toppings;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class IceCream {

    @Autowired
    private Toppings toppings;

    public Toppings getToppings() {
        return toppings;
    }

    @Override
    public String toString() {
        return "IceCream{" +
                "toppings=" + toppings +
                '}';
    }
}
