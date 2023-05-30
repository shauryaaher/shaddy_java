package arrays;

import java.util.Scanner;

/* Write a program to accept 20 different numbers in a single dimensional array.
 * Display the sum of the numbers which are divisible by either 3 or 5.
 * (For this example, using only 6 elements; however, the logic remains the same...)
 */

public class s0 {

  public static void main(String[] args) {
    try (Scanner sc = new Scanner(System.in)) {
      int sum = 0;
      int arr[] = new int[6];
      for (int i = 0; i < 6; i++) {
        System.out.println("Enter a number: ");

        arr[i] = sc.nextInt();
      }
      for (int j = 0; j < 6; j++) {
        if (arr[j] % 5 == 0 || arr[j] % 3 == 0) {
          sum += arr[j];
        }
      }
      System.out.println(
        "The sum of all numbers divisible by either 3 OR 5 = " + sum + "."
      );
    }
  }
}
