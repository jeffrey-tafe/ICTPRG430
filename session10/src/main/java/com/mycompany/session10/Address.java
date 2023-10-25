/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.session10;

import java.util.Objects;

/**
 *
 * @author jeffs
 */
public class Address {

    // Constants
    public static final String DEF_STREET_NUM = "NO STREET NUM";
    public static final String DEF_STREET_NAME = "NO STREET NUM";
    public static final String DEF_SUBURB = "NO STREET NUM";
    public static final String DEF_POSTCODE = "NO STREET NUM";

    // Instance variables
    private String streetNum;
    private String streetName;
    private String suburb;
    private String postCode;

    // Constructors
    public Address(
            String streetNum,
            String streetName,
            String suburb,
            String postCode
    ) {
        this.streetNum = streetNum;
        this.streetName = streetName;
        this.suburb = suburb;
        this.postCode = postCode;
    }

    public Address() {
        this(DEF_STREET_NUM, DEF_STREET_NAME, DEF_SUBURB, DEF_POSTCODE);
    }

    // Methods
    public String getStreetNum() {
        return this.streetNum;
    }

    public void setStreetNum(String streetNum) {
        this.streetNum = streetNum;
    }

    public String getStreetName() {
        return this.streetName;
    }

    public void setStreetName(String streetName) {
        this.streetName = streetName;
    }

    public String getSuburb() {
        return this.suburb;
    }

    public void setSuburb(String suburb) {
        this.suburb = suburb;
    }

    public String getPostCode() {
        return this.postCode;
    }

    public void setPostCode(String postCode) {
        this.postCode = postCode;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append("{");
        sb.append("streetNum=");
        sb.append(streetNum);
        sb.append(", streetName=");
        sb.append(streetName);
        sb.append(", suburb=");
        sb.append(suburb);
        sb.append(", postCode=");
        sb.append(postCode);
        sb.append('}');
        return sb.toString();
    }

    @Override
    public int hashCode() {
        int hash = 3;
        return hash;
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Address)) {
            return false;
        }

        Address other = (Address) o;
        return this.getStreetNum().equals(other.getStreetNum())
                && this.getStreetName().equals(other.getStreetName())
                && this.getPostCode().equals(other.getPostCode());
    }

}
