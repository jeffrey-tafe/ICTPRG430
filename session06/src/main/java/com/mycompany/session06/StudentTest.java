/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.session06;

/**
 *
 * @author jeffs
 */
public class StudentTest {

  public static void main(String[] args) {

    System.out.println("\nTesting no arg constructor - student1");
    Student student1 = new Student();
    System.out.println(student1);

    System.out.println("\nTesting setters and getters on student1");
    student1.setStudentID("1234");
    student1.setSubject(new Subject("JAVA101", "Java Fundamentals"));
    student1.setAge(37);
    student1.setFirstName("Jeffrey");
    student1.setLastName("Smith");

    System.out.println("student1 ID: " + student1.getStudentID());
    System.out.println("student1 Subject: " + student1.getSubject());
    System.out.println("student1 FirstName: " + student1.getFirstName());
    System.out.println("student1 LastName: " + student1.getLastName());
    System.out.println("student1 Age: " + student1.getAge());

    System.out.println("\nTesting ID only constructor - student2");
    Student student2 = new Student("1234");
    System.out.println(student2);

    System.out.println("\nTesting ID and subject object constructor - student3");
    Student student3 = new Student("1001", new Subject("PY101", "Python Fundamentals"));
    System.out.println(student3);

    System.out.println("\nTesting ID and subject details constructor - student4");
    Student student4 = new Student("1001", "C#INT", "C# Intermediate");
    System.out.println(student4);

    System.out.println("\nTesting ID, subject object, person details and Address object constructor - student5");
    Student student5 = new Student(
            "1001",
            new Subject("C#INT", "C# Intermediate"),
            "Ada",
            "Sansbury",
            87,
            new Address("30", "Tindall Road", "Enfield", "SA", "Australia", "5085")
    );
    System.out.println(student5);
  }
}
