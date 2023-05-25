package prac;

import java.util.Scanner;

/* Write a Java program to input 2 integer numbers. Join them together to form a single number.
    Example ~ n0 = 12
    n1 = 10
    Output: 1210.
 */

public class j4 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter 2 numbers: ");
            int a = sc.nextInt();
            int b = sc.nextInt();
            String aS = Integer.toString(a);
            String bS = Integer.toString(b);
            String concat = aS + bS;
            System.out.println("The 2 numbers joined: " + concat + ".");
        }
    }
}