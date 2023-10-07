package com.mycompany.session08;


public class Book {

  // constants
  public static final String DEFAULT_ISBN = "Not Provided";
  public static final int DEFAULT_NUM_PAGES = -1;

  // instance variables
  private String isbn;
  private int numPages;
  private Person author;
  
  // all arg constructor
  public Book(String isbn, int numPages, Person author) {
    this.isbn = isbn;
    this.numPages = numPages;
    this.author = author;
  }

// two arg constructor
  public Book(String isbn, int numPages) {
    this(isbn, numPages, new Person());
  }

  // no arg constuctor
  public Book() {
    this(DEFAULT_ISBN, DEFAULT_NUM_PAGES, new Person());
  }
  
  // Constructor with author details
  public Book(String isbn, int numPages, String firstName, String surname, int age) {
    this(isbn, numPages, new Person(firstName, surname, age));
  }

  public Person getAuthor() {
    return author;
  }

  public void setAuthor(Person author) {
    this.author = author;
  }

  // setters
  public void setIsbn(String isbn) {
    this.isbn = isbn;
  }

  public void setNumPages(int numPages) {
    this.numPages = numPages;
  }

  // getters
  public String getIsbn() {
    return this.isbn;
  }

  public int getNumPages() {
    return this.numPages;
  }

  // toString method for debugging
  @Override
  public String toString() {
    return super.toString()
            + " ["
            + "\n\tISBN = " + this.isbn
            + "\n\tNumPages = " + this.numPages
            + "\n\tAuthor = " + this.author
            + "\n\t]";
  }
}
