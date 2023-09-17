
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

    // test all-arg constructor
    Garment g1 = new Garment();
    System.out.println("Garment 1 = " + g1);
    //test setters
    g1.setName("jeans");
    g1.setSize(14);
    g1.setPrice(200);
    //test getters
    System.out.println("Name = " + g1.getName());
    System.out.println("Size = " + g1.getSize());
    System.out.println("Price = " + g1.getPrice());
    //test calcDiscount method 10% disc price should be $180
    System.out.printf("discount price g1 $%.2f", g1.calcDiscount(0.1));
    //test all-arg constructor
    Garment g2 = new Garment("shirt", 10, 100);
    System.out.println(g2);
    //test calcDiscount method 20% disc price should be $100
    System.out.printf("discount price g2 $%.2f", g2.calcDiscount(0.2));

  }
}
