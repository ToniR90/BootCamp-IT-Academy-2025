package org.example.service.basketball;

import org.example.model.BasketballNew;
import org.example.model.enums.BasketballClub;
import org.example.model.enums.BasketballCompetition;
import org.example.rules.PriceRule;
import org.example.rules.basketball.price.ClubPriceRule;
import org.example.rules.basketball.price.CompetitionPriceRule;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class BasketballPriceCalculatorTest {

    @Test
    void shouldCalculateCorrectPrice() {
        BasketballNew basketballNew = BasketballNew.builder()
                .basketballCompetition(BasketballCompetition.EURO_LEAGUE)
                .basketballClub(BasketballClub.BARCELONA)
                .build();

        List<PriceRule> rules = List.of(
                new CompetitionPriceRule(),
                new ClubPriceRule()
        );

        BasketballPriceCalculator calculator = new BasketballPriceCalculator(rules);

        double result = calculator.calculate(basketballNew);
        assertEquals(400 , result);
    }
}