package org.example.service.f1;

import org.example.model.F1New;
import org.example.model.enums.F1Team;
import org.example.rules.PriceRule;
import org.example.rules.f1.price.TeamPriceRule;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class F1PriceCalculatorTest {

    @Test
    void shouldCalculateCorrectPrice() {
        F1New f1New = F1New.builder()
                .f1Team(F1Team.MERCEDES)
                .build();

        List<PriceRule> rules = List.of(
                new TeamPriceRule()
        );

        F1PriceCalculator calculator = new F1PriceCalculator(rules);

        double result = calculator.calculate(f1New);
        assertEquals(150 , result);
    }
}