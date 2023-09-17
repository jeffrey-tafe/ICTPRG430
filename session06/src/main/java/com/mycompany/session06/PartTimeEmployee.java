/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.session06;

/**
 *
 * @author jeffs
 */
public class PartTimeEmployee extends Employee {

  // Constants
  public static final int DEFAULT_HOURS_PER_WEEK = 0;

  // Instance variables
  private int hoursPerWeek;

  // Constructors
  public PartTimeEmployee() {
    this(DEFAULT_FIRST_NAME,
            DEFAULT_LAST_NAME,
            DEFAULT_AGE,
            new Address(),
            DEFAULT_DATE_HIRED,
            DEFAULT_INCOME,
            DEFAULT_HOURS_PER_WEEK
    );
  }

  public PartTimeEmployee(
          String firstName,
          String lastName,
          int age,
          Address address,
          String dateHired,
          double weeklyIncome,
          int hoursPerWeek
  ) {
    super(firstName, lastName, age, address, dateHired, weeklyIncome);
    this.hoursPerWeek = hoursPerWeek;
  }

  // Methods
  public int getHoursPerWeek() {
    return hoursPerWeek;
  }

  public void setHoursPerWeek(int hoursPerWeek) {
    this.hoursPerWeek = hoursPerWeek;
  }

  // toString method for debugging
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append(super.toString());
    sb.append("\n[");
    sb.append("\n\t");
    sb.append("hoursPerWeek: ");
    sb.append(this.hoursPerWeek);
    sb.append("\n]");
    return sb.toString();
  }

  public String describeRole() {
    return super.describeRole() + "Works part-time for the company";
  }

}
