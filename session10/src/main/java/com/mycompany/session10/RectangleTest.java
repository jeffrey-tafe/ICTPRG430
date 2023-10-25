/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.session10;

/**
 *
 * @author jeffs
 */
public class RectangleTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        System.out.println("\nTest no arg constructor - rect1");
        Rectangle rect1 = new Rectangle();
        System.out.println(rect1);

        System.out.println("\nTest setters and getters - rect1");
        rect1.setLength(3);
        rect1.setWidth(5);
        System.out.println("rect1 Length: " + rect1.getLength());
        System.out.println("rect1 Width: " + rect1.getWidth());
        System.out.println(rect1);

        System.out.println("\nTest all arg constructor - rect2");
        Rectangle rect2 = new Rectangle(7, 8);
        System.out.println(rect2);

        System.out.println("\nTest calcArea method - rect2");
        System.out.println("Result: " + rect2.calcArea() + " - Expected: 56");

        System.out.println("\nTest calcPerimeter method - rect2");
        System.out.println("Result: " + rect2.calcPerimeter() + " - Expected: 30");

        System.out.println("\nTest equals method - rect1, rect2, rect3");
        Rectangle rect3 = new Rectangle(5, 3);
        System.out.println("Result: " + rect1.equals(rect2) + " - Expected: false");
        System.out.println("Result: " + rect1.equals(rect3) + " - Expected: true");
    }

}
