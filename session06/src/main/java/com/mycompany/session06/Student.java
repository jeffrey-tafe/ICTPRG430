/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.session06;

/**
 *
 * @author jeffs
 */
public class Student extends Person {

// Constants
  public static final String DEFAULT_STUDENT_ID = "NOT DEFINED";

  // Instance Variables
  private String studentID;
  private Subject subject;

  // Constructors
  public Student() {
    this(DEFAULT_STUDENT_ID);
  }

  public Student(String studentID) {
    this(studentID, new Subject());
  }

  public Student(String studentID, Subject subject) {
    this(studentID, subject, DEFAULT_FIRST_NAME, DEFAULT_LAST_NAME,
            DEFAULT_AGE, new Address());
  }

  public Student(String studentID, String subjectCode, String subjectName) {
    this(studentID, new Subject(subjectCode, subjectName));
  }

  public Student(String studentID, Subject subject, String firstName,
          String surname, int age, Address address) {
    super(firstName, surname, age, address);
    this.studentID = studentID;
    this.subject = subject;
  }

  // Methods
  public String getStudentID() {
    return studentID;
  }

  public void setStudentID(String studentID) {
    this.studentID = studentID;
  }

  public Subject getSubject() {
    return subject;
  }

  public void setSubject(Subject subject) {
    this.subject = subject;
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append(super.toString());
    sb.append("\n[");
    sb.append("\n\tstudentID: ");
    sb.append(this.studentID);
    sb.append("\n\tsubject: ");
    sb.append(this.subject);
    sb.append("\n]");
    return sb.toString();
  }

  public String describeRole() {
    return "Student studies";
  }

}
