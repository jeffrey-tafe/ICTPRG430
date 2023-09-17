/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author jeffs
 */
public class Swap {

  /**
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    // TODO code application logic here

    double num1 = 10;
    double num2 = 22;
    double temp;

    System.out.println("Before swap : first = " + num1 + " second = " + num2);

    // Swap num1 and num2
    temp = num1; // temp = 10 Copy num1 to a temp variable so we can get it back later
    num1 = num2; // num1 = 22 Overwrite num1 with the value of num2
    num2 = temp; // num2 = 10 Put the original value of num1 that is stored in temp into num2
    System.out.printf("After swap: first = %.2f second = %.2f", num1, num2);
  }

}
