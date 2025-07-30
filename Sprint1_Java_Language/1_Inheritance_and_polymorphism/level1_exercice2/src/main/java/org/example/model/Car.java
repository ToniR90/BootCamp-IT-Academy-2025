package org.example.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@AllArgsConstructor
@Builder
@Data
public class Car {
    private static final String BRAND = "Ford";
    public static String model;
    private final int power;

    public String accelerate() {
        return "The car is accelerating";
    }

    public static String brake() {
        return "The car is braking";
    }
}
