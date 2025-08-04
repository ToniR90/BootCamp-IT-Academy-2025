package org.example.service.football;

import lombok.AllArgsConstructor;
import org.example.model.New;
import org.example.rules.PriceRule;
import org.example.service.PriceCalculator;

import java.util.List;

@AllArgsConstructor
public class FootballPriceCalculator implements PriceCalculator {

    private final List<PriceRule> rules;

    @Override
    public double calculate(New newItem) {
        return 300 + rules.stream()
                .mapToDouble(rule -> rule.apply(newItem))
                .sum();
    }
}
