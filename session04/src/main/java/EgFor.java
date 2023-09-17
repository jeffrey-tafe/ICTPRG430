
public class EgFor {

  public static void main(String args[]) {
    int num;

    // Standard increment by one
    System.out.println("Use for loop to output from 1 to 5 in increments of 1");
    for (num = 1; num <= 5; num++) {
      System.out.println("Num = " + num);
    }

    // Can increment by anything you want
    System.out.println("Use for loop to output from 0 to 100 in increments of 10");
    for (num = 0; num <= 100; num += 10) {
      System.out.println("Num = " + num);
    }

    // Can decrement as well but be sure to change the testing
    System.out.println("Use for loop to output from 50 downto 0 in decrements of 10");
    for (num = 50; num >= 0; num -= 10) {
      System.out.println("Num = " + num);
    }

    // Error. Comment this out and it demonstrates an infinite loop
    //        for (num = 1; num != 0; num += 3) {
    //            System.out.println("Num = " + num);
    //        }
  }
}
