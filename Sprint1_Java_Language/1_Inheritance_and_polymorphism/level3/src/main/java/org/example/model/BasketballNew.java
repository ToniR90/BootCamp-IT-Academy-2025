package org.example.model;

import lombok.Getter;
import lombok.experimental.SuperBuilder;
import org.example.model.enums.BasketballClub;
import org.example.model.enums.BasketballCompetition;

@Getter
@SuperBuilder
public class BasketballNew extends New{
    private BasketballCompetition basketballCompetition;
    private BasketballClub basketballClub;
}
