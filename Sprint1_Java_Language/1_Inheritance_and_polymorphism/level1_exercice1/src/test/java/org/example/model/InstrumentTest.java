package org.example.model;

import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

class InstrumentTest {
    private String tapSystemOut(Runnable runnable) {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        PrintStream original = System.out;
        System.setOut(new PrintStream(out));
        runnable.run();
        System.setOut(original);
        return out.toString().trim();
    }

    @Test
    void shouldBuildAllInstrumentsWithName() {
        var drum = PercussionInstrument.builder().name("Drums").price(50).build();
        var flute = WindInstrument.builder().name("Flute").price(75).build();
        var guitar = StringsInstrument.builder().name("Bass").price(120).build();

        assertEquals("Drums", drum.getName());
        assertEquals("Flute", flute.getName());
        assertEquals("Bass", guitar.getName());
    }

    @Test
    void percussionPlayShouldPrintCorrectly() {
        var drum = PercussionInstrument.builder().name("Bongo").build();
        String output = tapSystemOut(drum::play);
        assertEquals("Bongo: Percussion instrument is playing", output);
    }

    @Test
    void windPlayShouldPrintCorrectly() {
        var flute = WindInstrument.builder().name("Flute").build();
        String output = tapSystemOut(flute::play);
        assertEquals("Flute: Wind instrument is playing", output);
    }

    @Test
    void stringsPlayShouldPrintCorrectly() {
        var guitar = StringsInstrument.builder().name("Bass").build();
        String output = tapSystemOut(guitar::play);
        assertEquals("Bass: Strings instrument is playing", output);
    }

    @Test
    void instrumentShouldPlayPolymorphically() {
        List<Instrument> instruments = List.of(
                PercussionInstrument.builder().name("Congas").build(),
                WindInstrument.builder().name("Saxo").build(),
                StringsInstrument.builder().name("Guitar").build()
        );

        for (Instrument instrument : instruments) {
            String output = tapSystemOut(instrument::play);
            assertTrue(output.contains(instrument.getName()));
        }
    }

    @Test
    void instrumentWithNoNameShouldNotFail() {
        var silent = StringsInstrument.builder().build();
        String output = tapSystemOut(silent::play);
        assertEquals("null: Strings instrument is playing", output);
    }
}