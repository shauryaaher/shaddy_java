package arrays;

import java.util.Scanner;

/* Write a Java program to accept the marks in physics, chemistry, and math of 40
 * students in a single dimensional array. Find and display the number of students
 * scoring more than 80% in aggregate and those scoring less than 34% in aggregate.
 * (using 10 numbers here, but the logic is the same for 40...)
 */

public class s2 {

  public static void main(String[] args) {
    try (Scanner sc = new Scanner(System.in)) {
      int phy[] = new int[10];
      int chem[] = new int[10];
      int math[] = new int[10];
      for (int i = 0; i < 10; i++) {
        System.out.println("Enter your marks scored in Physics: ");
        phy[i] = sc.nextInt();
        System.out.println("Enter your marks scored in Chemistry: ");
        chem[i] = sc.nextInt();
        System.out.println("Enter your marks in Math: ");
        math[i] = sc.nextInt();
      }
      int s0 = 0;
      int s1 = 0;
      for (int j = 0; j < 10; j++) {
        if ((phy[j] + chem[j] + math[j]) / 3.0 >= 80) {
            s0++;
        }
        if ((phy[j] + chem[j] + math[j]) / 3.0 <= 34) {
            s1++;
        }
      }
      System.out.println("Number of students getting over 80 in aggregate = " + s0 + ".");
      System.out.print("Number of student getting below 34 in aggregate = " + s1 + ".");
    }
  }
}
