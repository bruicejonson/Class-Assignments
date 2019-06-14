package com.tts.oop.model;

import com.tts.oop.Interface.Loanable;
import com.tts.oop.Interface.Reservable;

import java.time.Duration;
import java.time.LocalDate;

public class Periodical extends LibraryItem implements Loanable, Reservable {
    String month;
    int numArticles;
    public Periodical(String name, String year, PublishingCompany publishingCompany, int numArticles) {
        super(name, year, publishingCompany);
        this.month = month;
        this.numArticles = numArticles;

    }

    @Override
    public Duration getPastDue() {
        return Duration.between(dueDate,LocalDate.now());
    }

    @Override
    public LocalDate getCheckout() {
        return LocalDate.now();
    }

    @Override
    public int daysUntilAvailable() {
        return LocalDate.now().until(dayAvailable).getDays();
    }
}
