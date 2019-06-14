package com.tts.oop.Interface;

import java.time.LocalDate;

public interface Reservable {
    LocalDate dayAvailable = null;
    public int daysUntilAvailable();
}
