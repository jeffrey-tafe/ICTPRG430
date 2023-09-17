
import java.util.Scanner;

public class EgSwitch2 {

  public static Scanner kbd = new Scanner(System.in);

  public static void main(String[] args) {
    int num = 0;

    System.out.println("Enter a number (1-4) : ");
    num = kbd.nextInt();

    switch (num) {
      case 1:
        System.out.println("One\n");
        break;
      case 2:
        System.out.println("Two\n");
        break;
      case 3:
        System.out.println("Three\n");
        break;
      case 4:
        System.out.println("Four\n");
        break;
      default:
        System.out.println("default\n");
        break;
    }
    System.out.println("End of Switch");

    // Equivalent nested if
    if (num == 1) {
      System.out.println("One\n");
    } else {
      if (num == 2) {
        System.out.println("Two\n");
      } else {
        if (num == 3) {
          System.out.println("Three\n");
        } else {
          if (num == 4) {
            System.out.println("Four\n");
          } else {
            System.out.println("default\n");
          }
        }
      }
    }
    System.out.println("End of Nested if");
  }
}
