/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.session09;

import java.util.Scanner;

/**
 *
 * @author jeffs
 */
public class lab_06 {
    
    public static Scanner kbd = new Scanner(System.in);

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int[] numbers = new int[5];
        
        System.out.println("You will be prompted for 5 numbers. Enter a number then press enter to submit for each.");
        
        for (int i = 0; i < numbers.length; i++) {
            System.out.print("Number " + (i + 1) + ": ");
            numbers[i] = kbd.nextInt();
        }
        
        for (int i = 0; i < numbers.length; i++) {
            System.out.println("Number " + (i + 1) + ": " + numbers[i]);
        }
        
    }
    
}
