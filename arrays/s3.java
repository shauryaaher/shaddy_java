package arrays;

import java.util.Scanner;

/* Write a Java program to accept 10 different numbers */

public class s3 {

  public static void main(String[] args) {
    try (Scanner sc = new Scanner(System.in)) {
      System.out.println(
        "Enter 10 numbers. Press enter after entering a number."
      );
      int arr[] = new int[10];
      for (int i = 0; i < 10; i++) {
        int num = sc.nextInt();
        arr[i] = num;
      }
      System.out.println("Please enter the number you want to search: ");
      // int s = sc.nextInt();
      for (int j = 0; j < 10; j++) {
        // if (s == arr[j]) {
        //   System.out.print("This number exists in the array.");
        //   break;
        // } else {
        //   System.out.print("This number does not exist.");
        //   break;
        // }
      }
    }
  }
}
