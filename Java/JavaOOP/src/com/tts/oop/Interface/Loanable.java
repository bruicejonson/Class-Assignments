package com.tts.oop.Interface;

import java.time.Duration;
import java.time.LocalDate;

public interface Loanable {
    LocalDate dueDate = null;
    boolean isLoaned = false;

     public Duration getPastDue();
    public LocalDate getCheckout();

}
