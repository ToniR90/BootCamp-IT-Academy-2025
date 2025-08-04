package org.example.service.football;

import org.example.model.FootballNew;
import org.example.model.enums.FootballClub;
import org.example.model.enums.FootballCompetition;
import org.example.model.enums.FootballPlayer;
import org.example.rules.PunctuationRule;
import org.example.rules.football.punctuation.ClubPunctuationRule;
import org.example.rules.football.punctuation.CompetitionPunctuationRule;
import org.example.rules.football.punctuation.PlayerPunctuationRule;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class FootballPunctuationCalculatorTest {

    @Test
    void shouldCalculateCorrectPunctuation() {
        FootballNew footballNew = FootballNew.builder()
                .competition(FootballCompetition.LEAGUE)
                .club(FootballClub.BARCELONA)
                .player(FootballPlayer.BENZEMA)
                .build();

        List<PunctuationRule> rules = List.of(
                new CompetitionPunctuationRule(),
                new ClubPunctuationRule(),
                new PlayerPunctuationRule()
        );

        FootballPunctuationCalculator calculator = new FootballPunctuationCalculator(rules);

        double result = calculator.calculate(footballNew);
        assertEquals(9 , result);
    }
}