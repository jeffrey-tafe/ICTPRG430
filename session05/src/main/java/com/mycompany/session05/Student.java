/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.session05;

/**
 *
 * @author jeffs
 */
public class Student {

// Constants
  public static final String DEFAULT_STUDENT_ID = "NOT DEFINED";
  public static final Subject DEFAULT_SUBJECT = new Subject();

  // Instance Variables
  private String studentID;
  private Subject subject;

  // Constructors
  public Student(String studentID, Subject subject) {
    this.studentID = studentID;
    this.subject = subject;
  }

  public Student() {
    this(DEFAULT_STUDENT_ID, DEFAULT_SUBJECT);
  }

  public Student(String studentID) {
    this(studentID, DEFAULT_SUBJECT);
  }

  public Student(String studentID, String subjectCode, String subjectName) {
    this(studentID, new Subject(subjectCode, subjectName));
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

}
