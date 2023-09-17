
public class PersonTest {

  /**
   * @param args the command line arguments
   */
  public static void main(String[] args) {

    // No arge constructor
    System.out.println("\nNo-arg Constructor person1");
    Person person1 = new Person();
    System.out.println("person1 " + person1);

    // Test setters and getting using person1
    System.out.println("\nTesting setters and getters on person1");
    person1.setAge(37);
    person1.setFirstName("Jeffrey");
    person1.setLastName("Smith");

    System.out.println("Age = " + person1.getAge());
    System.out.println("First Name = " + person1.getFirstName());
    System.out.println("Last Name = " + person1.getLastName());

    // All arg constructor
    System.out.println("\nAll-arg Constructor person2");
    Person person2 = new Person("Jacidna", "Smith", 34);
    System.out.println("person2 " + person2);
  }

}
