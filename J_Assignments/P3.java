package J_Assignments;

import java.util.Scanner;

public class P3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a positive integer.");
        int num = sc.nextInt();
        if (num < 0) {
            System.out.println("Positive number only!");
            System.exit(0);
        }
        sc.close();
        String s = Integer.toString(num);
        StringBuilder builder = new StringBuilder(s).reverse();
        final String f = builder.toString();
        if (Integer.parseInt(s) % 2 == 0) {
            System.out.println("This is a ");
        }
    }
}

// To use later