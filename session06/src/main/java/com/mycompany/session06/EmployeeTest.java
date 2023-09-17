/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.session06;

/**
 *
 * @author jeffs
 */
public class EmployeeTest {

  /**
   * @param args the command line arguments
   */
  public static void main(String[] args) {

    System.out.println("\nTest no arg constructor - e1");
    Employee e1 = new Employee();
    System.out.println(e1);

    System.out.println("\nTest setters and getters - e1");
    e1.setDateHired("09/09/2023");
    e1.setWeeklyIncome(123123.32);
    System.out.println("e1 dateHired: " + e1.getDateHired());
    System.out.println("e1 setWeeklyIncome: " + e1.getWeeklyIncome());
    System.out.println(e1);

    System.out.println("\nTest constructor with dateHired"
            + " and weeklyIncome - e2");
    Employee e2 = new Employee("08/09/2023", 654456.45);
    System.out.println(e2);

    System.out.println("\nTest constructor with person details, "
            + "address object, dateHired and weeklyIncome - e3");
    Address a1 = new Address(
            "15",
            "Carlton Crescent",
            "Pennington",
            "SA",
            "Australia",
            "5013");
    Employee e3 = new Employee(
            "Jeffrey",
            "Smith",
            37,
            a1,
            "09/09/2023",
            2000000.00
    );
    System.out.println(e3);

  }

}
