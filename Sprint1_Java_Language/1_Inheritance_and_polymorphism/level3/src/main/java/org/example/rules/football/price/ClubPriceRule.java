package org.example.rules.football.price;

import org.example.model.FootballNew;
import org.example.model.New;
import org.example.model.enums.FootballClub;
import org.example.rules.PriceRule;

import java.util.Set;

public class ClubPriceRule implements PriceRule {

    private static final Set<FootballClub> keyClubs = Set.of(
            FootballClub.BARCELONA,
            FootballClub.MADRID
    );
    @Override
    public double calculate(New newItem) {
        if(!(newItem instanceof FootballNew footballNew)){
            return 0.0;
        }
        return keyClubs.contains(footballNew.getClub()) ? 100.0 : 0.0;
    }
}
