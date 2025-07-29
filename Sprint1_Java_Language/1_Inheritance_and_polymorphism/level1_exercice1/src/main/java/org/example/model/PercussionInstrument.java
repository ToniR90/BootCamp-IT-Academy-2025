package org.example.model;

import lombok.experimental.SuperBuilder;

@SuperBuilder
public class PercussionInstrument extends Instrument{
    {
        System.out.println("Initializer block started in PercussionInstrument class");
    }

    @Override
    public void play() {
        System.out.println(this.getName() + ": Percussion instrument is playing");
    }
}
