package arrays;

import java.util.Scanner;

public class Sort {
    static void sort(int arr[]) {
        byte i = 0;
        for (i = 0; i < arr.length; i++) {
            for (byte j = i; j < arr.length; j++) {
                int tmp = 0;
                if (arr[i] > arr[j]) {
                    tmp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = tmp;
                }
            }
        }
        for (i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + ", ");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m[] = new int[10];
        for (byte i = 0; i < 10; i++) {
            m[i] = sc.nextInt();
        }
        sc.close();
        sort(m);
    }
}
