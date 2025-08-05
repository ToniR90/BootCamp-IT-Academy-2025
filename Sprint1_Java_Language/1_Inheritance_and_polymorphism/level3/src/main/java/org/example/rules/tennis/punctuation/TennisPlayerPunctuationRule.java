package org.example.rules.tennis.punctuation;

import org.example.model.New;
import org.example.model.TennisNew;
import org.example.model.enums.TennisPlayer;
import org.example.rules.PunctuationRule;

import java.util.Set;

public class TennisPlayerPunctuationRule implements PunctuationRule {

    private static final Set<TennisPlayer> keyTennisPlayers = Set.of(
            TennisPlayer.NADAL,
            TennisPlayer.FEDERER
    );

    @Override
    public int apply(New newItem) {
        if(!(newItem instanceof TennisNew tennisNew)) {
            return 0;
        }
        return keyTennisPlayers.contains(tennisNew.getTennisPlayer()) ? 3 : 0;
    }
}
