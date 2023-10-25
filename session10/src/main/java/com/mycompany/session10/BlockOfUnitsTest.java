/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.session10;

/**
 *
 * @author jeffs
 */
public class BlockOfUnitsTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Test cases for the BlockOfUnits class

        System.out.println("\nTest all-argument constructor - block1");
        Address address1 = new Address("456", "Elm St", "Elmland", "5432");
        BlockOfUnits block1 = new BlockOfUnits(2000.0, "Residential", "John Doe", address1, 10);
        System.out.println(block1);

        System.out.println("\nTest number of units only constructor - block2");
        BlockOfUnits block2 = new BlockOfUnits(5);
        System.out.println(block2);

        System.out.println("\nTest no-argument constructor - block3");
        BlockOfUnits block3 = new BlockOfUnits();
        System.out.println(block3);

        System.out.println("\nTest setters and getters - block3");
        block3.setLandArea(1500.0);
        block3.setType("Commercial");
        block3.setOwner("Jane Smith");
        Address address2 = new Address("789", "Oak St", "Oakland", "8888");
        block3.setAddress(address2);
        block3.setNoOfUnits(8);

        System.out.println("Land Area: " + block3.getLandArea());
        System.out.println("Type: " + block3.getType());
        System.out.println("Owner: " + block3.getOwner());
        System.out.println("Address: " + block3.getAddress());
        System.out.println("Number of Units: " + block3.getNoOfUnits());
    }

}
