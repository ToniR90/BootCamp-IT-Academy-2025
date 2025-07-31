package org.example.model;

import lombok.Data;
import lombok.experimental.SuperBuilder;
import org.example.model.enums.FootballClub;
import org.example.model.enums.FootballCompetition;
import org.example.model.enums.FootballPlayer;

@Data
@SuperBuilder
public class FootballNew extends New {
    private FootballCompetition competition;
    private FootballClub club;
    private FootballPlayer player;

    @Override
    protected String calculatePrice() {
        return "";
    }

    @Override
    protected String calculatePunctuation() {
        return "";
    }
}
