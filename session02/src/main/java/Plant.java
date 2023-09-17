
public class Plant {
  // Constants

  public static final int DEFAULT_NUMBER_IN_STOCK = -1;
  public static final double DEFAULT_COST_PRICE = -1.0;
  public static final String DEFAULT_COMMON_NAME = "NO NAME PROVIDED";

  // Instance variables
  private int numberInStock;
  private double costPrice;
  private String commonName;

  // Constructor with parameters
  public Plant(int numberInStock, double costPrice, String commonName) {
    this.numberInStock = numberInStock;
    this.costPrice = costPrice;
    this.commonName = commonName;
  }

  // No-arg constructor
  public Plant() {
    this(DEFAULT_NUMBER_IN_STOCK, DEFAULT_COST_PRICE, DEFAULT_COMMON_NAME);
  }

  // Setters
  public void setNumberInStock(int numberInStock) {
    this.numberInStock = numberInStock;
  }

  public void setCostPrice(double costPrice) {
    this.costPrice = costPrice;
  }

  public void setCommonName(String commonName) {
    this.commonName = commonName;
  }

  // Getters
  public int getNumberInStock() {
    return this.numberInStock;
  }

  public double getCostPrice() {
    return this.costPrice;
  }

  public String getCommonName() {
    return this.commonName;
  }

  // toString method for debugging
  @Override
  public String toString() {
    return super.toString()
            + " ["
            + "\n\tnumberInStock = " + this.numberInStock
            + "\n\tcostPrice = " + this.costPrice
            + "\n\tcommonName = " + this.commonName
            + "\n\t]";
  }
}
