/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
import java.util.Scanner;
/**
 *
 * @author jeffs
 */
public class lab_08 {

    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        // Write a program that will allow the user to insert a number supplied
        // by the user into a position also supplied by the user into an
        // integer array of max size 10. 
        
        Scanner kbd = new Scanner(System.in);
        
        // Create initial array
        int[] numArray = new int[10];
        for (int i = 0; i < numArray.length; i++) {
            numArray[i] = i + 1;
        }
        
        // Print initial array
        System.out.println("Initial Array:");
        for(int i = 0; i < numArray.length; i++) {
            System.out.printf("%2d ", numArray[i]);
        }
        
        // Prompt user for input
        System.out.print("\n\nEnter index between 1 and 10: ");
        int index = kbd.nextInt();
        
        System.out.print("\nEnter new number value: ");
        int value = kbd.nextInt();
        
        // Update array value and print
        numArray[index] = value;
        System.out.println("\nUpdated Array:");
        for(int i = 0; i < numArray.length; i++) {
            System.out.printf("%2d ", numArray[i]);
        }
        
    }

}
