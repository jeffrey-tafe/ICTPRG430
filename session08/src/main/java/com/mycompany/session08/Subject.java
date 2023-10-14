/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.session08;

/**
 *
 * @author jeffs
 */
public class Subject {

  // Constants
  public static final String DEFAULT_CODE = "DEFAULT CODE";
  public static final String DEFAULT_NAME = "DEFAULT NAME";

  // Instance Variables
  private String subjectCode;
  private String subjectName;

  // Constructors
  public Subject() {
    this(DEFAULT_CODE, DEFAULT_NAME);
  }

  public Subject(String subjectCode, String subjectName) {
    this.subjectCode = subjectCode;
    this.subjectName = subjectName;
  }

  // Getters and Setters
  public String getSubjectCode() {
    return subjectCode;
  }

  public void setSubjectCode(String subjectCode) {
    this.subjectCode = subjectCode;
  }

  public String getSubjectName() {
    return subjectName;
  }

  public void setSubjectName(String subjectName) {
    this.subjectName = subjectName;
  }

  // Methods
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append(super.toString());
    sb.append("\n[");
    sb.append("\n\tsubjectCode: ");
    sb.append(this.subjectCode);
    sb.append("\n\tsubjectName: ");
    sb.append(this.subjectName);
    sb.append("\n]");
    return sb.toString();
  }

}
