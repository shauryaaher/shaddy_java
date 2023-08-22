package ICSESpecimen2024;

import java.util.Scanner;

public class Q4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[11];
        System.out.println("Enter 10 numbers: ");
        byte i = 0;
        for (i = 0; i < 10; i++) {
            arr[i] = sc.nextInt();
        }
        for (i = 0; i < 10; i++) {
            if (arr[i] > arr[i + 1] && i + 1 < 10) {
                int x = arr[i];
                arr[i] = arr[i + 1];
                arr[i + 1] = x;
            }
            System.out.print(arr[i] + " ");
        }
    }
}
