package org.example.rules.tennis.price;

import org.example.model.New;
import org.example.model.TennisNew;
import org.example.model.enums.TennisPlayer;
import org.example.rules.PriceRule;

import java.util.Set;

public class TennisPlayerPriceRule implements PriceRule {

    private static final Set<TennisPlayer> keyTennisPlayers = Set.of(
            TennisPlayer.NADAL,
            TennisPlayer.FEDERER
    );

    @Override
    public double calculate(New newItem) {
        if(!(newItem instanceof TennisNew tennisNew)) {
            return 0.0;
        }
        return keyTennisPlayers.contains(tennisNew.getTennisPlayer()) ? 100.0 : 0;
    }
}
