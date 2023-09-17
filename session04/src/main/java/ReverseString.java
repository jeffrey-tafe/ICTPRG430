/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author jeffs
 */
public class ReverseString {

  /**
   * @param args the command line arguments
   */
  public static void main(String[] args) {

    String word = "sentence";
    int len = word.length();
    char[] wordArray = word.toCharArray();
    char[] reversed = new char[len];

    for (int i = 0; i < len; i++) {
      reversed[i] = wordArray[len - 1 - i];

      System.out.println(reversed);
    }
  }
}
