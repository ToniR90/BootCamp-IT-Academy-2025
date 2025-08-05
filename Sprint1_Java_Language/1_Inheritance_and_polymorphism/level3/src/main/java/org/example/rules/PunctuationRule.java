package org.example.rules;

import org.example.model.New;

@FunctionalInterface
public interface PunctuationRule {
    int calculate(New newItem);
}
