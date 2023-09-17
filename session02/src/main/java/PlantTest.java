
public class PlantTest {

  public static void main(String[] args) {

    // Test no arg constructor
    System.out.println("Testing No Arg Constructor plant1");
    Plant plant1 = new Plant();
    System.out.println("plant1 " + plant1);

    // Test setters and getters
    System.out.println("\nTesting setters and getters");
    plant1.setNumberInStock(20);
    plant1.setCostPrice(15.99);
    plant1.setCommonName("Rose");
    System.out.println("numberInStock = " + plant1.getNumberInStock());
    System.out.println("costPrice = " + plant1.getCostPrice());
    System.out.println("commonName = " + plant1.getCommonName());

    // Test all arg constructor
    System.out.println("\nTesting All Arg Constructor plant2");
    Plant plant2 = new Plant(10, 9.99, "Tulip");
    System.out.println("Plant2 " + plant2);
  }
}
