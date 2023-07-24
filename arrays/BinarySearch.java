package arrays;

import java.util.Scanner;

public class BinarySearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 4 numbers: ");
        int n[] = new int[5];
        byte i = 0;
        for (i = 0; i < 4; i++) {
            n[i] = sc.nextInt();
        }
        for (i = 0; i < 4; i++) {
            if (n[i] > n[i + 1]) {
                int c = n[i];
                n[i] = n[i + 1];
                n[i + 1] = c;
            }
        }
        System.out.println("Enter the number to search: ");
        int num = sc.nextInt();
        if (num < n[2]) {
            for (i = 0; i < 1; i++) {
                if (num == n[i]) {
                    System.out.println("The number is present.");
                }
            }
        }
        if (num >= n[2]) {
            for (i = 2; i < 4; i++) {
                if (num == n[i]) {
                    System.out.println("The number is present.");
                }
            }
        }
    }
}
