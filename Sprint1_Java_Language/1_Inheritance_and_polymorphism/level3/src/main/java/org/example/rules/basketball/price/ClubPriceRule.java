package org.example.rules.basketball.price;

import org.example.model.BasketballNew;
import org.example.model.New;
import org.example.model.enums.BasketballClub;
import org.example.rules.PriceRule;

import java.util.Set;

public class ClubPriceRule implements PriceRule {

    private static final Set<BasketballClub> keyClubs = Set.of(
            BasketballClub.MADRID,
            BasketballClub.BARCELONA
    );

    @Override
    public double calculate(New newItem) {
        if(!(newItem instanceof BasketballNew basketballNew)) {
            return 0.0;
        }
        return keyClubs.contains(basketballNew.getBasketballClub()) ? 75.00 : 0.0;
    }
}