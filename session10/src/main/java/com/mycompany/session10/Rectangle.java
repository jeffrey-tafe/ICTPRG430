package com.mycompany.session10;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author jeffs
 */
public class Rectangle {

    // constants
    public static final int DEFAULT_WIDTH = 1;
    public static final int DEFAULT_LENGTH = 1;

    // instance variables
    private int width;
    private int length;

    // all arg constructor
    public Rectangle(int width, int length) {
        this.width = width;
        this.length = length;
    }

    // no arg constructor
    public Rectangle() {
        this(DEFAULT_WIDTH, DEFAULT_LENGTH);
    }

    // Methods
    public int getWidth() {
        return this.width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getLength() {
        return this.length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int calcArea() {
        return this.width * this.length;
    }

    public int calcPerimeter() {
        return 2 * (this.width + this.length);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append("\n{");
        sb.append("\n\twidth: ");
        sb.append(width);
        sb.append("\n\tlength: ");
        sb.append(length);
        sb.append("\n}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Rectangle)) {
            return false;
        }

        Rectangle rect = (Rectangle) o;
        return rect.getLength() == this.getLength()
                && rect.getWidth() == this.getWidth();
        
    }
}
