
import java.util.Scanner;

public class EgCompareLoops {

  public final static Scanner kbd = new Scanner(System.in);

  public static final int INITIAL_VALUE = 1;
  public static final int FINAL_VALUE = 5;

  public static void main(String[] args) {
    int i;

    System.out.println("Running the while loop...");
    i = INITIAL_VALUE;
    while (i <= FINAL_VALUE) {
      System.out.println(i);
      i++;
    }
    System.out.println("Final value of variable i = " + i);
    System.out.print("\nPress the enter key...");
    kbd.nextLine();

    System.out.println("Running the do-while loop...");
    i = INITIAL_VALUE;
    do {
      System.out.println(i);
      i++;
    } while (i <= FINAL_VALUE);
    System.out.println("Final value of variable i = " + i);
    System.out.print("\nPress the Enter key...");
    kbd.nextLine();

    System.out.println("Running the for loop...");
    for (i = INITIAL_VALUE; i <= FINAL_VALUE; i++) {
      System.out.println(i);
    }
    System.out.println("Final value of variable i = " + i);
    System.out.print("\nPress the Enter key...");
    kbd.nextLine();
  }
}
