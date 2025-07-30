package org.example.model;

import lombok.experimental.SuperBuilder;
import org.example.service.Camera;
import org.example.service.Clock;

@SuperBuilder
public class Smartphone extends Phone implements Camera, Clock {
    @Override
    public String takePhoto() {
        return "Taking photo";
    }

    @Override
    public String alarm() {
        return "Alarm is ringing";
    }
}
