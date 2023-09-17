
public class GarmentTest {

  /**
   * @param args the command line arguments
   */
  public static void main(String[] args) {

    // Test no arg constructor
    System.out.println("Testing No Arg Constructor garment1");
    Garment garment1 = new Garment();
    System.out.println("garment1 " + garment1);

    // Test setters and getters
    System.out.println("\nTesting setters and getters");
    garment1.setName("T-shirt");
    garment1.setSize(42);
    System.out.println("Name: " + garment1.getName());
    System.out.println("Size: " + garment1.getSize());

    // Test all-arg constructor
    System.out.println("\nTesting All-Arg Constructor garment2");
    Garment garment2 = new Garment("Jeans", 32);
    System.out.println("garment2 " + garment2);
  }
}
