/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.session08;

/**
 *
 * @author jeffs
 */
public class Card {

    public static final String DEFAULT_SUIT = "none";
    public static final String DEFAULT_FACEVALUE = "none";

    private String suit;
    private String faceValue;

    public Card(String suit, String rank) {
        this.suit = suit;
        this.faceValue = rank;
    }

    public Card() {
        this(DEFAULT_SUIT, DEFAULT_FACEVALUE);
    }

    public String getSuit() {
        return this.suit;
    }

    public void setSuit(String suit) {
        this.suit = suit;
    }

    public String getFaceValue() {
        return this.faceValue;
    }

    public void setFaceValue(String faceValue) {
        this.faceValue = faceValue;
    }

    @Override
    public String toString() {
        return "[" + faceValue + " of " + suit + ']';
    }

}
