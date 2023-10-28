package com.mycompany.session09;


public class DogTest {

  /**
   * @param args the command line arguments
   */
  public static void main(String[] args) {

    // No Arg Constructor
    System.out.println("\nNo-arg Constructor dog1");
    Dog dog1 = new Dog();
    System.out.println("dog1 " + dog1);
    System.out.println("\nNumber of dogs = " + Dog.dogCount);

    // Test setters and getters using dog1
    System.out.println("\nTesting setters and getters on dog1");
    dog1.setID("D111");
    dog1.setSize(60);
    dog1.setBreed("Labrador");
    dog1.setName("Fritz");

    System.out.println("ID = " + dog1.getID());
    System.out.println("Size = " + dog1.getSize());
    System.out.println("Breed = " + dog1.getBreed());
    System.out.println("Name = " + dog1.getName());

    // All Arg Constructor
    System.out.println("\nAll-arg Constructor dog2");
    Dog dog2 = new Dog("D007", 25, "Terrier", "Ralf");
    System.out.println("dog2 " + dog2);
    System.out.println(dog2.bark());
    System.out.println("\nNumber of dogs = " + Dog.dogCount);
    
    // Testing new equals method
    System.out.println("\nTesting New Equials Methods");
    System.out.println("\nDog 3 created with no arg constructor");
    Dog dog3 = new Dog();
    System.out.println(dog3);
    System.out.println("\nNumber of dogs = " + Dog.dogCount);
    System.out.println("\nDog 4 created with no arg constructor");
    Dog dog4 = new Dog();
    System.out.println(dog4);
    System.out.println("\nNumber of dogs = " + Dog.dogCount);
    System.out.println("dog1 = dog3 (expect false): " + dog1.equals(dog3));
    System.out.println("dog4 = dog3 (expect true): " + dog4.equals(dog3));
    
    
  }

}
