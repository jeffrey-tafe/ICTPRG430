/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.session10;

/**
 *
 * @author jeffs
 */
public class Square extends Rectangle {

    // all arg constructor
    public Square(int length) {
        super(length, length);
    }

    // no arg constructor
    public Square() {
        super(DEFAULT_LENGTH, DEFAULT_LENGTH);
    }
    
    // Getters, setters, toString and equals all inherited
}
