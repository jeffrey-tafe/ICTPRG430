/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author jeffs
 */
public class Dog {

  // constants
  public static final String DEFAULT_ID = "DEFAULT DOGID";
  public static final int DEFAULT_SIZE = 0;
  public static final String DEFAULT_BREED = "DEFAULT BREED";
  public static final String DEFAULT_NAME = "DEFAULT NAME";

  // instance variables
  private String id;
  private int size;
  private String breed;
  private String name;

  // all arg constructor
  public Dog(String id, int size, String breed, String name) {
    this.id = id;
    this.size = size;
    this.breed = breed;
    this.name = name;
  }

  // no arg constructor
  public Dog() {
    this(DEFAULT_ID, DEFAULT_SIZE, DEFAULT_BREED, DEFAULT_NAME);
  }

  // Getters
  public String getID() {
    return this.id;
  }

  public int getSize() {
    return this.size;
  }

  public String getBreed() {
    return this.breed;
  }

  public String getName() {
    return this.name;
  }

  // Setters
  public void setID(String id) {
    this.id = id;
  }

  public void setSize(int size) {
    this.size = size;
  }

  public void setBreed(String breed) {
    this.breed = breed;
  }

  public void setName(String name) {
    this.name = name;
  }

  // toString method userd for debugging
  @Override
  public String toString() {
    return super.toString()
            + "["
            + "\nID = " + this.id
            + "\nSize = " + this.size
            + "\nBreed = " + this.breed
            + "\nName = " + this.name
            + "]";
  }

  // Example method
  public String bark() {
    String sound;
    if (this.size > 60) {
      sound = "Wooof, Wooof";
    } else if (this.size > 14) {
      sound = "Ruff, Ruff";
    } else if (this.size > 0) {
      sound = "Yap, Yap";
    } else {
      sound = "No dog!";
    }
    return sound;
  }
  
  
}
