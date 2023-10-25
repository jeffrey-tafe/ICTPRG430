/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.session10;

import java.util.Objects;

/**
 *
 * @author jeffs
 */
public class Book {

    // Constants
    public static final String DEF_ISBN = "NO ISBN SET";
    public static final int DEF_NUM_PAGES = 0;

    // Instance variables
    private String isbn;
    private int numPages;
    private Person author;

    // Constructors
    // All arg constructor
    public Book(String isbn, int numPages, String firstName, String surname, int age) {
        this.isbn = isbn;
        this.numPages = numPages;
        this.author = new Person(firstName, surname, age);
    }

    // Book details and author person object constructor
    public Book(String isbn, int numPages, Person author) {
        this.isbn = isbn;
        this.numPages = numPages;
        this.author = author;
    }

    // Book details only constructor
    public Book(String isbn, int numPages) {
        this.isbn = isbn;
        this.numPages = numPages;
        this.author = new Person();
    }

    // No args only constructor
    public Book() {
        this.isbn = DEF_ISBN;
        this.numPages = DEF_NUM_PAGES;
        this.author = new Person();
    }

    public String getIsbn() {
        return this.isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public int getNumPages() {
        return this.numPages;
    }

    public void setNumPages(int numPages) {
        this.numPages = numPages;
    }

    public Person getAuthor() {
        return this.author;
    }

    public void setAuthor(Person author) {
        this.author = author;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Book{");
        sb.append("isbn=");
        sb.append(isbn);
        sb.append(", numPages=");
        sb.append(numPages);
        sb.append(", author=");
        sb.append(author);
        sb.append('}');
        return sb.toString();
    }

    @Override
    public int hashCode() {
        int hash = 3;
        return hash;
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Book)) {
            return false;
        }

        Book other = (Book) o;
        return this.getIsbn().equals(other.getIsbn());
    }

}
