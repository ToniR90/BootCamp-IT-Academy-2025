package org.example.rules;

import org.example.model.New;

@FunctionalInterface
public interface PriceRule {
    double apply(New newItem);
}
