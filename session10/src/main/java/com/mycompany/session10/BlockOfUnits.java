/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.session10;

/**
 *
 * @author jeffs
 */
public class BlockOfUnits extends DevelopedProperty {

    // Constants
    public static final int DEF_NUMBER_UNITS = 0;

    // Instance Variables
    private int noOfUnits;

    // Constructors
    // All arg constructor
    public BlockOfUnits(double landArea, String type, String owner, Address address, int noOfUnits) {
        super(landArea, type, owner, address);
        this.noOfUnits = noOfUnits;
    }

    // Number of units only constructor
    public BlockOfUnits(int noOfUnits) {
        super();
        this.noOfUnits = noOfUnits;
    }

    // No arg constructor
    public BlockOfUnits() {
        this(DEF_NUMBER_UNITS);
    }

    public int getNoOfUnits() {
        return this.noOfUnits;
    }

    public void setNoOfUnits(int noOfUnits) {
        this.noOfUnits = noOfUnits;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append("\n{");
        sb.append("noOfUnits=");
        sb.append(noOfUnits);
        sb.append('}');
        return sb.toString();
    }

}
