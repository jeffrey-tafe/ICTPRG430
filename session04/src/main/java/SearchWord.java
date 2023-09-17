/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author jeffs
 */
public class SearchWord {

  /**
   * @param args the command line arguments
   */
  public static void main(String[] args) {

    int pos;
    String s1;

    s1 = "in in the town in";

    // Searching a String
    pos = s1.indexOf("in");
    System.out.println("The 'in' is at position: " + pos);

    while (pos >= 0) {
      pos = s1.indexOf("in", pos);
      if (pos >= 0) {
        System.out.println("position of 'in' = " + pos);
        pos++;
      }
    }
  }

}
