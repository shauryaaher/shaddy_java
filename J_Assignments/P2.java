package J_Assignments;

import java.util.Scanner;

public class P2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a positive integer please.");
        int num = sc.nextInt();
        if (num < 0) {
            System.out.print("Positive numbers only, please.");
            System.exit(0);
        }
        sc.close();
        String s = Integer.toString(num);
        StringBuilder reverseBuilder = new StringBuilder(s).reverse();
        String reversed = reverseBuilder.toString();
        if (s.equals(reversed)) {
            System.out.println("This is a palindrome.");
        } else {
            System.out.println("This is not a palindrome.");
        }
    }
}
