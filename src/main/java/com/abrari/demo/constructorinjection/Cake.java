package com.abrari.demo.constructorinjection;

import com.abrari.demo.dependencies.Flavor;
import lombok.Getter;
import lombok.NonNull;
import lombok.ToString;
import org.springframework.stereotype.Component;

@Component
public class Cake {

    private Flavor flavor;

    Cake(@NonNull Flavor flavor){
        this.flavor = flavor;
    }

    public Flavor getFlavor() {
        return flavor;
    }

    @Override
    public String toString() {
        return "Cake{" +
                "flavor=" + flavor +
                '}';
    }
}
