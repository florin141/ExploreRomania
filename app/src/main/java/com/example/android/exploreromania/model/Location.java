package com.example.android.exploreromania.model;

import androidx.annotation.NonNull;

public class Location {
    private String city;
    private Country country;

    public Location(Country country) {
        this.city = "";
        this.country = country;
    }

    public Location(String city, Country country) {
        this.city = city;
        this.country = country;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCountryName() {
        return country.getName();
    }

    @NonNull
    @Override
    public String toString() {
        return city.isEmpty() ? getCountryName() : this.city + ", " + this.getCountryName();
    }
}
