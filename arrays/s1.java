package arrays;

import java.util.Scanner;

/* Write a program to accept 10 different numbers in a single dimensional array.
 * Display the smallest and greatest numbers of the array elements.
 */

public class s1 {

  public static void main(String[] args) {
    try (Scanner sc = new Scanner(System.in)) {
      int a[] = new int[10];
      for (int i = 0; i < 10; i++) {
        System.out.println("Enter a number: ");
        a[i] = sc.nextInt();
      }
      int j = 0;
      while (j < 10) {
        if (a[j] < a[0]) {
          a[0] = a[j];
        }
        if (a[j] > a[9]) {
          a[9] = a[j];
        }
        j++;
      }
      System.out.println("The smallest number = " + a[0] + ".");
      System.out.print("The greatest number = " + a[9] + ".");
    }
  }
}
