
public class Garment {

// constants
  public static final String DEFAULT_NAME = "DEFAULT_NAME";
  public static final int DEFAULT_SIZE = -1;

// instance variables
  private String name;
  private int size;

  // all arg constructor
  public Garment(String name, int size) {
    this.name = name;
    this.size = size;
  }

  // no arg constructor
  public Garment() {
    this.name = DEFAULT_NAME;
    this.size = DEFAULT_SIZE;
  }

  // Setters
  public void setName(String name) {
    this.name = name;
  }

  public void setSize(int size) {
    this.size = size;
  }

  // Getters
  public String getName() {
    return this.name;
  }

  public int getSize() {
    return this.size;
  }

  // toString method for debugging
  @Override
  public String toString() {
    return super.toString()
            + "["
            + "\n\tname=" + this.name
            + "\n\tsize=" + this.size
            + "\n\t]";
  }

}
