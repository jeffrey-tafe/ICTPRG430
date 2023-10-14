/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.session08;

/**
 *
 * @author jeffs
 */
public class Student extends Person {

// Constants
    public static final String DEFAULT_STUDENT_ID = "NOT DEFINED";
    public static final int DEF_NUM_SUBJECTS = 5;

    // Instance Variables
    private String studentID;
    private int numSubjects;
    // student "has a" array of subjects
    private Subject[] subjects;

    // Constructors
    public Student(
            String studentID,
            String firstName,
            String surname,
            int age,
            Address address,
            int maxSubjects
    ) {
        super(firstName, surname, age, address);
        this.studentID = studentID;
        this.subjects = new Subject[maxSubjects];
    }

    public Student(String studentID) {
        this(
                studentID,
                DEFAULT_FIRST_NAME,
                DEFAULT_LAST_NAME,
                DEFAULT_AGE,
                new Address(),
                DEF_NUM_SUBJECTS);
    }

    public Student() {
        this(DEFAULT_STUDENT_ID);
    }

    // Methods
    public String getStudentID() {
        return studentID;
    }

    public void setStudentID(String studentID) {
        this.studentID = studentID;
    }

    public int getNumSubjects() {
        return numSubjects;
    }

    public void setNumSubjects(int numSubjects) {
        this.numSubjects = numSubjects;
    }

    public void addSubject(Subject subject) {
        if (this.numSubjects < this.subjects.length) {
            this.subjects[this.numSubjects] = subject;
            this.numSubjects++;
        }
    }

    public String getSubjects() {
        StringBuilder sb = new StringBuilder();
        
        if(this.numSubjects < 1) {
            return "NO SUBJECTS";
        }
        
        for (int i = 0; i < numSubjects; i++) {
            sb.append(subjects[i]);
        }
        return sb.toString();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append("\n[");
        sb.append("\n\tstudentID: ");
        sb.append(this.studentID);
        sb.append("\n\tnumSubjects: ");
        sb.append(this.numSubjects);
        sb.append("\n\tsubjects: ");
        sb.append(this.getSubjects());
        sb.append("\n]");
        return sb.toString();
    }

    public String describeRole() {
        return "Student studies";
    }

}
