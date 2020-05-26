package com.example.android.exploreromania.model;

public class Event {
    private String name;
    private String description;
    private Address address;
    private int imageResourceId;

    public Event(String name, String description, Address address, int imageResourceId) {
        this.name = name;
        this.description = description;
        this.address = address;
        this.imageResourceId = imageResourceId;
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

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public int getImageResourceId() {
        return imageResourceId;
    }
}
