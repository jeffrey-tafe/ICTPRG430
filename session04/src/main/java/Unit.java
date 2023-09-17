
public class Unit {

  // Constants
  public static final String DEFAULT_UNIT_NUMBER = "XX";
  public static final int DEFAULT_NUMBER_OF_ROOMS = 0;
  public static final double DEFAULT_RENT_AMOUNT = 0.0;
  public static final double DEFAULT_MAINTENANCE_COST = 0.0;
  public static final boolean DEFAULT_RENTED = false;

  // Instance variables
  private String unitNumber;
  private int numberOfRooms;
  private double rentAmount;
  private double maintenanceCost;
  private boolean rented;

  // All arg constructor
  public Unit(String unitNumber, int numberOfRooms, double rentAmount, double maintenanceCost, boolean rented) {
    this.unitNumber = unitNumber;
    this.numberOfRooms = numberOfRooms;
    this.rentAmount = rentAmount;
    this.maintenanceCost = maintenanceCost;
    this.rented = rented;
  }

  // 4 arg constructor
  public Unit(String unitNumber, int numberOfRooms, double rentAmount, double maintenanceCost) {
    this(unitNumber, numberOfRooms, rentAmount, maintenanceCost, DEFAULT_RENTED);
  }

  // No arg constructor
  public Unit() {
    this(DEFAULT_UNIT_NUMBER, DEFAULT_NUMBER_OF_ROOMS, DEFAULT_RENT_AMOUNT, DEFAULT_MAINTENANCE_COST, DEFAULT_RENTED);
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

  public boolean isRented() {
    return rented;
  }

  public void setRented(boolean rented) {
    this.rented = rented;
  }

  // toString method for debugging
  @Override
  public String toString() {

    StringBuilder sb = new StringBuilder();
    sb.append(super.toString());
    sb.append("\n[");
    sb.append("\n\tunitNumber: ");
    sb.append(this.unitNumber);
    sb.append("\n\tnumberOfRooms: ");
    sb.append(this.numberOfRooms);
    sb.append("\n\trentAmount: ");
    sb.append(this.rentAmount);
    sb.append("\n\tmaintenanceCost: ");
    sb.append(this.maintenanceCost);
    sb.append("\n\tisRented: ");
    sb.append(this.rented);
    sb.append("\n]");

    return sb.toString();
  }

  /**
   * Determines the classification of the unit according to size (LARGE or
   * SMALL) and quality (HIGH or LOW) LARGE/HIGH - more than 5 rooms and a rent
   * of 300 or more LARGE/LOW - more than 5 rooms but a rent lower than 300
   * SMALL/HIGH - 3 rooms or less and a rent of 200 or more SMALL/LOW - 3 rooms
   * or less but a rent lower than 200 STANDARD - all other cases
   *
   * @return one of the classifications listed above
   */
  public String calcUnitClassification() {
    if (this.numberOfRooms >= 5 && this.rentAmount >= 300) {
      return "LARGE/HIGH";
    } else if (this.numberOfRooms >= 5 && this.rentAmount < 300) {
      return "LARGE/LOW";
    } else if (this.numberOfRooms <= 3 && this.rentAmount >= 200) {
      return "SMALL/HIGH";
    } else if (this.numberOfRooms <= 3 && this.rentAmount < 200) {
      return "SMALL/LOW";
    } else {
      return "STANDARD";
    }
  }
}
