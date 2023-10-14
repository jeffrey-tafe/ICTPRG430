package com.mycompany.session08;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author jeffs
 */
public class Bicycle {

  // instance variables
  public int cadence;
  public int gear;
  public int speed;

  // constructor
  public Bicycle(int startCadence, int startSpeed, int startGear) {
    this.gear = startGear;
    this.cadence = startCadence;
    this.speed = startSpeed;
  }

  // methods
  public int getCadence() {
    return cadence;
  }

  public void setCadence(int cadence) {
    this.cadence = cadence;
  }

  public int getGear() {
    return gear;
  }

  public void setGear(int gear) {
    this.gear = gear;
  }

  public int getSpeed() {
    return speed;
  }

  public void setSpeed(int speed) {
    this.speed = speed;
  }

  public void speedUp(int increment) {
    this.speed += increment;
  }

  public void applyBrake(int increment) {
    this.speed -= increment;
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append(super.toString());
    sb.append("\n[");
    sb.append("\n\tcadence: ");
    sb.append(this.cadence);
    sb.append("\n\tgear: ");
    sb.append(this.gear);
    sb.append("\n\tspeed: ");
    sb.append(this.speed);
    return sb.toString();
  }

}
