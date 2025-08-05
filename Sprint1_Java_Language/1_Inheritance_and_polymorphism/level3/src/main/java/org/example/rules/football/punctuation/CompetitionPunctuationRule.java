package org.example.rules.football.punctuation;

import org.example.model.FootballNew;
import org.example.model.New;
import org.example.model.enums.FootballCompetition;
import org.example.rules.PunctuationRule;

import java.util.Map;

public class CompetitionPunctuationRule implements PunctuationRule {

    private static final Map<FootballCompetition , Integer> keyCompetitions = Map.of(
            FootballCompetition.CHAMPIONS_LEAGUE, 3 ,
            FootballCompetition.LEAGUE, 2
    );

    @Override
    public int calculate(New newItem) {
        if(!(newItem instanceof FootballNew footballNew)) {
            return 0;
        }
        return keyCompetitions.getOrDefault(footballNew.getCompetition() , 0);
    }
}
