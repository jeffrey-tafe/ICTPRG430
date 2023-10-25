/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.session10;

/**
 *
 * @author jeffs
 */
public class AddressTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        System.out.println("\nTest all-argument constructor - address1");
        Address address1 = new Address("77", "Sunset Boulevard", "Solaris", "7777");
        System.out.println(address1);

        System.out.println("\nTest no-argument constructor - address2");
        Address address2 = new Address();
        System.out.println(address2);

        System.out.println("\nTest setters and getters - address2");
        address2.setStreetNum("456");
        address2.setStreetName("Elm Street");
        address2.setPostCode("5432");
        address2.setSuburb("Elmland");

        System.out.println("Street Number: " + address2.getStreetNum());
        System.out.println("Street Name: " + address2.getStreetName());
        System.out.println("Postcode: " + address2.getPostCode());
        System.out.println("Suburb: " + address2.getSuburb());

        System.out.println("\nTest equals method");
        Address address3 = new Address("77", "Sunset Boulevard", "Solaris", "7777");
        System.out.println(address3);       
        System.out.println("Expected: false - Result: " + address1.equals(address2));
        System.out.println("Expected: true - Result: " + address1.equals(address3));

    }

}
