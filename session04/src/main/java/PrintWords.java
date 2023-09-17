// File:      PrintWords.java
// Purpose:   Print the individual words in a String
// Listing:   Chapter 11, Listing 11.3

import java.util.StringTokenizer;

public class PrintWords {

  /**
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    int ntokens;
    String s1 = "There was movement at the station";
    String key = "999/1780X-3659  J02";
    StringTokenizer stok1, stok2;

    // Use the default constructor - Assumes white space as the delimiter
    stok1 = new StringTokenizer(s1);
    ntokens = stok1.countTokens();
    System.out.println("The number of tokens - " + ntokens);

    while (stok1.hasMoreTokens()) {
      System.out.println(stok1.nextToken());
    }

    // Specify a '-', '/' and a space as delimiters
    stok2 = new StringTokenizer(key, "-/ ");
    System.out.println('\n' + "The key is: ");
    while (stok2.hasMoreTokens()) {
      System.out.println(stok2.nextToken());
    }
  }
}
