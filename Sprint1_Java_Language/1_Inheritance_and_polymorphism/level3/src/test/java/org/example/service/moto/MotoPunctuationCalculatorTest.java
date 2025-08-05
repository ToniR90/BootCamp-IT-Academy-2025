package org.example.service.moto;

import org.example.model.MotoNew;
import org.example.model.enums.MotoTeam;
import org.example.rules.PunctuationRule;
import org.example.rules.moto.punctuation.TeamPunctuationRule;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class MotoPunctuationCalculatorTest {

    @Test
    void shouldCalculateCorrectPunctuation() {
        MotoNew motoNew = MotoNew.builder()
                .motoTeam(MotoTeam.OTHER)
                .build();

        List<PunctuationRule> rules = List.of(
                new TeamPunctuationRule()
        );

        MotoPunctuationCalculator calculator = new MotoPunctuationCalculator(rules);

        int result = calculator.calculate(motoNew);
        assertEquals(3 , result);
    }
}