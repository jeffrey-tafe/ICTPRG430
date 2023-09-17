
public class BookTest {

  /**
   * @param args the command line arguments
   */
  public static void main(String[] args) {

    // Test no arg constructor
    System.out.println("Testing No Arg Constructior book1");
    Book book1 = new Book();
    System.out.println("book1 " + book1);

    // Test setters and getters
    System.out.println("\nTesting setters and getters");
    book1.setISBN("123456789");
    book1.setNumPages(256);
    System.out.println("isbn = " + book1.getISBN());
    System.out.println("numPages = " + book1.getNumPages());

    // Test all arg constructor
    System.out.println("\nTesting All Arg Constructor book2");
    Book book2 = new Book("987654321", 512);
    System.out.println("Book2 " + book2);
  }

}
