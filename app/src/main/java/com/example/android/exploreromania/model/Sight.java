package com.example.android.exploreromania.model;

public class Sight {
    private String name;
    private String description;
    private float rating;
    private Location location;
    private SightType type;
    private int imageResourceId;

    public Sight(String name, String description, SightType type, float rating, int imageResourceId) {
        this.name = name;
        this.description = description;
        this.type = type;
        this.rating = rating;
        this.imageResourceId = imageResourceId;
    }

    public Sight(String name, String description, SightType type, float rating, Location location, int imageResourceId) {
        this(name, description, type, rating, imageResourceId);
        this.location = location;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public float getRating() {
        return rating;
    }

    public void setRating(float rating) {
        this.rating = rating;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public int getImageResourceId() {
        return imageResourceId;
    }

    public SightType getType() {
        return type;
    }

    public void setType(SightType type) {
        this.type = type;
    }
}
