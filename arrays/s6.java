package arrays;

import java.util.Scanner;

// Write a program to enter 6 numbers. List the number of even numbers, odd numbers, and multiples of 4
// seperately.

public class s6 {

  public static void main(String[] args) {
    try (Scanner sc = new Scanner(System.in)) {
      int v2 = 0;
      int v4 = 0;
      int vNot2 = 0;
      System.out.println(
        "Enter 6 numbers. Press the enter key after entering a number."
      );
      int a[] = new int[6];
      for (int i = 0; i < 6; i++) {
        a[i] = sc.nextInt();
      }
      for (int j = 0; j < 6; j++) {
        if (a[j] % 2 == 0) {
          v2++;
        } else if (a[j] % 2 != 0) {
          vNot2++;
        } else if (a[j] % 4 == 0) {
          v4++;
        }
      }
      System.out.println("Even numbers: " + v2 + ".");
      System.out.println("Numbers divisible by 4: " + v4 + ".");
      System.out.print("Odd numbers: " + vNot2 + ".");
    }
  }
}
