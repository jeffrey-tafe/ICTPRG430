/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.session05;

/**
 *
 * @author jeffs
 */
public class StudentTest {

  /**
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    // Test no arg constructor
    System.out.println("Testing No Arg Constructor student1");
    Student student1 = new Student();
    System.out.println("student1 " + student1);

    // Test setters and getters
    System.out.println("\nTesting setters and getters");
    student1.setStudentID("1001");
    Subject subject1 = new Subject("MATH101", "Mathematics");
    student1.setSubject(subject1);

    System.out.println("studentID = " + student1.getStudentID());
    System.out.println("subject = " + student1.getSubject());

    // Test one-arg constructor
    System.out.println("\nTesting One-Arg Constructor student2");
    Student student2 = new Student("2002");
    System.out.println("student2 " + student2);

    // Test two-arg constructor
    System.out.println("\nTesting Two-Arg Constructor student3");
    Student student3 = new Student("3003", "PHYS101", "Physics");
    System.out.println("student3 " + student3);
  }
}
