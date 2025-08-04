package org.example.service.football;

import org.example.model.FootballNew;
import org.example.model.enums.FootballClub;
import org.example.model.enums.FootballCompetition;
import org.example.model.enums.FootballPlayer;
import org.example.rules.PriceRule;
import org.example.rules.football.price.ClubPriceRule;
import org.example.rules.football.price.CompetitionPriceRule;
import org.example.rules.football.price.PlayerPriceRule;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class FootballPriceCalculatorTest {

    @Test
    void shouldCalculateCorrectPrice() {
        FootballNew footballNew = FootballNew.builder()
                .competition(FootballCompetition.CHAMPIONS_LEAGUE)
                .player(FootballPlayer.FERRAN_TORRES)
                .club(FootballClub.BARCELONA)
                .build();

        List<PriceRule> rules = List.of(
                new CompetitionPriceRule(),
                new ClubPriceRule(),
                new PlayerPriceRule()
        );

        FootballPriceCalculator calculator = new FootballPriceCalculator(rules);

        double result = calculator.calculate(footballNew);
        assertEquals(550.0 , result);
    }
}