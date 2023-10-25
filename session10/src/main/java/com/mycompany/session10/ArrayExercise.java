/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.session10;

/**
 *
 * @author jeffs
 */
public class ArrayExercise {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int[] numArray = {9,7,2,5,1,2,8,5,9,4};
        
        System.out.println("All numbers in array");
        for(int number : numArray) {
            System.out.print(number + " ");
        }
        
        System.out.println("\n\nNumbers 5 or under in array");
        for(int number : numArray) {
            if(number <= 5) {
                System.out.print(number + " ");
            }
        }
    }
    
}
