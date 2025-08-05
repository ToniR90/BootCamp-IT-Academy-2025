package org.example.service.tennis;

import org.example.model.TennisNew;
import org.example.model.enums.TennisPlayer;
import org.example.rules.PunctuationRule;
import org.example.rules.tennis.punctuation.TennisPlayerPunctuationRule;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class TennisPunctuationCalculatorTest {

    @Test
    void shouldCalculateCorrectPunctuation() {
        TennisNew tennisNew = TennisNew.builder()
                .tennisPlayer(TennisPlayer.FEDERER)
                .build();

        List<PunctuationRule> rules = List.of(
                new TennisPlayerPunctuationRule()
        );

        TennisPunctuationCalculator calculator = new TennisPunctuationCalculator(rules);

        int result = calculator.calculate(tennisNew);
        assertEquals(7 , result);
    }
}