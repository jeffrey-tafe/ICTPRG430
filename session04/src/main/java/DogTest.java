
import java.util.Scanner;

public class DogTest {

  public final static Scanner kbd = new Scanner(System.in);

  public static void main(String[] args) {

    // No Arg Constructor
    System.out.println("\nNo-arg Constructor dog1");
    Dog dog1 = new Dog();
    System.out.println("dog1 " + dog1);

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

    // Force dog size > 0 and < 100
    System.out.println("Test while loop forcing size >0 and <100");
    System.out.println("\nInput size: ");
    int sizeInput = kbd.nextInt();

    while (sizeInput <= 0 || sizeInput >= 100) {
      System.out.print("Input size: ");;
      sizeInput = kbd.nextInt();
    }
    dog1.setSize(sizeInput);
    System.out.println(dog1);

    // Force dog size > 0 and < 100 dowhile
    System.out.println("Test dowhile loop forcing size >0 and <100");
    do {
      System.out.print("Input dog2 size: ");
      sizeInput = kbd.nextInt();
    } while (sizeInput <= 0 || sizeInput >= 100);
    dog2.setSize(sizeInput);
    System.out.println(dog2);

  }

}
