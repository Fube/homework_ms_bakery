package com.abrari.demo.dependencies;

import org.springframework.stereotype.Component;

@Component
public class Dough {

    Flour flourType;

    public Dough(Flour flourType) {
        this.flourType = flourType;
    }

    public Flour getFlourType() {
        return flourType;
    }

    @Override
    public String toString() {
        return "Dough{" +
                "flourType=" + flourType +
                '}';
    }
}
