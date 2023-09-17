
public class Unit {

  // Constants
  public static final String DEFAULT_UNIT_NUMBER = "XX";
  public static final int DEFAULT_NUMBER_OF_ROOMS = 0;
  public static final double DEFAULT_RENT_AMOUNT = 0.0;
  public static final double DEFAULT_MAINTENANCE_COST = 0.0;

  // Instance variables
  private String unitNumber;
  private int numberOfRooms;
  private double rentAmount;
  private double maintenanceCost;

  // All arg constructor
  public Unit(String unitNumber, int numberOfRooms, double rentAmount, double maintenanceCost) {
    this.unitNumber = unitNumber;
    this.numberOfRooms = numberOfRooms;
    this.rentAmount = rentAmount;
    this.maintenanceCost = maintenanceCost;
  }

  // No arg constructor
  public Unit() {
    this(DEFAULT_UNIT_NUMBER, DEFAULT_NUMBER_OF_ROOMS, DEFAULT_RENT_AMOUNT, DEFAULT_MAINTENANCE_COST);
  }

  // Setters
  public void setUnitNumber(String unitNumber) {
    this.unitNumber = unitNumber;
  }

  public void setNumberOfRooms(int numberOfRooms) {
    this.numberOfRooms = numberOfRooms;
  }

  public void setRentAmount(double rentAmount) {
    this.rentAmount = rentAmount;
  }

  public void setMaintenanceCost(double maintenanceCost) {
    this.maintenanceCost = maintenanceCost;
  }

  // Getters
  public String getUnitNumber() {
    return this.unitNumber;
  }

  public int getNumberOfRooms() {
    return this.numberOfRooms;
  }

  public double getRentAmount() {
    return this.rentAmount;
  }

  public double getMaintenanceCost() {
    return this.maintenanceCost;
  }

  // toString method for debugging
  @Override
  public String toString() {
    return super.toString()
            + " ["
            + "\n\tunitNumber = " + this.unitNumber
            + "\n\tnumberOfRooms = " + this.numberOfRooms
            + "\n\trentAmount = " + this.rentAmount
            + "\n\tmaintenanceCost = " + this.maintenanceCost
            + "\n\t]";
  }
}
