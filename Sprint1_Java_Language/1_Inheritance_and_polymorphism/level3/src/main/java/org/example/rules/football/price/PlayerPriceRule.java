package org.example.rules.football.price;

import org.example.model.FootballNew;
import org.example.model.New;
import org.example.model.enums.FootballPlayer;
import org.example.rules.PriceRule;

import java.util.Set;

public class PlayerPriceRule implements PriceRule {
    private static final Set<FootballPlayer> keyPlayers = Set.of(
            FootballPlayer.BENZEMA,
            FootballPlayer.FERRAN_TORRES
    );

    @Override
    public double calculate(New newItem) {
        if(!(newItem instanceof FootballNew footballNew)){
            return 0.0;
        }
        return keyPlayers.contains(footballNew.getPlayer()) ? 50.0 : 0.0;
    }
}