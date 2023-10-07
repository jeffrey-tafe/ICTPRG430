/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.session08;

/**
 *
 * @author jeffs
 */
public class BlockOfUnitsTest {

    /*----------------------------------------------------------------------*/
    public static void main(String args[]) {
        BlockOfUnits bou;
        Unit u1 = new Unit("1", 10, 100.00, 10.0);
        Unit u2 = new Unit("45A", 4, 123.45, 23.0);

        // Test no-arg constructor
        System.out.println("\nTest no-arg constructor");
        bou = new BlockOfUnits();
        System.out.println(bou);

        // Test all-arg constructor - block size 10
        System.out.println("\nTest all-arg constructor - block size 10");
        bou = new BlockOfUnits(10);
        System.out.println(bou);

        // Test adding two units
        System.out.println("\nTest adding two units");
        System.out.println("Unit 1 = " + u1);
        System.out.println("Unit 2 = " + u2);
        bou.addUnit(u1);
        bou.addUnit(u2);
        System.out.println(bou);

        // Test adding more than the number of units allowed in the block - try adding 3 units to a block of size 2
        System.out.println("\nTest adding more than the number of units allowed in the block - try adding 3 units to a block of size 2");
        bou = new BlockOfUnits(2);
        bou.addUnit(u1);
        bou.addUnit(u2);
        bou.addUnit(new Unit("2", 99, 900.00, 90.0));
        System.out.println(bou);

        // Test setting unit with number 45A to being rented at $200 per week
        System.out.println("\nTest setting unit with number 45A to being rented at $200 per week");
        bou.markAsRented("45A", 200);
        System.out.println(bou);

        // Test setting unit with number 45A to being vacant
        System.out.println("\nTest setting unit with number 45A to being vacant");
        bou.markAsVacant("45A");
        System.out.println(bou);

        // Test counting and finding vacant units. Should find 45A and 2 as vacant.
        System.out.println("\nTest counting and finding vacant units. Should find 45A and 2 as vacant.");
        bou = new BlockOfUnits(10);
        bou.addUnit(u1);
        bou.addUnit(u2);
        bou.addUnit(new Unit("2", 99, 900.00, 90.0));
        bou.markAsRented("1", 10);
        bou.markAsVacant("2");
        bou.markAsVacant("45A");
        Unit[] free;
        System.out.println("Number of free units = " + bou.numFreeUnits());
        
        
        bou.addUnit(new Unit("5", 23, 500.00, 100.0));
        bou.addUnit(new Unit("8", 3, 100.00, 100.0));
        
        free = bou.findVacantUnits();
        for (int i = 0; i < free.length; i++) {
            System.out.println("Unit vacant -> " + free[i]);
        }
        
    }
}
