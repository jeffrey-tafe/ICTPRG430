/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.session08;

/**
 *
 * @author jeffs
 */
public class BossTest {

  /**
   * @param args the command line arguments
   */
  public static void main(String[] args) {

    System.out.println("\nTest no arg constructor - b1");
    Boss b1 = new Boss();
    System.out.println(b1);

    System.out.println("\nTest setters and getters - b1");
    b1.setDepartmentName("Customer Service");
    System.out.println("b1 departmentName: " + b1.getDepartmentName());

    System.out.println("\nTest constructor with employee details, address and"
            + "department name");
    Address a1 = new Address(
            "15",
            "Carlton Crescent",
            "Pennington",
            "SA",
            "Australia",
            "5013");
    Boss b2 = new Boss(
            "Jeffrey",
            "Smith",
            37,
            a1,
            "09/09/2023",
            2000000.00,
            "Operations"
    );
    System.out.println(b2);
  }

}
