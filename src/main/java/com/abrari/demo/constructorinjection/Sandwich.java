package com.abrari.demo.constructorinjection;

import com.abrari.demo.dependencies.Bread;
import com.abrari.demo.dependencies.Meat;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Sandwich {

    private Bread bread;
    private Meat meat;

    @Autowired
    public Sandwich(Bread bread, Meat meat) {
        this.bread = bread;
        this.meat = meat;
    }

    public Sandwich(Meat meat) {
        this.meat = meat;
    }

    public Bread getBread() {
        return bread;
    }

    public Meat getMeat() {
        return meat;
    }

    @Override
    public String toString() {
        return "Sandwich{" +
                "bread=" + bread +
                ", meat=" + meat +
                '}';
    }
}
