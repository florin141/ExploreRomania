package com.example.android.exploreromania.model;

public class City {
    private String name;
    private String description;
    private int imageResourceId;

    public City(String name, String description, int imageResourceId) {
        this.name = name;
        this.description = description;
        this.imageResourceId = imageResourceId;
    }

    public String getName() {
        return name;
    }

    public String getShortDescription() {
        int descriptionLength = description.length();

        if (descriptionLength > 350) {
            return description.substring(0, 350).concat("...");
        }

        return description;
    }

    public int getImageResourceId() {
        return imageResourceId;
    }

}
