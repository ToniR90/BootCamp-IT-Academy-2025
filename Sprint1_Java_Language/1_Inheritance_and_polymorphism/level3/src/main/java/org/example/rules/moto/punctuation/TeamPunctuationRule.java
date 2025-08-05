package org.example.rules.moto.punctuation;

import org.example.model.MotoNew;
import org.example.model.New;
import org.example.model.enums.MotoTeam;
import org.example.rules.PunctuationRule;

import java.util.Set;

public class TeamPunctuationRule implements PunctuationRule {

    private static final Set<MotoTeam> keyTeams = Set.of(
            MotoTeam.HONDA,
            MotoTeam.YAMAHA
    );

    @Override
    public int calculate(New newItem) {
        if(!(newItem instanceof MotoNew motoNew)) {
            return 0;
        }
        return keyTeams.contains(motoNew.getMotoTeam()) ? 3 : 0;
    }
}
