package org.example.model;

import lombok.Getter;
import lombok.Setter;
import lombok.experimental.SuperBuilder;

@Getter
@Setter
@SuperBuilder
public abstract class New {
    private String headline;
    private String text;
    protected int punctuation;
    protected double price;

    protected New(String headline, String text) {
        this.headline = headline;
        this.text = (text != null) ? text : "";
    }

    public abstract void calculatePrice();
    public abstract void calculatePunctuation();
}