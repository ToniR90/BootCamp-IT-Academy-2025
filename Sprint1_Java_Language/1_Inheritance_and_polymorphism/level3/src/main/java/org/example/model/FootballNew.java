package org.example.model;

import lombok.Getter;
import lombok.Setter;
import lombok.experimental.SuperBuilder;
import org.example.model.enums.FootballClub;
import org.example.model.enums.FootballCompetition;
import org.example.model.enums.FootballPlayer;

@Getter
@Setter
@SuperBuilder
public class FootballNew extends New {
    private FootballCompetition competition;
    private FootballClub club;
    private FootballPlayer player;

    @Override
    public void calculatePrice() {

    }

    @Override
    public void calculatePunctuation() {

    }
}
