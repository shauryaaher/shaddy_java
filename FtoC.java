import java.util.Scanner;

public class FtoC {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int arr[] = new int[5];
            int i = 0;
            for (i = 0; i < 5; i++) {
                System.out.print("Enter a temperature value (unit will be Fahrenheit): ");
                arr[i] = sc.nextInt();
            }
            for (i = 0; i < 5; i++) {
                arr[i] = ((arr[i] - 32) / 9) * 5;
                System.out.println("Temperature in Celsius: " + arr[i]);
            }
        }
    }
}
