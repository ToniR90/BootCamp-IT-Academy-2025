package org.example.service.football;

import lombok.AllArgsConstructor;
import org.example.model.New;
import org.example.rules.PunctuationRule;
import org.example.service.PunctuationCalculator;

import java.util.List;

@AllArgsConstructor
public class FootballPunctuationCalculator implements PunctuationCalculator {

    private final List<PunctuationRule> rules;

    @Override
    public int calculate(New newItem) {
        return 5 + rules.stream()
                .mapToInt(rule -> rule.calculate(newItem))
                .sum();
    }
}
