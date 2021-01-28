package com.abrari.demo.dependencies;

import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Flour {

    @Value("Very")
    String consistency; // I don't know man. I don't cook or bake

    public Flour(String consistency) {
        this.consistency = consistency;
    }

    public Flour() {
    }

    public String getConsistency() {
        return consistency;
    }

    @Override
    public String toString() {
        return "Flour{" +
                "consistency='" + consistency + '\'' +
                '}';
    }
}
