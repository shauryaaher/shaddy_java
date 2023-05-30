package arrays;

import java.util.Scanner;

/* Write a Java program to store numbers in a 3-by-4 matrix. Find the sum off all the numbers of
 * the matrix and display the sum using an input statement.
 */

public class d0 {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int arr[][] = new int[3][4];
    int i, j, sum = 0;
    System.out.println("Enter the numbers for the matrix: ");
    for (i = 0; i < 3; i++) {
      for (j = 0; j < 4; j++) {
        arr[i][j] = sc.nextInt();
      }
    }
    System.out.println("The numbers in the matrix are: ");
    for (i = 0; i < 3; i++) {
      for (j = 0; j < 4; j++) {
        System.out.print(arr[i][j] + " ");
      }
      System.out.println();
    }
    for (i = 0; i < 3; i++) {
      for (j = 0; j < 4; j++) {
        sum += arr[i][j];
      }
    }
    System.out.println("The sum of the elements in the matrix is: " + sum + ".");
  }
}
