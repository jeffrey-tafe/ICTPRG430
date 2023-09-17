
public class EngineTest {

  public static void main(String[] args) {

    // Test no arg constructor
    System.out.println("Testing No Arg Constructor engine1");
    Engine engine1 = new Engine();
    System.out.println("engine1 " + engine1);

    // Test setters and getters
    System.out.println("\nTesting setters and getters");
    engine1.setDescription("V6");
    engine1.setPower(250.0);
    System.out.println("description = " + engine1.getDescription());
    System.out.println("power = " + engine1.getPower());

    // Test all arg constructor
    System.out.println("\nTesting All Arg Constructor engine2");
    Engine engine2 = new Engine("V8", 350.0);
    System.out.println("engine2 " + engine2);
  }
}
