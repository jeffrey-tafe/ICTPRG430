
public class Car {

  // Constants
  public static final String DEFAULT_MODEL = "NOT DEFINED";
  public static final String DEFAULT_MAKE = "NOT DEFINED";

  // Instance variables
  private String model;
  private String make;

  // All arg constructor
  public Car(String model, String make) {
    this.model = model;
    this.make = make;
  }

  // No-arg constructor
  public Car() {
    this(DEFAULT_MODEL, DEFAULT_MAKE);
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
    return super.toString()
            + " ["
            + "\n\tmodel = " + this.model
            + "\n\tmake = " + this.make
            + "\n\t]";
  }
}
