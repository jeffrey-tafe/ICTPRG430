
import java.util.Scanner;

public class EgSwitch1 {

  public static Scanner kbd = new Scanner(System.in);

  public static void main(String[] args) {
    char choice = ' ';
    System.out.print("Enter your option (P,B, or S):");
    choice = kbd.next().charAt(0);
    choice = Character.toUpperCase(choice);
    switch (choice) {
      case 'P':
        System.out.println("Option P\n");
        break;
      case 'B':
        System.out.println("Option B\n");
        break;
      case 'S':
        System.out.println("Option S\n");
        break;
      default:
        System.out.println("Invalid option\n");
        break;
    }
  }
}
