package org.example.model;

import lombok.Data;
import lombok.experimental.SuperBuilder;

@Data
@SuperBuilder
public class Phone {
    private String brand;
    private String model;

    public String call(String phoneNumber) {
        return "Calling to " + phoneNumber;
    }
}
