package arrays2;

import java.util.Scanner;

public class P15N4 {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N[][] = new int[4][4];
    byte i, j = 0;
    for (i = 0; i < 4; i++) {
      for (j = 0; j < 4; j++) {
        N[i][j] = sc.nextInt();
      }
    }
    for (i = 0; i < 4; i++) {
      for (j = 0; j < 4; j++) {
        System.out.print(N[i][j] + " ");
      }
      System.out.print('\n');
    }
    System.out.print('\n');
    long sum = 0;
    long product = 0;
    for (i = 0; i < 4; i++) {
      for (j = 0; j < 4; j++) {
        if (N[i][j] % 2 == 0) {
          sum += N[i][j];
        } else {
          product *= N[i][j];
        }
      }
    }
    System.out.println("The sum of the even numbers is = " + sum + ".");
    System.out.print("The product of the odd numbers is = " + product + ".");
  }
}
