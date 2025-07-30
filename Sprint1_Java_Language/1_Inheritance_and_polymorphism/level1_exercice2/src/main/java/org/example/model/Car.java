package org.example.model;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class Car {
    private static final String BRAND = "Ford";
    private static  String model;
    private final int power;

    public String start() {
        return "The car is accelerating";
    }

    public static String stop() {
        return "The car is stopping";
    }
}
