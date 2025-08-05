package org.example.rules.f1.price;

import org.example.model.F1New;
import org.example.model.New;
import org.example.model.enums.F1Team;
import org.example.rules.PriceRule;

import java.util.Set;

public class TeamPriceRule implements PriceRule {

    private static final Set<F1Team> keyTeams = Set.of(
            F1Team.FERRARI,
            F1Team.MERCEDES
    );

    @Override
    public double calculate(New newItem) {
        if(!(newItem instanceof F1New f1New)) {
            return 0.0;
        }
        return keyTeams.contains(f1New.getF1Team()) ? 50.0 : 0.0;
    }
}
