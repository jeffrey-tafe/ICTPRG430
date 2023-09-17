
public class Bicycle {

  // contants  
  public static final int DEFAULT_CADENCE = 0;
  public static final int DEFAULT_SPEED = 0;
  public static final int DEFAULT_GEAR = 1;

  // instance variables
  private int cadence;
  private int speed;
  private int gear;

  // all arg constructor
  public Bicycle(int cadence, int speed, int gear) {
    this.cadence = cadence;
    this.speed = speed;
    this.gear = gear;
  }

  // no arg constructor
  public Bicycle() {
    this(DEFAULT_CADENCE, DEFAULT_SPEED, DEFAULT_GEAR);
  }

  // setters
  public void setCadence(int cadence) {
    this.cadence = cadence;
  }

  public void setSpeed(int speed) {
    this.speed = speed;
  }

  public void setGear(int gear) {
    this.gear = gear;
  }

  // getters
  public int getCadence() {
    return this.cadence;
  }

  public int getSpeed() {
    return this.speed;
  }

  public int getGear() {
    return this.gear;
  }

  // toString override for debugging
  @Override
  public String toString() {
    return super.toString()
            + " ["
            + "\n\tcadence = " + this.cadence
            + "\n\tspeed = " + this.speed
            + "\n\tgear = " + this.gear
            + "\n\t]";
  }

  // methods
  public void applyBrake(int decrement) {
    this.speed -= decrement;
  }

  public void speedUp(int increment) {
    this.speed += increment;
  }
}
