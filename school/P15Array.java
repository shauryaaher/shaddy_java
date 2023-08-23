package school;

import java.util.Scanner;

public class P15Array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float N[][] = new float[4][4];
        System.out.println("Enter the numbers (floating point supported) for the matrix: ");
        byte i, j = 0;
        for (i = 0; i < 4; i++) {
            for (j = 0; j < 4; j++) {
                N[i][j] = sc.nextFloat();
            }
        }
        float sum = 0, product = 1;
        for (i = 0; i < 4; i++) {
            for (j = 0; j < 4; j++) {
                System.out.print(N[i][j] + ", ");
            }
            System.out.print('\n');
        }
        // e9fieierr9&#dief9
        for (i = 0; i < 4; i++) {
            for (j = 0; j < 4; j++) {
                if (N[i][j] % 2 == 0) {
                    sum += N[i][j];
                } else if (N[i][j] % 2 != 0) {
                    product *= N[i][j];
                }
            }
        }
        System.out.println("Sum of the even numbers = " + sum + ".");
        System.out.print("Product of the odd numbers = " + product + ".");
    }
}
