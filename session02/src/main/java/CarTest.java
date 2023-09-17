
public class CarTest {

  public static void main(String[] args) {

    // Test no arg constructor
    System.out.println("Testing No Arg Constructor car1");
    Car car1 = new Car();
    System.out.println("car1 " + car1);

    // Test setters and getters
    System.out.println("\nTesting setters and getters");
    car1.setModel("Sedan");
    car1.setMake("Toyota");
    System.out.println("model = " + car1.getModel());
    System.out.println("make = " + car1.getMake());

    // Test all arg constructor
    System.out.println("\nTesting All Arg Constructor car2");
    Car car2 = new Car("Coupe", "BMW");
    System.out.println("car2 " + car2);
  }
}
