package org.example.rules.football.punctuation;

import org.example.model.FootballNew;
import org.example.model.New;
import org.example.model.enums.FootballPlayer;
import org.example.rules.PunctuationRule;

import java.util.Set;

public class PlayerPunctuationRule implements PunctuationRule {

    private static final Set<FootballPlayer> keyPlayers = Set.of(
            FootballPlayer.BENZEMA,
            FootballPlayer.FERRAN_TORRES
    );

    @Override
    public int calculate(New newItem) {
        if(!(newItem instanceof FootballNew footballNew)) {
            return 0;
        }
        return keyPlayers.contains(footballNew.getPlayer()) ? 1 : 0;
    }
}