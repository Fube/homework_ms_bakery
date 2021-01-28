package com.abrari.demo.constructorinjection;

import com.abrari.demo.dependencies.Dough;
import com.abrari.demo.injectors.IInjectDough;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Pizza implements IInjectDough {

    Dough doughType;

    @Override
    @Autowired
    public void injectDough(Dough dough) {
        doughType = dough;
    }

    public Dough getDoughType() {
        return doughType;
    }

    @Override
    public String toString() {
        return "Pizza{" +
                "doughType=" + doughType +
                '}';
    }
}
