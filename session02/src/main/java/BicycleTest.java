
public class BicycleTest {

  public static void main(String[] args) {

    // Test no arg constructor
    System.out.println("Testing No Arg Constructor bicycle1");
    Bicycle bicycle1 = new Bicycle();
    System.out.println("bicycle1 " + bicycle1);

    // Test setters and getters
    System.out.println("\nTesting setters and getters");
    bicycle1.setCadence(1);
    bicycle1.setSpeed(3);
    bicycle1.setGear(2);
    System.out.println("cadence = " + bicycle1.getCadence());
    System.out.println("speed = " + bicycle1.getSpeed());
    System.out.println("gear = " + bicycle1.getGear());

    // Test all arg constructor
    System.out.println("\nTesting All Arg Constructor bicycle2");
    Bicycle bicycle2 = new Bicycle(4, 5, 6);
    System.out.println("bicycle2 " + bicycle2);
    
    // Test brake method
    System.out.println("\nTesting brake method on bicycle2");
    System.out.println("\nbicycle2 speed before = " + bicycle2.getSpeed());
    bicycle2.applyBrake(2);
    System.out.println("\nbicycle2 speed after = " + bicycle2.getSpeed());
  }
}
