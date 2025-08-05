package org.example.service.moto;

import org.example.model.MotoNew;
import org.example.model.enums.MotoTeam;
import org.example.rules.PriceRule;
import org.example.rules.moto.price.TeamPriceRule;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class MotoPriceCalculatorTest {

    @Test
    void shouldCalculateCorrectPrice() {
        MotoNew motoNew = MotoNew.builder()
                .motoTeam(MotoTeam.OTHER)
                .build();
        List<PriceRule> rules = List.of(
                new TeamPriceRule()
        );

        MotoPriceCalculator calculator = new MotoPriceCalculator(rules);

        double result = calculator.calculate(motoNew);
        assertEquals(100 , result);
    }
}