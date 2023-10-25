/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.session10;

/**
 *
 * @author jeffs
 */
public class DevelopedProperty {

    // Constants
    public static final double DEF_LAND_AREA = 1;
    public static final String DEF_PROPERTY_TYPE = "TYPE NOT SET";
    public static final String DEF_OWNER = "OWNER NOT SET";

    // Instance Variables
    private double landArea;
    private String type;
    private String owner;
    private Address address;

    // Constructors
    // All arg constructor
    public DevelopedProperty(
            double landArea,
            String type,
            String owner,
            String streetNumber,
            String streetName,
            String suburb,
            String postCode
    ) {
        this.landArea = landArea;
        this.type = type;
        this.owner = owner;
        this.address = new Address(streetNumber, streetName, suburb, postCode);
    }

    // Property details and address object constructor
    public DevelopedProperty(
            double landArea,
            String type,
            String owner,
            Address address) {
        this.landArea = landArea;
        this.type = type;
        this.owner = owner;
        this.address = address;
    }

    // Property land area and type only constructor
    public DevelopedProperty(
            double landArea,
            String type
    ) {
        this(landArea, type, DEF_OWNER, new Address());
    }

    // Land area only constructor
    public DevelopedProperty(double landArea) {
        this(landArea, DEF_PROPERTY_TYPE, DEF_OWNER, new Address());
    }

    // No arg constructor
    public DevelopedProperty() {
        this(DEF_LAND_AREA, DEF_PROPERTY_TYPE, DEF_OWNER, new Address());
    }

    public double getLandArea() {
        return this.landArea;
    }

    public void setLandArea(double landArea) {
        this.landArea = landArea;
    }

    public String getType() {
        return this.type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getOwner() {
        return this.owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public Address getAddress() {
        return this.address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append("\n{");
        sb.append("landArea=");
        sb.append(landArea);
        sb.append(", type=");
        sb.append(type);
        sb.append(", owner=");
        sb.append(owner);
        sb.append("\naddress=");
        sb.append(address);
        sb.append('}');
        return sb.toString();
    }

}
