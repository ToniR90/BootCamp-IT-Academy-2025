package org.example.service.basketball;

import lombok.AllArgsConstructor;
import org.example.model.New;
import org.example.rules.PriceRule;
import org.example.service.PriceCalculator;

import java.util.List;

@AllArgsConstructor
public class BasketballPriceCalculator implements PriceCalculator {

    private final List<PriceRule> rules;

    @Override
    public double calculate(New newItem) {
        return 250 + rules.stream()
                .mapToDouble(rule -> rule.calculate(newItem))
                .sum();
    }
}
