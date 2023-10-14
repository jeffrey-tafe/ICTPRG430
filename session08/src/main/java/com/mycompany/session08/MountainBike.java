/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.session08;

/**
 *
 * @author jeffs
 */
public class MountainBike extends Bicycle {
  
  // Instance Variables
  private int seatHeight;
  
  public MountainBike(int startHeight,
                      int startCadence,
                      int startSpeed,
                      int startGear) {
    super(startCadence, startSpeed, startGear);
    this.seatHeight = startHeight;
  }
  
  public void setHeight(int newValue) {
    this.seatHeight = newValue;
  }
}
