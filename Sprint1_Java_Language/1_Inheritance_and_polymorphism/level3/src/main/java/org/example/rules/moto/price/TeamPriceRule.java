package org.example.rules.moto.price;

import org.example.model.MotoNew;
import org.example.model.New;
import org.example.model.enums.MotoTeam;
import org.example.rules.PriceRule;

import java.util.Set;

public class TeamPriceRule implements PriceRule {

    private static final Set<MotoTeam> keyTeams = Set.of(
            MotoTeam.HONDA,
            MotoTeam.YAMAHA
    );

    @Override
    public double apply(New newItem) {
        if(!(newItem instanceof MotoNew motoNew)) {
            return 0.0;
        }
        return keyTeams.contains(motoNew.getMotoTeam()) ? 50.0 : 0.0;
    }
}
