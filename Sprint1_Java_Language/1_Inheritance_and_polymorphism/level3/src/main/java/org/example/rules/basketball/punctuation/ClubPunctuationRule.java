package org.example.rules.basketball.punctuation;

import org.example.model.BasketballNew;
import org.example.model.New;
import org.example.model.enums.BasketballClub;
import org.example.rules.PunctuationRule;

import java.util.Set;

public class ClubPunctuationRule implements PunctuationRule {

    private static final Set<BasketballClub> keyClubs = Set.of(
            BasketballClub.MADRID,
            BasketballClub.BARCELONA
    );

    @Override
    public int calculate(New newItem) {
        if(!(newItem instanceof BasketballNew basketballNew)) {
            return 0;
        }
        return keyClubs.contains(basketballNew.getBasketballClub()) ? 1 : 0;
    }
}
