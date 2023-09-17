
import java.util.Scanner;

public class EgIf1 {

  public static Scanner kbd = new Scanner(System.in);

  public static void main(String[] args) {
    int num1 = 0;
    int num2 = 0;
    
    System.out.print("Enter first integer : ");
    num1 = kbd.nextInt();
    System.out.print("Enter second integer : ");
    num2 = kbd.nextInt();
    
    if(num1 > num2) {
      System.out.println(num1 + " is larger than " + num2);
    }
    if(num2 > num1) {
      System.out.println(num2 + " is larger than " + num1);
    }
    if(num1 == num2) {
      System.out.println(num1 + " equals " + num2);
    }
  }

}
