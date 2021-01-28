package com.abrari.demo.dependencies;

import org.springframework.stereotype.Component;

@Component
public class Bread {

    String breadType;

    public String getBreadType() {
        return breadType;
    }

    @Override
    public String toString() {
        return "Bread{" +
                "breadType='" + breadType + '\'' +
                '}';
    }
}
