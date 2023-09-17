package com.mycompany.session04;

public class Unit {

  // Constants
  public static final String DEFAULT_UNIT_NUMBER = "XX";
  public static final int DEFAULT_NUMBER_OF_ROOMS = 0;
  public static final double DEFAULT_RENT_AMOUNT = 0.0;
  public static final double DEFAULT_MAINTENANCE_COST = 0.0;

  // Instance variables
  private String unitNumber;
  private int numberOfRooms;
  private double rentAmount;
  private double maintenanceCost;

  // All arg constructor
  public Unit(String unitNumber, int numberOfRooms, double rentAmount, double maintenanceCost) {
    this.unitNumber = unitNumber;
    this.numberOfRooms = numberOfRooms;
    this.rentAmount = rentAmount;
    this.maintenanceCost = maintenanceCost;
  }

  // No arg constructor
  public Unit() {
    this(DEFAULT_UNIT_NUMBER, DEFAULT_NUMBER_OF_ROOMS, DEFAULT_RENT_AMOUNT, DEFAULT_MAINTENANCE_COST);
  }

  // Setters
  public void setUnitNumber(String unitNumber) {
    this.unitNumber = unitNumber;
  }

  public void setNumberOfRooms(int numberOfRooms) {
    this.numberOfRooms = numberOfRooms;
  }

  public void setRentAmount(double rentAmount) {
    this.rentAmount = rentAmount;
  }

  public void setMaintenanceCost(double maintenanceCost) {
    this.maintenanceCost = maintenanceCost;
  }

  // Getters
  public String getUnitNumber() {
    return this.unitNumber;
  }

  public int getNumberOfRooms() {
    return this.numberOfRooms;
  }

  public double getRentAmount() {
    return this.rentAmount;
  }

  public double getMaintenanceCost() {
    return this.maintenanceCost;
  }

  // toString method for debugging
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append(super.toString());
    sb.append("\n[");
    sb.append("\nUnit Number: ");
    sb.append(this.unitNumber);
    sb.append("\nNumber of Rooms: ");
    sb.append(this.numberOfRooms);
    sb.append("\nRent amount: ");
    sb.append(this.rentAmount);
    sb.append("\nMaintenance Cost: ");
    sb.append(this.maintenanceCost);
    sb.append("\n]");
    return sb.toString();
  }

  @Override
  public boolean equals(Object o) {
    if (!(o instanceof Unit)) {
      return false;
    }
    Unit unit = (Unit) o;
    return unit.getUnitNumber().equals(this.getUnitNumber());
  }
}
