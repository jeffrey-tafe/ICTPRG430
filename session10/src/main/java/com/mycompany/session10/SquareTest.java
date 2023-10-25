/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.session10;

/**
 *
 * @author jeffs
 */
public class SquareTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        System.out.println("\nTest no arg constructor - sq1");
        Square sq1 = new Square();
        System.out.println(sq1);

        System.out.println("\nTest setters and getters - sq1");
        sq1.setLength(3);
        sq1.setWidth(3);
        System.out.println("sq1 Length: " + sq1.getLength());
        System.out.println("sq1 Width: " + sq1.getWidth());
        System.out.println(sq1);

        System.out.println("\nTest all arg constructor - sq2");
        Square sq2 = new Square(7);
        System.out.println(sq2);

        System.out.println("\ncalcArea method not implemented");

        System.out.println("\ncalcPerimeter not implemented");

        System.out.println("\nTest equals method - sq1, sq2, sq3");
        Square sq3 = new Square(3);
        System.out.println("Result: " + sq1.equals(sq2) + " - Expected: false");
        System.out.println("Result: " + sq1.equals(sq3) + " - Expected: true");
    }

}
