package com.tts.oop.model;

public class Magazine extends Periodical {
    int numSold;
    public Magazine(String name, String year, PublishingCompany publishingCompany, int numArticles, int numSold) {
        super(name, year, publishingCompany, numArticles);
        this.numSold = numSold;
    }
}
