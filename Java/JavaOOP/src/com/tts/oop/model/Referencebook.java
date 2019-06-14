package com.tts.oop.model;

public class Referencebook extends Book {
    String referenceSubject;
    public Referencebook(String name, String year, String referenceSubject, Author author, PublishingCompany publishingCompany) {
        super(name, year, author, publishingCompany);
        this.referenceSubject = referenceSubject;
    }
}
