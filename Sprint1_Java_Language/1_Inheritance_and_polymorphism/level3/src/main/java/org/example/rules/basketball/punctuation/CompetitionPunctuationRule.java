package org.example.rules.basketball.punctuation;

import org.example.model.BasketballNew;
import org.example.model.New;
import org.example.model.enums.BasketballCompetition;
import org.example.rules.PunctuationRule;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class CompetitionPunctuationRule implements PunctuationRule {

    private static final Map<BasketballCompetition , Integer> keyCompetitions = Map.of(
            BasketballCompetition.EURO_LEAGUE, 3 ,
            BasketballCompetition.ACB , 2
    );

    @Override
    public int calculate(New newItem) {
        if(!(newItem instanceof BasketballNew basketballNew)) {
            return 0;
        }
        return keyCompetitions.getOrDefault(basketballNew.getBasketballCompetition() , 0);
    }
}