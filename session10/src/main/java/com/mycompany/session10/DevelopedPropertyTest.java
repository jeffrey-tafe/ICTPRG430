/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.session10;

/**
 *
 * @author jeffs
 */
public class DevelopedPropertyTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Test cases for the DevelopedProperty class

        System.out.println("\nTest all-argument constructor - property1");
        DevelopedProperty property1 = new DevelopedProperty(
                1000.0, "Residential", "John Doe",
                "77", "Sunset Boulevard", "Solaris", "7777"
        );
        System.out.println(property1);

        System.out.println("\nTest property details and address object constructor - property2");
        Address customAddress = new Address("456", "Elm St", "Elmland", "5432");
        DevelopedProperty property2 = new DevelopedProperty(800.0, "Commercial", "Jane Smith", customAddress);
        System.out.println(property2);

        System.out.println("\nTest property land area and type only constructor - property3");
        DevelopedProperty property3 = new DevelopedProperty(1200.0, "Industrial");
        System.out.println(property3);

        System.out.println("\nTest land area only constructor - property4");
        DevelopedProperty property4 = new DevelopedProperty(600.0);
        System.out.println(property4);

        System.out.println("\nTest no-argument constructor - property5");
        DevelopedProperty property5 = new DevelopedProperty();
        System.out.println(property5);

        System.out.println("\nTest setters and getters - property5");
        property5.setLandArea(900.0);
        property5.setType("Mixed Use");
        property5.setOwner("Smith Family");

        Address anotherAddress = new Address("789", "Oak St", "Oakland", "8888");
        property5.setAddress(anotherAddress);

        System.out.println("Land Area: " + property5.getLandArea());
        System.out.println("Type: " + property5.getType());
        System.out.println("Owner: " + property5.getOwner());
        System.out.println("Address: " + property5.getAddress());
    }

}
