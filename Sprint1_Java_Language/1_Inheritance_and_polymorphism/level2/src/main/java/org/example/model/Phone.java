package org.example.model;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Phone {
    private String brand;
    private String model;

    public String call(String phoneNumber) {
        return "Calling to " + phoneNumber + " number";
    }
}
