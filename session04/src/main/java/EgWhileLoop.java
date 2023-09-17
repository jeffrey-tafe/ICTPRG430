
import java.util.*;

class EgWhileLoop {

  /*
*  Example of program using while statements and printf
*  to output a sum of numbers. Enter 0 to stop processing
*  Typical while loop layout
   */

  public final static Scanner kbd = new Scanner(System.in);

  public static void main(String args[]) {
    float num;
    float sum = 0;

    System.out.print("Enter number (or 0 to quit) >");
    num = kbd.nextFloat();
    while (num != 0) {
      sum += num;
      System.out.print("Enter number (or 0 to quit) >");
      num = kbd.nextFloat();
    }
    System.out.printf(" Sum = %f\n", sum);
    System.out.printf(" Sum = %.2f\n", sum);
    System.out.printf(" Sum = %20.2f\n", sum);
  }
}
