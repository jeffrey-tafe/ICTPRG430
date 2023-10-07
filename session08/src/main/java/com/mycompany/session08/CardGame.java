/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.session08;

/**
 *
 * @author jeffs
 */
public class CardGame {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        String[] suits = new String[4];
        suits[0] = "Clubs";
        suits[1] = "Diamonds";
        suits[2] = "Hearts";
        suits[3] = "Spades";

        String[] faceValues = {"Ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King"};

        //  create a deck of cards as an array of card objects      
        Card[] deck = new Card[52];

        // Set suit and faceValue via for each loop
        int index = 0;
        for (String suit : suits) {
            for (String faceValue : faceValues) {
                deck[index] = new Card(suit, faceValue);
                index++;
            }
        }

        // Print deck
//        for (Card card : deck) {
//            System.out.println(card);
//        }

        // Print random card
        int r = (int)Math.round(Math.random() * 51);
        System.out.println("\nRandom Card: " + deck[r]);
    }

}
