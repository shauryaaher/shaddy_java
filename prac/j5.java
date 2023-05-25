package prac;

import java.util.Scanner;

/* Write a Java program to input a letter. If it is an uppercase letter, then encode it
 * by the next 5th letter, otherwise, encode it with the 3rd previous character in the
 * ASCII table.
 */

public class j5 {

  public static void main(String[] args) {
    try (Scanner sc = new Scanner(System.in)) {
      System.out.print("Enter a letter: ");
      char c = sc.next().charAt(0);
      if (Character.isUpperCase(c) == true) {
        int cI = (int) c;
        final char f = (char) cI;
        System.out.println(f);
      } else {
        int eI = (int) c;
        final char g = (char) eI;
        System.out.println(g);
      }
    }
  }
}
