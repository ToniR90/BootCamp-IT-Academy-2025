package org.example;

import org.example.model.Instrument;
import org.example.model.PercussionInstrument;
import org.example.model.StringsInstrument;
import org.example.model.WindInstrument;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Instrument> instruments = List.of(
                WindInstrument.builder()
                        .name("Flute").
                        price(7.99
                        ).build(),

                StringsInstrument.builder()
                        .name("Bass")
                        .price(799.99)
                        .build(),

                PercussionInstrument.builder()
                        .name("Drums")
                        .price(1199.99)
                        .build()
        );

        for (Instrument instrument : instruments) {
            instrument.play();
        }
    }
}

//WindInstrument windInstrument = WindInstrument.builder()
//                .name("Flute")
//                .price(7.99)
//                .build();
//        windInstrument.play();
//
//        StringsInstrument stringsInstrument = StringsInstrument.builder()
//                .name("Bass")
//                .price(899.99)
//                .build();
//        stringsInstrument.play();
//
//        PercussionInstrument percussionInstrument = PercussionInstrument.builder()
//                .name("Drums").
//                price(1199.99)
//                .build();
//        percussionInstrument.play();