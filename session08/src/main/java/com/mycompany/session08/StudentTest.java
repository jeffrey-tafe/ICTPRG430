/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.session08;

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

        Subject subject1 = new Subject("JAVA101", "Java Fundamentals");
        Subject subject2 = new Subject("PY101", "Python Fundamentals");
        Subject subject3 = new Subject("C#INT", "C# Intermediate");

        student1.setNumSubjects(2);
        student1.addSubject(subject1);
        student1.addSubject(subject2);
        student1.setAge(37);
        student1.setFirstName("Jeffrey");
        student1.setLastName("Smith");

        System.out.println("student1 ID: " + student1.getStudentID());
        System.out.println("student1 NumSubjects: " + student1.getNumSubjects());
        System.out.println("student1 Subjects: " + student1.getSubjects());
        System.out.println("student1 FirstName: " + student1.getFirstName());
        System.out.println("student1 LastName: " + student1.getLastName());
        System.out.println("student1 Age: " + student1.getAge());

        System.out.println("\nTesting ID only constructor - student2");
        Student student2 = new Student("1234");
        System.out.println(student2);

        System.out.println("\nTesting all constructor - student3");
        Student student3 = new Student("1001", "Jacinda", "Smith", 33, new Address(), 3);
        student3.addSubject(subject1);
        student3.addSubject(subject2);
        student3.addSubject(subject3);
        System.out.println(student3);
    }
}
