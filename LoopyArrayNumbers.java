import java.util.Scanner;

public class LoopyArrayNumbers {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int i;
            long z = 0;
            long arr[] = new long[20];
            for (i = 0; i < 20; i++) {
                System.out.println("Enter the number ");
                arr[i] = sc.nextLong();
            }
            for (i = 0; i < 20; i++) {
                if (arr[i] % 3 == 0 || arr[i] % 5 == 0) {
                    z += arr[i];
                }
            }
        }
        System.out.println("The sum of numbers is divisible by 3 or 5.");
    }
}