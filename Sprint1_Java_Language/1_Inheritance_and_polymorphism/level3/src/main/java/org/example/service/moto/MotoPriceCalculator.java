package org.example.service.moto;

import lombok.AllArgsConstructor;
import org.example.model.New;
import org.example.rules.PriceRule;
import org.example.service.PriceCalculator;

import java.util.List;

@AllArgsConstructor
public class MotoPriceCalculator implements PriceCalculator {

    private final List<PriceRule> rules;

    @Override
    public double calculate(New newItem) {
        return 100 + rules.stream()
                .mapToDouble(rule -> rule.apply(newItem))
                .sum();
    }
}
