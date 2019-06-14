package com.tts.oop.model;

public class LibraryItem {
    String name;
    String year;
    PublishingCompany publishingCompany;
    public LibraryItem(String name, String year, PublishingCompany publishingCompany){
        this.name = name;
        this.year = year;
        this.publishingCompany = publishingCompany;
    }
}
