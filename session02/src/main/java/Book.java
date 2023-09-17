
public class Book {

  // constants
  public static final String DEFAULT_ISBN = "Not Provided";
  public static final int DEFAULT_NUM_PAGES = -1;

  // instance variables
  private String isbn;
  private int numPages;

  // all arg constructor
  public Book(String isbn, int numPages) {
    this.isbn = isbn;
    this.numPages = numPages;
  }

  // no arg constuctor
  public Book() {
    this(DEFAULT_ISBN, DEFAULT_NUM_PAGES);
  }

  // setters
  public void setISBN(String isbn) {
    this.isbn = isbn;
  }

  public void setNumPages(int numPages) {
    this.numPages = numPages;
  }

  // getters
  public String getISBN() {
    return this.isbn;
  }

  public int getNumPages() {
    return this.numPages;
  }

  // toString method for debugging
  @Override
  public String toString() {
    return super.toString()
            + " ["
            + "\n\tISBN = " + this.isbn
            + "\n\tNumPages = " + this.numPages
            + "\n\t]";
  }
}
