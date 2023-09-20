/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.session08;

/**
 *
 * @author jeffs
 */
import java.util.Scanner;

public class ArrayDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        //declare a constant for the MAX elements in the array
        final int MAX = 5;

        Scanner kbd = new Scanner(System.in);

        int marks[] = new int[MAX];

        // You can set the data for each element of the array using the index in the square brackets 
        // eg marks[0] is the zeroth element of the marks array
        marks[0] = 10;
        marks[1] = 11;
        marks[2] = 10;
        marks[3] = 10;
        marks[4] = 14;
        System.out.println("All marks have now been entered");
        // print out all the marks
        // The array now knows how much data it can take through the use of - array.length
        System.out.println("\nPrinting all the marks set in the code:");
        for (int i = 0; i < marks.length; i++) {
            System.out.print(marks[i] + " ");
        }

        //Now lets get the user to enter the marks
        //input students marks
        for (int i = 0; i < marks.length; i++) {
            System.out.println("Enter the students mark :");
            marks[i] = kbd.nextInt();
        }
        System.out.println("All marks have now been entered");
        // print out all the marks
        System.out.println("\nPrinting all the marks entered by the user:");
        for (int i = 0; i < marks.length; i++) {
            System.out.print(marks[i] + " ");
        }

    }

}
