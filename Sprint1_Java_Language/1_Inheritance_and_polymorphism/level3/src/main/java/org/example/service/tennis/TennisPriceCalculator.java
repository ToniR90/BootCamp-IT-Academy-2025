package org.example.service.tennis;

import lombok.AllArgsConstructor;
import org.example.model.New;
import org.example.rules.PriceRule;
import org.example.service.PriceCalculator;

import java.util.List;

@AllArgsConstructor
public class TennisPriceCalculator implements PriceCalculator {

    private final List<PriceRule> rules;

    @Override
    public double calculate(New newItem) {
        return 150 + rules.stream()
                .mapToDouble(rule -> rule.apply(newItem))
                .sum();
    }
}
