package com.orange.SocialSharing.models;

public class Address {
    private String country;
    private String city;
    private String zipCode;
    private String street;
    private int number;

    public Address(String country, String city, String zipCode, String street, int number) {
        this.country = country;
        this.city = city;
        this.zipCode = zipCode;
        this.street = street;
        this.number = number;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getZipCode() {
        return zipCode;
    }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }
}
