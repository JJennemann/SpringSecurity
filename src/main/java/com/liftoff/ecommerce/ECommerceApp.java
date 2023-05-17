package com.liftoff.ecommerce;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
//@ComponentScan("com.liftoff.ecommerce.controller")
public class ECommerceApp {

    public static void main(String[] args) {
        SpringApplication.run(ECommerceApp.class, args);
    }

}
