package com.mycompany.session06;

import java.util.Scanner;

/**
 *
 * @author jeffs
 */
public class TestInheritance {

  /**
   * @param args the command line arguments
   */
  public static void main(String[] args) {

    Scanner kbd = new Scanner(System.in);
    int guess;
    Person p = null;

    do {
      System.out.print("Choose 0 to end\n1 for "
              + "Emp \n2 for PTEmp \n3 for Boss \n4 for Student:");

      guess = kbd.nextInt();

      switch (guess) {
        case 1: //this will add the dateHired and weeklyIncome as well as Person 
          p = new Employee();
          break;
        case 2: //this will add hrsPerWeek as well as Employee details
          p = new PartTimeEmployee();
          break;
        case 3: //this will add deptName as well as Employee details
          p = new Boss();
          break;
        case 4: //this will add studID as well as Person details
          p = new Student();
          break;
      }
      System.out.println("person = " + p.toString());
      System.out.println("Role " + p.describeRole());

    } while (guess != 0);
  }
}
