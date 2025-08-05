package org.example.service.basketball;

import lombok.AllArgsConstructor;
import org.example.model.New;
import org.example.rules.PunctuationRule;
import org.example.service.PunctuationCalculator;

import java.util.List;

@AllArgsConstructor
public class BasketballPunctuationCalculator implements PunctuationCalculator {

    private final List<PunctuationRule> rules;

    @Override
    public int calculate(New newItem) {
        return 4 + rules.stream()
                .mapToInt(rule -> rule.apply(newItem))
                .sum();
    }
}
