package org.example.model;

import lombok.experimental.SuperBuilder;

@SuperBuilder
public class WindInstrument extends Instrument{
    {
        System.out.println("Initializer block started in WindInstrument class");
    }

    @Override
    public void play() {
        System.out.println(this.getName() + ": Wind instrument is playing");
    }
}
