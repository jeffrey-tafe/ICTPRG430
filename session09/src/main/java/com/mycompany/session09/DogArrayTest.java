/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.session09;

/**
 *
 * @author jeffs
 */
public class DogArrayTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Dog[] myDogs = new Dog[3];  //declare an array of 3 dog references
        myDogs[0] = new Dog();
        myDogs[1] = new Dog("D001", 55, "Lab", "Butch");
        myDogs[2] = myDogs[0];  //set reference to myDogs[0]

        myDogs[2].setSize(80); //this will set the size for myDogs[0] as well 

        //loop through array to output each dog and call bark method
        for (int i = 0; i < myDogs.length; i++) {
            System.out.println(myDogs[i] + "\nbarks " + myDogs[i].bark());
        }

        // now create a new array of 10 dogs using the no-arg constructor 
        Dog[] dogArray = new Dog[10];
        for (int i = 0; i < dogArray.length; i++) {
            dogArray[i] = new Dog();
        }

        // output the array using a for loop
        for (int i = 0; i < myDogs.length; i++) {
            System.out.println(myDogs[i]);
        }

        // output the array using a for each loop
        for (Dog myDog : myDogs) {
            System.out.println(myDog);
        }
    }
}
