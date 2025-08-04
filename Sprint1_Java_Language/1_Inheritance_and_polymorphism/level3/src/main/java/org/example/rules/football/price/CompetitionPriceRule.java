package org.example.rules.football.price;


import org.example.model.FootballNew;
import org.example.model.New;
import org.example.model.enums.FootballCompetition;
import org.example.rules.PriceRule;

import java.util.Set;

public class CompetitionPriceRule implements PriceRule {

    private static final Set<FootballCompetition> keyCompetitions = Set.of(
            FootballCompetition.CHAMPIONS_LEAGUE
    );

    @Override
    public double apply(New newItem) {
        if(!(newItem instanceof FootballNew footballNew)){
            return 0.0;
        }
        return keyCompetitions.contains(footballNew.getCompetition()) ? 100.0 : 0.0;
    }
}