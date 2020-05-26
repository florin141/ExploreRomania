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

    public void setName(String name) {
        this.name = name;
    }

    public String getShortDescription() {
        int descriptionLength = description.length();

        if (descriptionLength > 280) {
            return description.substring(0, 280).concat("...");
        }

        return description;
    }

    public String getFullDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getImageResourceId() {
        return imageResourceId;
    }

    public void setImageResourceId(int imageResourceId) {
        this.imageResourceId = imageResourceId;
    }
}
