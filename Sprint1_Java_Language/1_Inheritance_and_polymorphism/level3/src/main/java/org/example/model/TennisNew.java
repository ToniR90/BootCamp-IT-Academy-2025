package org.example.model;

import lombok.Getter;
import lombok.experimental.SuperBuilder;
import org.example.model.enums.TennisCompetition;
import org.example.model.enums.TennisPlayer;

@Getter
@SuperBuilder
public class TennisNew extends New{
    private TennisCompetition tennisCompetition;
    private TennisPlayer tennisPlayer;
}
