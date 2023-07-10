package school;

import java.util.Scanner;

public class P13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        final int n[] = { 1982, 1987, 1993, 1996, 1999, 2003, 2006, 2007, 2009, 2010 };
        System.out.println("Enter the year to search: ");
        int year = sc.nextInt();
        final short midIndex = (0 + 9) / 2;
        if (year >= n[midIndex]) {
            for (byte i = 5; i < 10; i++) {
                if (n[i] == year) {
                    System.out.println("Year found.");
                    break;
                } else {
                    System.out.println("Year not found.");
                }
            }
        } else if (year <= n[midIndex]) {
            for (byte j = 0; j < 5; j++) {
                if (n[j] == year) {
                    System.out.println("Year found.");
                    break;
                } else {
                    System.out.println("Year not found.");
                }
            }
        }
    }
}
