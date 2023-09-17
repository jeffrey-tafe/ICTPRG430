
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
    unit1.setRentAmount(150.0);
    unit1.setMaintenanceCost(100.0);
    System.out.println("unitNumber = " + unit1.getUnitNumber());
    System.out.println("numberOfRooms = " + unit1.getNumberOfRooms());
    System.out.println("rentAmount = " + unit1.getRentAmount());
    System.out.println("maintenanceCost = " + unit1.getMaintenanceCost());

    // Test 4 arg constructor
    System.out.println("\nTesting 4 Arg Constructor unit2");
    Unit unit2 = new Unit("B202", 2, 1200.0, 80.0);
    System.out.println("Unit2 " + unit2);

    // Test all arg constructor
    System.out.println("\nTesting All Arg Constructor unit3");
    Unit unit3 = new Unit("B202", 5, 1200.0, 80.0, true);
    System.out.println("Unit3 " + unit3);

    Unit unit4 = new Unit("B202", 5, 299.0, 80.0, true);
    System.out.println("Unit4 " + unit4);

    Unit unit5 = new Unit("B202", 5, 1200.0, 80.0, true);
    System.out.println("Unit5 " + unit5);

    System.out.println("\nTesting calcUnitClassification");
    System.out.println(unit3.calcUnitClassification());
    System.out.println(unit2.calcUnitClassification());
    System.out.println(unit1.calcUnitClassification());
    System.out.println(unit4.calcUnitClassification());
    System.out.println(unit5.calcUnitClassification());
  }
}
