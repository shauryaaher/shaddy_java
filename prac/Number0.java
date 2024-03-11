package prac;

import java.util.Scanner;

public class Number0 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int ret = armstrong(sc.nextInt());
        sc.close();
        if (ret == 1) System.out.println("This is an Armstrong number.");
        else System.out.println("This is not an Armstrong number.");
    }
    private static int armstrong(int n) {
        int sum = 0;
        int num = n;
        while (n > 0) {
            sum += Math.pow(n % 10, 3);
            n /= 10;
        }
        if (sum == num) return 1;
        else return 0;
    }
}
