package org.example.rules.football.punctuation;

import org.example.model.FootballNew;
import org.example.model.New;
import org.example.model.enums.FootballClub;
import org.example.rules.PunctuationRule;

import java.util.Set;

public class ClubPunctuationRule implements PunctuationRule {

    private static final Set<FootballClub> keyClubs = Set.of(
            FootballClub.BARCELONA,
            FootballClub.MADRID
    );

    @Override
    public int calculate(New newItem) {
        if(!(newItem instanceof FootballNew footballNew)) {
            return 0;
        }
        return keyClubs.contains(footballNew.getClub()) ? 1 : 0;
    }
}