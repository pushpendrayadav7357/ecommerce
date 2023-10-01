package com.example.demo;

public class Address {
    private Integer id;
    private String name;
    private String landmark;
    private String phoneNumber;
    private String zipcode;
    private String state;

    // Constructors
    public Address() {
    }

    public Address(String name, String landmark, String phoneNumber, String zipcode, String state) {
        this.name = name;
        this.landmark = landmark;
        this.phoneNumber = phoneNumber;
        this.zipcode = zipcode;
        this.state = state;
    }

    // Getters and Setters
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLandmark() {
        return landmark;
    }

    public void setLandmark(String landmark) {
        this.landmark = landmark;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getZipcode() {
        return zipcode;
    }

    public void setZipcode(String zipcode) {
        this.zipcode = zipcode;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }
}
