package com.mycompany.session04;


public class Address {

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
    return super.toString()
            + " ["
            + "\n\tstreetNumber = " + this.streetNumber
            + "\n\tstreetName = " + this.streetName
            + "\n\tsuburb = " + this.suburb
            + "\n\tstate= " + this.state
            + "\n\tcountry= " + this.country
            + "\n\tpostCode= " + this.postCode
            + "\n\t]";
  }
  
  // equals
  @Override
  public boolean equals(Object o) {
    if(!(o instanceof Address)) {
      return false;
    }
    Address address = (Address) o;
    return address.getPostCode() == this.getPostCode() &&
            address.getStreetName() == this.getStreetName() &&
            address.getStreetNumber() == this.getStreetNumber();
  }
}
