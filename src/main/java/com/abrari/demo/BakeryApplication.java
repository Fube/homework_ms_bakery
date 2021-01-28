package com.abrari.demo;

import com.abrari.demo.constructorinjection.Cake;
import com.abrari.demo.constructorinjection.IceCream;
import com.abrari.demo.constructorinjection.Pizza;
import com.abrari.demo.constructorinjection.Sandwich;
import com.abrari.demo.setterinjection.Cookie;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.*")
public class BakeryApplication {

    public static void main(String[] args) {

        var context = SpringApplication.run(BakeryApplication.class, args);
        Cake cake = context.getBean(Cake.class);
        System.out.printf("Cake Constructor Injection : %s%n", cake);

        Sandwich sand = context.getBean(Sandwich.class);
        System.out.printf("Sandwich Constructor Injection : %s%n", sand);

        Cookie cookie = context.getBean(Cookie.class);
        System.out.printf("Cookie Setter Injection : %s%n", cookie);

        IceCream iceCream = context.getBean(IceCream.class);
        System.out.printf("IceCream Field Injection : %s%n", iceCream);

        Pizza pizza = context.getBean(Pizza.class);
        System.out.printf("Pizza Interface Injection : %s%n", pizza);
    }
}
