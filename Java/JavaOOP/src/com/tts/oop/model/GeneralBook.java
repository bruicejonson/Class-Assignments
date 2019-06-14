package com.tts.oop.model;

public class GeneralBook extends Book {
    String genre;
    public GeneralBook(String name, String year, Author author,String genre, PublishingCompany publishingCompany) {
        super(name, year, author, publishingCompany);
        this.genre = genre;
    }
}
