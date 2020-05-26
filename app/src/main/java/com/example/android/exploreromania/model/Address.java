package com.example.android.exploreromania.model;

public class Address {
    private String addressLine;
    private City city;
    private String state;
    private Country country;

    public Address(String addressLine, City city, String state, Country country) {
        this.addressLine = addressLine;
        this.city = city;
        this.state = state;
        this.country = country;
    }

    public String getAddressLine() {
        return addressLine;
    }

    public void setAddressLine(String addressLine) {
        this.addressLine = addressLine;
    }

    public City getCity() {
        return city;
    }

    public void setCity(City city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public Country getCountry() {
        return country;
    }

    public void setCountry(Country country) {
        this.country = country;
    }
}
