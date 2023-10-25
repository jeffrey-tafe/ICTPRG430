/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.session10;

/**
 *
 * @author jeffs
 */
public class BookTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        System.out.println("\nTestt all arg constructor - b0");
        Book b0 = new Book(
                "999888777",
                41,
                "Joane",
                "Smith",
                34);
        System.out.println(b0);

        System.out.println("\nTest no arg constructor - b1");
        Book b1 = new Book();
        System.out.println(b1);

        System.out.println("\nTest setters and getters - b1");
        b1.setAuthor(new Person("Jeffrey", "Smith", 37));
        b1.setIsbn("123456789");
        b1.setNumPages(123);
        System.out.println("ISBN: " + b1.getIsbn());
        System.out.println("Num Pages: " + b1.getNumPages());
        System.out.println("Author: " + b1.getAuthor());
        System.out.println(b1);

        System.out.println("\nTest Book details and author object constructor - b2");
        Person jacinda = new Person("Jacinda", "Smith", 33);
        Book b2 = new Book("789654123", 456, jacinda);
        System.out.println(b2);

        System.out.println("\nTest book details only constructor - b3");
        Book b3 = new Book("999888777", 41);
        System.out.println(b3);

        System.out.println("\nTest equals method");
        System.out.println("Expected: false - Result: " + b0.equals(b1));
        System.out.println("Expected: true - Result: " + b0.equals(b3));

    }

}
