package com.abrari.demo.dependencies;

import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
@NoArgsConstructor
public class Flavor {

    @Value("Foobar")
    String flavorType;
    @Value("Qux")
    String colour;


    public Flavor(String flavorType, String colour) {
        this.flavorType = flavorType;
        this.colour = colour;
    }

    public String getFlavorType() {
        return flavorType;
    }

    public void setFlavorType(String flavorType) {
        this.flavorType = flavorType;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    @Override
    public String toString() {
        return "Flavor{" +
                "flavorType='" + flavorType + '\'' +
                ", colour='" + colour + '\'' +
                '}';
    }
}
