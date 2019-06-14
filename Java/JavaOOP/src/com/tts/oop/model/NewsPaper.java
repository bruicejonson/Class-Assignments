package com.tts.oop.model;

public class NewsPaper extends Periodical {
    String targetAudience;
    public NewsPaper(String name, String year, PublishingCompany publishingCompany, String targetAudience, int numArticles) {
        super(name, year, publishingCompany, numArticles);
        this.targetAudience = targetAudience;
    }
}
