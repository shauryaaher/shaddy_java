package arrays;

import java.util.Scanner;

// Write a program to enter 5 numbers and enable searching using the binary search technique.

public class s4 {

  public static void main(String[] args) {
    try (Scanner sc = new Scanner(System.in)) {
      System.out.println("Enter 5 numbers in ascending order: ");
      int num[] = new int[5];
      for (int i = 0; i < 5; i++) {
        num[i] = sc.nextInt();
      }
      System.out.println("Enter the number you want to search: ");
      int s = sc.nextInt();
    }
  }
}
