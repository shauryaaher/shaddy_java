package prac;

import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        byte num = sc.nextByte();
        sc.close();
        for (byte i = 2; i <= num / 2; i++) {
            if (num % i == 0) {
                System.out.print("This is a not prime number. \n");
                System.exit(0);
            }
        }
        System.out.println("This is a prime number.");
    }
}