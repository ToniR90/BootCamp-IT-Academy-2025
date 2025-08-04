package org.example.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.SuperBuilder;

@Getter
@Setter
@SuperBuilder
@NoArgsConstructor
public abstract class New {
    private String headline;
    private String text;
    protected int punctuation;
    protected double price;

    protected New(String headline, String text) {
        this.headline = headline;
        this.text = (text != null) ? text : "";
    }
}