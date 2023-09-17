/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.session06;

/**
 *
 * @author jeffs
 */
public class SubjectTest {

  /**
   * @param args the command line arguments
   */
  public static void main(String[] args) {

    // Test no arg constructor
    System.out.println("Testing No Arg Constructor subject1");
    Subject subject1 = new Subject();
    System.out.println("subject1 " + subject1);

    // Test setters and getters
    System.out.println("\nTesting setters and getters");
    subject1.setSubjectCode("MATH101");
    subject1.setSubjectName("Mathematics");
    System.out.println("subjectCode = " + subject1.getSubjectCode());
    System.out.println("subjectName = " + subject1.getSubjectName());

    // Test all arg constructor
    System.out.println("\nTesting All Arg Constructor subject2");
    Subject subject2 = new Subject("PHYS101", "Physics");
    System.out.println("subject2 " + subject2);

  }
}
