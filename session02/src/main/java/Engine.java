
public class Engine {

  // Constants
  public static final String DEFAULT_DESCRIPTION = "NONE PROVIDED";
  public static final double DEFAULT_POWER = -1.0;

  // Instance variables
  private String description;
  private double power;

  // All arg constructor
  public Engine(String description, double power) {
    this.description = description;
    this.power = power;
  }

  // No-arg constructor
  public Engine() {
    this(DEFAULT_DESCRIPTION, DEFAULT_POWER);
  }

  // Setters
  public void setDescription(String description) {
    this.description = description;
  }

  public void setPower(double power) {
    this.power = power;
  }

  // Getters
  public String getDescription() {
    return this.description;
  }

  public double getPower() {
    return this.power;
  }

  // toString method for debugging
  @Override
  public String toString() {
    return super.toString()
            + " ["
            + "\n\tdescription = " + this.description
            + "\n\tpower = " + this.power
            + "\n\t]";
  }

}
