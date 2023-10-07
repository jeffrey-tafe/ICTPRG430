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
        marks[2] = 12;
        marks[3] = 10;
        marks[4] = 14;
        System.out.println("All marks have now been entered");
        // print out all the marks
        // The array now knows how much data it can take through the use of - array.length
        System.out.println("\nPrinting all the marks set in the code: ");
        for (int i = 0; i < marks.length; i++) {
            System.out.print(marks[i] + " ");
        }

        //Now lets get the user to enter the marks
        //input students marks
//        for (int i = 0; i < marks.length; i++) {
//            System.out.println("\n\nEnter the students mark :");
//            marks[i] = kbd.nextInt();
//        }
//        System.out.println("\n\nAll marks have now been entered");
//        // print out all the marks
//        System.out.println("\nPrinting all the marks entered by the user:");
//        for (int i = 0; i < marks.length; i++) {
//            System.out.print(marks[i] + " ");
//        }
        // GET AVERAGE
        int total = 0;
        float average = 0.0F;

        // calc average
        // first calculate total
        for (int i = 0; i < marks.length; i++) {
            total += marks[i];
        }

        average = (float) total / marks.length; // Need to typecase otherwise int division
        System.out.println("\nThe average of all marks is: " + average);

        // GET MAX
        int index = 0;
        int maxMark = 0;
        int maxMarkIndex = 0;

        // search through all the marks to find the maximum mark and the student that got the max score
        maxMark = marks[0]; // set max score to first mark
        maxMarkIndex = 0; //set maxMarkIndex to first student mark

        // start search from second element
        for (index = 1; index < 5; index++) {
            if (marks[index] > maxMark) {
                maxMark = marks[index];
                maxMarkIndex = index;
            } //endif
        } //endfor
        System.out.println("\nStudent " + maxMarkIndex + " achieved the highest score of " + maxMark);

    }

}
