package org.example.service.f1;

import lombok.AllArgsConstructor;
import org.example.model.New;
import org.example.rules.PunctuationRule;

import java.util.List;

@AllArgsConstructor
public class F1PunctuationCalculator implements PunctuationRule {

    private final List<PunctuationRule> rules;

    @Override
    public int calculate(New newItem) {
        return 4 + rules.stream()
                .mapToInt(rule -> rule.calculate(newItem))
                .sum();
    }
}
