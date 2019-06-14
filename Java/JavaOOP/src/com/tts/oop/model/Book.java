package com.tts.oop.model;

import com.tts.oop.Interface.Loanable;
import com.tts.oop.Interface.Reservable;

import java.time.Duration;
import java.time.LocalDate;

public class Book extends LibraryItem implements Loanable, Reservable {
        Author author;

    public Book(String name, String year, Author author, PublishingCompany publishingCompany) {
        super(name, year, publishingCompany);
        this.author = author;
    }
    //basically the due date for your book
    @Override
    public Duration getPastDue() {
        return Duration.between(dueDate,LocalDate.now());
    }
//the day you checked out a book
    @Override
    public LocalDate getCheckout() {
        return LocalDate.now();
    }

//days until a book is avaliable to be reserved
    @Override
    public int daysUntilAvailable() {
        return LocalDate.now().until(dayAvailable).getDays();
    }
}
