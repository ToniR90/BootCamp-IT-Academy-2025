package org.example.model;

import lombok.experimental.SuperBuilder;

@SuperBuilder
public class StringsInstrument extends Instrument{
    {
        System.out.println("Initializer block started in StringsInstrument class");
    }

    @Override
    public void play() {
        System.out.println(this.getName() + ": Strings instrument is playing");
    }
}
