/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.session06;

/**
 *
 * @author jeffs
 */
public class Employee extends Person {

  // Constants
  public static final String DEFAULT_DATE_HIRED = "00/00/00";
  public static final double DEFAULT_INCOME = 0;

  // Instance variables
  private String dateHired;
  private double weeklyIncome;

  // Constructors
  public Employee() {
    this(DEFAULT_DATE_HIRED, DEFAULT_INCOME);
  }

  public Employee(String dateHired, double weeklyIncome) {
    this(DEFAULT_FIRST_NAME, DEFAULT_LAST_NAME, DEFAULT_AGE, new Address(), dateHired, weeklyIncome);
  }

  public Employee(String firstName, String lastName, int age, Address address, String dateHired, double weeklyIncome) {
    super(firstName, lastName, age, address);
    this.dateHired = dateHired;
    this.weeklyIncome = weeklyIncome;
  }

  // Methods
  public String getDateHired() {
    return dateHired;
  }

  public void setDateHired(String dateHired) {
    this.dateHired = dateHired;
  }

  public double getWeeklyIncome() {
    return weeklyIncome;
  }

  public void setWeeklyIncome(double weeklyIncome) {
    this.weeklyIncome = weeklyIncome;
  }

  // toString method for debugging
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append(super.toString());
    sb.append("\n[");
    sb.append("\n\t");
    sb.append("dateHired: ");
    sb.append(this.dateHired);
    sb.append("\n\t");
    sb.append("weeklyIncome: ");
    sb.append(this.weeklyIncome);
    sb.append("\n]");
    return sb.toString();
  }

  public String describeRole() {
    return "Works for the company";
  }

}
