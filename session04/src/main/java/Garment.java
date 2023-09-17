
public class Garment {

// constants
  public static final String DEFAULT_NAME = "DEFAULT_NAME";
  public static final int DEFAULT_SIZE = -1;
  public static final double DEFAULT_PRICE = 0;

// instance variables
  private String name;
  private int size;
  private double price;

  // all arg constructor
  public Garment(String name, int size, double price) {
    this.name = name;
    this.size = size;
    this.price = price;
  }

  public Garment(String name, int size) {
    this(name, size, DEFAULT_PRICE);
  }

  // no arg constructor
  public Garment() {
    this(DEFAULT_NAME, DEFAULT_SIZE, DEFAULT_PRICE);
  }

  // Setters
  public void setName(String name) {
    this.name = name;
  }

  public void setSize(int size) {
    this.size = size;
  }

  public void setPrice(double price) {
    this.price = price;
  }

  // Getters
  public String getName() {
    return this.name;
  }

  public int getSize() {
    return this.size;
  }

  public double getPrice() {
    return price;
  }

  // toString method for debugging
  @Override
  public String toString() {

    StringBuilder sb = new StringBuilder();
    sb.append(super.toString());
    sb.append("\n[");
    sb.append("\n\tname: ");
    sb.append(this.name);
    sb.append("\n\tsize: ");
    sb.append(this.size);
    sb.append("\n\tprice: ");
    sb.append(this.price);
    sb.append("\n]");
    return sb.toString();
  }

  // Method to calculate price with discount applied
  public double calcDiscount(double rate) {
    double discountPrice = this.price;
    if (this.price > 100) {
      discountPrice = this.price * (1 - rate);
    }
    return discountPrice;
  }

}
