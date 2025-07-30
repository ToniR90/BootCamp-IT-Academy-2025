package org.example.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@AllArgsConstructor
@Builder
@Data
public class Car {
    private static final String BRAND = "Ford";
    private static  String model;
    private final int power;

    public String accelerate() {
        return "The car is accelerating";
    }

    public static String stop() {
        return "The car is stopping";
    }
}
