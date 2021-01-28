package com.abrari.demo.dependencies;

import org.springframework.stereotype.Component;

@Component
public class Meat {

    String meatType;

    public String getMeatType() {
        return meatType;
    }

    @Override
    public String toString() {
        return "Meat{" +
                "meatType='" + meatType + '\'' +
                '}';
    }
}
