/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.session08;

/**
 *
 * @author jeffs
 */
public class Boss extends Employee {

  // Constants
  public static final String DEFAULT_DEPARTMENT_NAME = "NOT SET";

  // Instance Variables
  private String departmentName;

  // Constructors
  public Boss() {
    this(DEFAULT_FIRST_NAME,
            DEFAULT_LAST_NAME,
            DEFAULT_AGE,
            new Address(),
            DEFAULT_DATE_HIRED,
            DEFAULT_INCOME,
            DEFAULT_DEPARTMENT_NAME);
  }

  public Boss(String firstName,
          String lastName,
          int age,
          Address address,
          String dateHired,
          double weeklyIncome,
          String departmentName) {
    super(firstName, lastName, age, address, dateHired, weeklyIncome);
    this.departmentName = departmentName;
  }

  // Methods
  public String getDepartmentName() {
    return departmentName;
  }

  public void setDepartmentName(String departmentName) {
    this.departmentName = departmentName;
  }

  // toString method for debugging
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append(super.toString());
    sb.append("\n[");
    sb.append("\n\t");
    sb.append("departnmentName: ");
    sb.append(this.departmentName);
    sb.append("\n]");
    return sb.toString();
  }

  public String describeRole() {
    return super.describeRole() + "Works for the company as the Boss";
  }

}
