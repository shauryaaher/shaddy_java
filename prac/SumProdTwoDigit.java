package prac;

import java.util.Scanner;

public class SumProdTwoDigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int num = sc.nextInt();
        sc.close();
        int n = num;
        int sum = 0, prod = 1;
        while (n > 0) {
            sum += n % 10;
            prod *= n % 10;
            n /= 10;
        }
        if (sum + prod == num) System.out.println("This is a special two-digit number.");
        else System.out.print("This is not a special two-digit number.\n");
    }
}
