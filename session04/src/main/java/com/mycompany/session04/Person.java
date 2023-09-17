package com.mycompany.session04;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author jeffs
 */
public class Person {

  // constants
  public static final String DEFAULT_FIRST_NAME = "NONE_PROVIDED";
  public static final String DEFAULT_LAST_NAME = "NONE_PROVIDED";
  public static final int DEFAULT_AGE = -1;

  // instance variables
  private String firstName;
  private String lastName;
  private int age;

  // all arg constructor
  public Person(String firstName, String lastName, int age) {
    this.firstName = firstName;
    this.lastName = lastName;
    this.age = age;
  }

  // no arg constructor
  public Person() {
    this(DEFAULT_FIRST_NAME, DEFAULT_LAST_NAME, DEFAULT_AGE);
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
    return super.toString()
            + "["
            + "\n\tFirst Name = " + this.firstName
            + "\n\tLast Name = " + this.lastName
            + "\n\tAge = " + this.age
            + "\n\t]";
  }

  @Override
  public boolean equals(Object o) {
    if (!(o instanceof Person)) {
      return false;
    }
    Person person = (Person) o;
    return person.getFirstName() == this.getFirstName()
            && person.getLastName() == this.getLastName();

  }
}
