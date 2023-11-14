package com.mycompany.session13;

import java.io.Serializable;

public class Address implements Serializable {

    //constants
    public static final String DEFAULT_STREET_NUMBER = "NOT DEFINED";
    public static final String DEFAULT_STREET_NAME = "NOT DEFINED";
    public static final String DEFAULT_SUBURB = "NOT DEFINED";
    public static final String DEFAULT_STATE = "NOT DEFINED";
    public static final String DEFAULT_COUNTRY = "NOT DEFINED";
    public static final String DEFAULT_POST_CODE = "NOT DEFINED";

    // instance variables
    private String streetNumber;
    private String streetName;
    private String suburb;
    private String state;
    private String country;
    private String postCode;

    // all arg constructor
    public Address(
            String streetNumber,
            String streetName,
            String suburb,
            String state,
            String country,
            String postCode) {
        this.streetNumber = streetNumber;
        this.streetName = streetName;
        this.suburb = suburb;
        this.state = state;
        this.country = country;
        this.postCode = postCode;
    }

// no arg constructor
    public Address() {
        this(
                DEFAULT_STREET_NUMBER,
                DEFAULT_STREET_NAME,
                DEFAULT_SUBURB,
                DEFAULT_STATE,
                DEFAULT_COUNTRY,
                DEFAULT_POST_CODE
        );
    }

    // setters
    public void setStreetNumber(String streetNumber) {
        this.streetNumber = streetNumber;
    }

    public void setStreetName(String streetName) {
        this.streetName = streetName;
    }

    public void setSuburb(String suburb) {
        this.suburb = suburb;
    }

    public void setState(String state) {
        this.state = state;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public void setPostCode(String postCode) {
        this.postCode = postCode;
    }

    // getters
    public String getStreetNumber() {
        return this.streetNumber;
    }

    public String getStreetName() {
        return this.streetName;
    }

    public String getSuburb() {
        return this.suburb;
    }

    public String getState() {
        return this.state;
    }

    public String getCountry() {
        return this.country;
    }

    public String getPostCode() {
        return this.postCode;
    }

    // toString method for debugging
    @Override

    public String toString() {

        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append("\n[");
        sb.append("\n\t");
        sb.append("streetNumber: ");
        sb.append(this.streetNumber);
        sb.append("\n\t");
        sb.append("streetName: ");
        sb.append(this.streetName);
        sb.append("\n\t");
        sb.append("suburb: ");
        sb.append(this.suburb);
        sb.append("\n\t");
        sb.append("state: ");
        sb.append(this.state);
        sb.append("\n\t");
        sb.append("country: ");
        sb.append(this.country);
        sb.append("\n\t");
        sb.append("postCode: ");
        sb.append(this.postCode);
        sb.append("\n]");
        return sb.toString();
    }
}
