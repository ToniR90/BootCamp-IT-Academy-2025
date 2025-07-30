package org.example;

import org.example.model.Smartphone;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SmartphoneTest {

    @Test
    void testSmartphoneFeatures() {
        Smartphone smartphone = Smartphone.builder()
                .brand("Apple")
                .model("15 Pro Max")
                .build();
        assertEquals("Calling to 658475125" , smartphone.call("658475125"));
        assertEquals("Taking photo" , smartphone.takePhoto());
        assertEquals("Alarm is ringing" , smartphone.alarm());
    }
}