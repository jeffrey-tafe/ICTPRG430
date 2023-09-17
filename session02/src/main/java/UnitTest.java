
public class UnitTest {

  public static void main(String[] args) {

    // Test no arg constructor
    System.out.println("Testing No Arg Constructor unit1");
    Unit unit1 = new Unit();
    System.out.println("unit1 " + unit1);

    // Test setters and getters
    System.out.println("\nTesting setters and getters");
    unit1.setUnitNumber("A101");
    unit1.setNumberOfRooms(3);
    unit1.setRentAmount(1500.0);
    unit1.setMaintenanceCost(100.0);
    System.out.println("unitNumber = " + unit1.getUnitNumber());
    System.out.println("numberOfRooms = " + unit1.getNumberOfRooms());
    System.out.println("rentAmount = " + unit1.getRentAmount());
    System.out.println("maintenanceCost = " + unit1.getMaintenanceCost());

    // Test all arg constructor
    System.out.println("\nTesting All Arg Constructor unit2");
    Unit unit2 = new Unit("B202", 2, 1200.0, 80.0);
    System.out.println("Unit2 " + unit2);
  }
}
