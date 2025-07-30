package org.example.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.experimental.SuperBuilder;

@Data
@SuperBuilder
@AllArgsConstructor
public abstract class Instrument {
    private String name;
    private double price;

    static {
        System.out.println("Static block initialized");
    }

    public abstract void play();
}
