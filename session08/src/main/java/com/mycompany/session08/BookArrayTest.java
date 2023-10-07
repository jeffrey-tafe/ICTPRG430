/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.session08;

/**
 *
 * @author jeffs
 */
public class BookArrayTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        // Declare empty book array with 10 length
        Book[] myBooks = new Book[10];
        
        // Create books using no arg constructor in for loop
        for(int i = 0; i < myBooks.length; i++) {
            myBooks[i] = new Book();
        }
        
        // Use for each loop to print books
        for(Book book : myBooks) {
            System.out.println(book);
        }
    }
    
}
