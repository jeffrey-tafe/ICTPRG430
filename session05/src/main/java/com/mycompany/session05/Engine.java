/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.session05;

/**
 *
 * @author jeffs
 */
public class Engine {

  // Constants
  public static final String DEFAULT_ENGINE_DESCRIPTION = "NOT DEFINED";
  public static final double DEFAULT_POWER = 0;

  // Instance variables
  private String engineDescription;
  private double power;

  // All args constructor
  public Engine(String engineDescription, double power) {
    this.engineDescription = engineDescription;
    this.power = power;
  }
  
  // No arg constructor
  public Engine() {
    this(DEFAULT_ENGINE_DESCRIPTION, DEFAULT_POWER);
  }

  public String getEngineDescription() {
    return engineDescription;
  }

  public void setEngineDescription(String engineDescription) {
    this.engineDescription = engineDescription;
  }

  public double getPower() {
    return power;
  }

  public void setPower(double power) {
    this.power = power;
  }
  
  // toString method for debugging
  @Override
  public String toString() {

    StringBuilder sb = new StringBuilder();
    sb.append(super.toString());
    sb.append("\n[");
    sb.append("\n\tengineDescription: ");
    sb.append(this.engineDescription);
    sb.append("\n\tpower: ");
    sb.append(this.power);
    sb.append("\n]");
    return sb.toString();

  }
}
