package org.example.model;

import lombok.experimental.SuperBuilder;

@SuperBuilder
public class WindInstrument extends Instrument{
    {
        System.out.println("Initializer block started");
    }

    @Override
    public void play() {
        System.out.println(this.getName() + ": Wind instrument is playing");
    }
}
