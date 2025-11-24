package com.vityarthi.models;

public class Resource {
    private String title;
    private String type;   // Book, Video, Notes, Link
    private String description;

    public Resource(String title, String type, String description) {
        this.title = title;
        this.type = type;
        this.description = description;
    }

    public String getTitle() { return title; }
    public String getType() { return type; }
    public String getDescription() { return description; }
}
