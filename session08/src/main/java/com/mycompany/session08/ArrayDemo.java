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

//      options to declare and create the array
//      declare variable first
//      int marks[];
//      then create array
//      marks = new int[MAX];
//      then set the value (mark in this case) of each element
//
//      or declare the variable and create the array all in one line
//      int marks[] = new int[MAX];
//
//      or you can put the square brackets after the datatype
//      int[] marks = new int[MAX];
//
//      or 
//      declare variable and define size by defining the data, everything is happening at once here
//      including the size of the array through the number of data items given (5 in this case)
//      int[] marks= {10,11,10,10,12};
        
        //Lets do it this way
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

    }

}
