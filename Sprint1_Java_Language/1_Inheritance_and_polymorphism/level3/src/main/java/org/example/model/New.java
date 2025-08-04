package org.example.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.experimental.SuperBuilder;

@Data
@SuperBuilder
@AllArgsConstructor
public abstract class New {
    private String headline;
    private String text = "";
    private int punctuation;
    private double price;

}