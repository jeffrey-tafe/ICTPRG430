
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.InputMismatchException;
import java.util.Scanner;

public class ScannerTestWithErrorHandling {

  public static Scanner kbd = new Scanner(System.in);

  public static void main(String args[]) throws IOException {
    String testString;
    int testInt;
    float testFloat;
    double testDouble;
    char testChar;
    boolean inputError;

    // We are able to use the exception handling facilities in Java
    // to detect an error in the input
    do {
      System.out.print("Enter a float : ");
      try {
        testFloat = kbd.nextFloat();
        System.out.println("Your float = <" + testFloat + ">");
        inputError = false;
      } catch (InputMismatchException e) {
        System.out.println("Error in input - " + e + ". Line ignored.");
        kbd.nextLine();
        inputError = true;
      }
    } while (inputError);

    // Test double
    do {
      System.out.print("Enter a double : ");
      try {
        testDouble = kbd.nextDouble();
        System.out.println("Your double = <" + testDouble + ">");
        inputError = false;
      } catch (InputMismatchException e) {
        System.out.println("Error in input - " + e + ". Line ignored.");
        kbd.nextLine();
        inputError = true;
      }
    } while (inputError);
    
    // Test integer
    do {
      System.out.print("Enter an integer : ");
      try {
        testInt = kbd.nextInt();
        System.out.println("Your integer = <" + testInt + ">");
        inputError = false;
      } catch (InputMismatchException e) {
        System.out.println("Error in input - " + e + ". Line ignored.");
        kbd.nextLine();
        inputError = true;
      }
    } while (inputError);
  }
}
