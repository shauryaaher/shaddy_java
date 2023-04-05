import java.util.Scanner;

public class EvenOddArr {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int arr[] = new int[5];
            int evenSum = 0;
            int oddSum = 0;
            int i = 0;
            for (i = 0; i < 5; i++) {
                System.out.println("Enter a number");
                arr[i] = sc.nextInt();
                
            }
            for (i = 0; i < 5; i++) {
                if (arr[i] % 2 == 0) {
                    evenSum += arr[i];
                } else {
                    oddSum += arr[i];
                }
            }
            System.out.println("Even numbers' sum: " + evenSum);
            System.out.println("Odd numbers' sum: " + oddSum);
        }
    }
}
