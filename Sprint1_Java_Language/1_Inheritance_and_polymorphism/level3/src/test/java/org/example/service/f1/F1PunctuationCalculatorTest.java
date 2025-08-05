package org.example.service.f1;

import org.example.model.F1New;
import org.example.model.enums.F1Team;
import org.example.rules.PunctuationRule;
import org.example.rules.f1.punctuation.TeamPunctuationRule;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class F1PunctuationCalculatorTest {

    @Test
    void shouldCalculateCorrectPunctuation() {
        F1New f1New = F1New.builder()
                .f1Team(F1Team.MERCEDES)
                .build();

        List<PunctuationRule> rules = List.of(
                new TeamPunctuationRule()
        );

        F1PunctuationCalculator calculator = new F1PunctuationCalculator(rules);

        int result = calculator.calculate(f1New);
        assertEquals(6 , result);
    }
}