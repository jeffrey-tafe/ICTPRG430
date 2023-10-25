/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.session10;

/**
 *
 * @author jeffs
 */
public class Person {

    // Constants
    public static final String DEFAULT_FIRST_NAME = "NO FIRST NAME";
    public static final String DEFAULT_LAST_NAME = "NO LAST NAME";
    private static final int DEFAULT_AGE = 0;

    // Instance variables
    private String firstName;
    private String lastName;
    private int age;

    // All arg constructor
    Person(
            String firstName,
            String lastName,
            int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    // Name only constructor
    Person(
            String firstName,
            String lastName) {
        this(firstName, lastName, DEFAULT_AGE);
    }

    // No arg constructor
    Person() {
        this(DEFAULT_FIRST_NAME, DEFAULT_LAST_NAME);
    }

    public String getFirstName() {
        return this.firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return this.lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return this.age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append("\n{");
        sb.append("\nfirstName: ");
        sb.append(firstName);
        sb.append("\nlastName: ");
        sb.append(lastName);
        sb.append("\nage: ").append(age);
        sb.append("\n}");
        return sb.toString();
    }

}
