package org.example;

import org.example.model.Car;

public class Main {
    public static void main(String[] args) {
        Car car = Car.builder()
                .power(1000).build();

        Car.model = "Mustang";

        System.out.println(car.accelerate());
        System.out.println(Car.brake());
    }
}