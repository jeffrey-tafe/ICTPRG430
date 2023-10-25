/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.session10;

/**
 *
 * @author jeffs
 */
public class PersonTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        System.out.println("\nTest no arg constructor - p1");
        Person p1 = new Person();
        System.out.println(p1);

        System.out.println("\nTest setters and getters - p1");
        p1.setFirstName("Jeff");
        p1.setLastName("Smith");
        p1.setAge(37);
        System.out.println("p1 FirstName: " + p1.getFirstName());
        System.out.println("p1 LastName: " + p1.getLastName());
        System.out.println("p1 Age: " + p1.getAge());
        System.out.println(p1);

        System.out.println("\nTest all arg constructor - p2");
        Person p2 = new Person("Jacinda", "Smith", 33);
        System.out.println(p2);

        System.out.println("\nTest names only arg constructor - p3");
        Person p3 = new Person("Alandra", "Smith");
        System.out.println(p3);
    }
}
