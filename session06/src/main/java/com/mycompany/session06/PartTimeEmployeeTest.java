/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.session06;

/**
 *
 * @author jeffs
 */
public class PartTimeEmployeeTest {

  /**
   * @param args the command line arguments
   */
  public static void main(String[] args) {

    System.out.println("\nTest no arg constructor - p1");
    PartTimeEmployee p1 = new PartTimeEmployee();
    System.out.println(p1);

    System.out.println("\nTest setters and getters - p1");
    p1.setHoursPerWeek(30);
    System.out.println("p1 hoursPerWeek: " + p1.getHoursPerWeek());

    System.out.println("\nTest constructor with employee details, address, and "
            + "hours per week");
    Address a1 = new Address(
            "18",
            "Northgate Street",
            "Pennington",
            "SA",
            "Australia",
            "5013");
    PartTimeEmployee p2 = new PartTimeEmployee(
            "Howard",
            "Agius",
            37,
            a1,
            "09/09/2023",
            2000000.00,
            20
    );
    System.out.println(p2);
  }

}
