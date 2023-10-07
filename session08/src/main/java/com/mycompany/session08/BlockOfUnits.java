/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.session08;

/**
 *
 * @author jeffs
 */
/**
 * Implements a collections of Units (Apartments) This implementation uses
 * Aggregation. Units are always referred to via the unit number (eg 1A).
 *
 */
public class BlockOfUnits {

    public static final int DEF_NUM_UNITS = 5;
    private int numberOfUnits;    // The number of defined units in the block.
    // This goes up by one every time a unit is added.
    private Unit unit[];          // The array of units

    /*----------------------------------------------------------------------*/
    /**
     * Create a block of units of the DEFAULT size BUT containing NO units.
     * Units will need to be added to the block using the addUnit method
     *
     */
    public BlockOfUnits() {
        this(DEF_NUM_UNITS);
    }

    /**
     * Create a block of units of the provided size BUT containing NO units.
     * Units will need to be added to the block using the addUnit method
     *
     * @param maxNumberOfUnits - the number of units that can be added to the
     * block
     */
    public BlockOfUnits(int maxNumberOfUnits) {
        this.numberOfUnits = 0;
        this.unit = new Unit[maxNumberOfUnits];
    }

    /*----------------------------------------------------------------------*/
    /**
     * @return Returns the number of defined units in the block
     */
    public int getNumberOfUnits() {
        return this.numberOfUnits;
    }

    /*----------------------------------------------------------------------*/
    /**
     * Adds one unit to the block. Will not add the unit if there is no room
     * left in the block
     *
     * @param u - the unit to be added
     * @return none
     */
    public void addUnit(Unit u) {
        if (this.numberOfUnits < this.unit.length) {
            this.unit[this.numberOfUnits] = u;
            this.numberOfUnits++;
        }
    }

    /*----------------------------------------------------------------------*/
    /**
     * Records a unit as rented for a certain amount of weekly rent
     *
     * @param unitNumber - the unit number of the unit
     * @param rentAmount - the amount of the weekly rent
     */
    public void markAsRented(String unitNumber, double rentAmount) {
        int index;
        index = findUnit(unitNumber);
        if (index != -1) {
            this.unit[index].setRented(true);
            this.unit[index].setRentAmount(rentAmount);
        }
    }

    /*----------------------------------------------------------------------*/
    /**
     * Records a unit as NOT rented ie vacant
     *
     * @param unitNumber - the unit number of the unit
     */
    public void markAsVacant(String unitNumber) {
        int index;

        index = findUnit(unitNumber);
        if (index != -1) {
            this.unit[index].setRented(false);
        }
    }

    /*----------------------------------------------------------------------*/
    /**
     * Finds the unit with a particular unit number in the block of units
     *
     * @param unitNum - the unit number of the unit
     * @return the index in the array of units of the unit with unit number
     * unitNum will return -1 if there is no unit with number unitNum.
     */
    private int findUnit(String unitNum) {
        int foundAt;
        int index;

        foundAt = 0;
        while (foundAt < this.numberOfUnits
                && !(this.unit[foundAt].getUnitNumber().equals(unitNum))) {
            foundAt++;
        }
        if (foundAt < this.numberOfUnits) {
            index = foundAt;
        } else {
            index = -1;
        }
        return index;
    }

    /*----------------------------------------------------------------------*/
    /**
     * Find all vacant units in the block.
     *
     * @return an array if the empty units. The array will be empty if there are
     * no empty units.
     */
    public Unit[] findVacantUnits() {

        Unit[] freeUnits;
        int count;
        int i;

        freeUnits = new Unit[this.numFreeUnits()];

        count = 0;
        for (i = 0; i < this.numberOfUnits; i++) {
            if (!this.unit[i].isRented()) {
                freeUnits[count] = this.unit[i];
                count++;
            }
        }

        return freeUnits;
    }


    /*----------------------------------------------------------------------*/
    /**
     * Find the number of vacant units in the block.
     *
     * @return the count of empty (not rented)
     */
    public int numFreeUnits() {
        int i;
        int numFree;

        numFree = 0;
        for (i = 0; i < this.numberOfUnits; i++) {
            if (!this.unit[i].isRented()) {
                numFree++;
            }
        }
        return numFree;
    }

    /*----------------------------------------------------------------------*/

    public String toString() {
        String temp;
        temp = "[Block size=" + this.unit.length + ", Number Of Units=" + numberOfUnits;
        for (int i = 0; i < this.numberOfUnits; i++) {
            temp = temp
                    + ",unit[" + i + "]="
                    + "," + this.unit[i];
        }
        temp = temp + "]";
        return temp;
    }

}
