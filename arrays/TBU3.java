package arrays;

import java.util.Scanner;

public class TBU3 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            float arr[] = new float[10];
            System.out.println("Enter 10 numbers: ");
            byte i = 0;
            for (i = 0; i < 10; i++) {
                arr[i] = sc.nextInt();
            }
            for (i = 0; i < 10; i++) {
                System.out.print(arr[i] + " " + '\n');
            }
            System.out.print("Negative numbers: ");
            for (i = 0; i < 10; i++) {
                if (arr[i] < 0) {
                    float n = arr[i];
                    System.out.print(n + " ");
                }
            }
            System.out.print('\n');
            System.out.print("Positive numbers: ");
            for (i = 0; i < 10; i++) {
                if (arr[i] > 0) {
                    float m = arr[i];
                    System.out.print(m + " ");
                }
            }
        }
    }
}
