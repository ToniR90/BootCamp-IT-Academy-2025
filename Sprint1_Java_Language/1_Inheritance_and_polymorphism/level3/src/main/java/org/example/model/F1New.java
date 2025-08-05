package org.example.model;

import lombok.Getter;
import lombok.experimental.SuperBuilder;
import org.example.model.enums.F1Team;

@Getter
@SuperBuilder
public class F1New extends New {
    private F1Team f1Team;
}
