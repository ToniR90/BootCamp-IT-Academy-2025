package org.example.model;

import lombok.Data;

@Data
public abstract class New {
    private String headline;
    private String text = "";
    private int punctuation;
    private double price;
}
