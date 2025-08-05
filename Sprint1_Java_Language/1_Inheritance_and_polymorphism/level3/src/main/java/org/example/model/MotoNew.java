package org.example.model;

import lombok.Getter;
import lombok.experimental.SuperBuilder;
import org.example.model.enums.MotoTeam;

@Getter
@SuperBuilder
public class MotoNew extends New {
    private MotoTeam motoTeam;
}
