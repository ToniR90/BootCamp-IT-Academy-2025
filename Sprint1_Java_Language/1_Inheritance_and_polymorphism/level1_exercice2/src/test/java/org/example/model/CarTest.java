package org.example.model;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class CarTest {

    @Test
    void testAccelerate() {
        Car car = Car.builder()
                .power(1000)
                .build();
        String result = car.accelerate();
        assertEquals("The car is accelerating" , result);
    }

    @Test
    void testBrake() {
        String result = Car.brake();
        assertEquals("The car is braking" , result);
    }
}