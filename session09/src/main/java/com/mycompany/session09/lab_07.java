/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.session09;

/**
 *
 * @author jeffs
 */
public class lab_07 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        System.out.println("\nCreating array of numbers 1 to 100");
        int[] numbers = new int[100];
        for (int i = 1; i <= 100; i++) {
            numbers[i - 1] = i;
        }

        System.out.println("\nPrint array in reverse order");
        for (int i = numbers.length - 1; i >= 0; i--) {
            System.out.printf("%3d ", numbers[i]);
        }

        System.out.println("\n\nDisplay 10 numbers per line in reverse order print");
        for (int i = numbers.length - 1; i >= 0; i--) {
            if ((i + 1) % 10 == 0) {
                System.out.println();
            }
            System.out.printf("%3d ", numbers[i]);
        }

        System.out.println("\n\nPrint Even Numbers Only");
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 == 0) {
                System.out.print(i + " ");
            }
        }
        
        System.out.println("\n\nPrint Odd Numbers Only");
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 == 1) {
                System.out.print(i + " ");
            }
        }
    }

}
