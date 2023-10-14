/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.session08;

/**
 *
 * @author jeffs
 */
public class Zoo {

  public static void main(String[] args) {
    System.out.println("Creating a Wolf");
    Wolf w1 = new Wolf();
    System.out.println("wolf " + w1.makeNoise());
    System.out.println("+++++++++++++++++++++");
    System.out.println("Creating a Cat");
    Cat c1 = new Cat();
    System.out.println("cat " + c1.makeNoise());
    System.out.println("+++++++++++++++++++++");
    // we cant create an Animal object or Canine or Feline 
    // as these are abstract classes
    // Animal a = new Animal();
    // however we can use polymorphism
    Animal w2 = new Wolf();
    System.out.println("wolf " + w2.makeNoise());

  }
}
