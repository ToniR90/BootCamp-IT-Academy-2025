package org.example.rules.basketball.price;

import org.example.model.BasketballNew;
import org.example.model.New;
import org.example.model.enums.BasketballCompetition;
import org.example.rules.PriceRule;

import java.util.Set;

public class CompetitionPriceRule implements PriceRule {

    private static final Set<BasketballCompetition> keyCompetitions = Set.of(
            BasketballCompetition.EURO_LEAGUE,
            BasketballCompetition.ACB
    );

    @Override
    public double apply(New newItem) {
        if(!(newItem instanceof BasketballNew basketballNew)) {
            return 0.0;
        }
        return keyCompetitions.contains(basketballNew.getBasketballCompetition()) ? 75 : 0.0;
    }
}