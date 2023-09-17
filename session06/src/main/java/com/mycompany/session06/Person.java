package com.mycompany.session06;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author jeffs
 */
public abstract class Person {

  // constants
  public static final String DEFAULT_FIRST_NAME = "NONE_PROVIDED";
  public static final String DEFAULT_LAST_NAME = "NONE_PROVIDED";
  public static final int DEFAULT_AGE = 0;

  // instance variables
  private String firstName;
  private String lastName;
  private int age;
  private Address address;

  // Constructors
  public Person() {
    this(DEFAULT_FIRST_NAME, DEFAULT_LAST_NAME, DEFAULT_AGE, new Address());
  }

  public Person(String firstName, String lastName, int age) {
    this(firstName, lastName, age, new Address());
  }

  public Person(String firstName, String lastName, int age, Address address) {
    this.firstName = firstName;
    this.lastName = lastName;
    this.age = age;
    this.address = address;
  }

  // getters
  public String getFirstName() {
    return this.firstName;
  }

  public String getLastName() {
    return this.lastName;
  }

  public int getAge() {
    return this.age;
  }

  //setters
  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  public void setAge(int age) {
    this.age = age;
  }

  // toString method for debugging
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append(super.toString());
    sb.append("\n[");
    sb.append("\n\t");
    sb.append("firstName: ");
    sb.append(this.firstName);
    sb.append("\n\t");
    sb.append("lastName: ");
    sb.append(this.lastName);
    sb.append("\n\t");
    sb.append("age: ");
    sb.append(this.age);
    sb.append("\n\t");
    sb.append("address: ");
    sb.append(this.address);
    sb.append("\n]");
    return sb.toString();
  }
  
  public abstract String describeRole();
}
