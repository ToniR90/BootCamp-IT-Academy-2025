package org.example.service.basketball;

import org.example.model.BasketballNew;
import org.example.model.enums.BasketballClub;
import org.example.model.enums.BasketballCompetition;
import org.example.rules.PunctuationRule;
import org.example.rules.basketball.punctuation.ClubPunctuationRule;
import org.example.rules.basketball.punctuation.CompetitionPunctuationRule;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
class BasketballPunctuationCalculatorTest {

    @Test
    void shouldCalculateCorrectPunctuation() {
        BasketballNew basketballNew = BasketballNew.builder()
                .basketballCompetition(BasketballCompetition.EURO_LEAGUE)
                .basketballClub(BasketballClub.BARCELONA)
                .build();

        List<PunctuationRule> rules = List.of(
                new CompetitionPunctuationRule(),
                new ClubPunctuationRule()
        );

        BasketballPunctuationCalculator calculator = new BasketballPunctuationCalculator(rules);

        int result = calculator.calculate(basketballNew);
        assertEquals(8 , result);
    }
}