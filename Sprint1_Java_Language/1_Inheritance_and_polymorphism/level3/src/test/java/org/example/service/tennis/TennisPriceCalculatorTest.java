package org.example.service.tennis;

import org.example.model.TennisNew;
import org.example.model.enums.TennisPlayer;
import org.example.rules.PriceRule;
import org.example.rules.tennis.price.TennisPlayerPriceRule;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class TennisPriceCalculatorTest {

    @Test
    void shouldCalculateCorrectPrice() {
        TennisNew tennisNew = TennisNew.builder()
                .tennisPlayer(TennisPlayer.FEDERER)
                .build();

        List<PriceRule> rules = List.of(
                new TennisPlayerPriceRule()
        );

        TennisPriceCalculator calculator = new TennisPriceCalculator(rules);

        double result = calculator.calculate(tennisNew);
        assertEquals(250 , result);
    }
}