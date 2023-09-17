package com.mycompany.session05;

public class Car {

  // Constants
  public static final String DEFAULT_MODEL = "NOT DEFINED";
  public static final String DEFAULT_MAKE = "NOT DEFINED";

  // Instance variables
  private String model;
  private String make;

  // A car contains an engine
  private Engine engine;

  // All arg constructor with engine
  public Car(String make, String model, Engine engine) {
    this.model = model;
    this.make = make;
    this.engine = engine;
  }

  // Two arg constructor
  public Car(String model, String make) {
    this(make, model, new Engine());
  }

  // No-arg constructor
  public Car() {
    this(DEFAULT_MODEL, DEFAULT_MAKE, new Engine());
  }
  
  // Constructor for when engine details are known
  public Car(String make, String model, String engineDescription, double power) {
    this(make, model, new Engine(engineDescription, power));
  }

  // Setters
  public void setModel(String model) {
    this.model = model;
  }

  public void setMake(String make) {
    this.make = make;
  }

  // Getters
  public String getModel() {
    return this.model;
  }

  public String getMake() {
    return this.make;
  }

  // toString method for debugging
  @Override
  public String toString() {

    StringBuilder sb = new StringBuilder();
    sb.append(super.toString());
    sb.append("\n[");
    sb.append("\n\tmodel: ");
    sb.append(this.model);
    sb.append("\n\tmake: ");
    sb.append(this.make);
    sb.append("\n\tengine: ");
    sb.append(this.engine);
    sb.append("\n]");
    return sb.toString();

  }
}
