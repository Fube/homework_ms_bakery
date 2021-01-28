package com.abrari.demo.setterinjection;

import com.abrari.demo.dependencies.Flavor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Cookie {

    private Flavor flavorType;

    public Flavor getFlavorType() {
        return flavorType;
    }

    @Autowired
    public void setFlavorType(Flavor flavorType) {
        this.flavorType = flavorType;
    }


    @Override
    public String toString() {
        return "Cookie{" +
                "flavorType=" + flavorType +
                '}';
    }
}
