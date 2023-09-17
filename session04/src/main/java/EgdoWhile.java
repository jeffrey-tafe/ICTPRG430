
import java.util.Scanner;

class EgdoWhile {

  /*
* Example of using post-test loop. This program extracts each digit 
* of the number entered and outputs the digits in reverse order
   */
  public final static Scanner kbd = new Scanner(System.in);

  public static void main(String args[]) {
    int num, digit;

    System.out.print("Enter an integer  >");
    num = kbd.nextInt();
    do {
      digit = num % 10;
      num /= 10;
      System.out.print(digit);
    } while (num != 0);
    System.out.println("");
  }
}
