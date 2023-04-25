import java.util.Scanner;

public class Char10 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter 10 characters. Press enter after entering a character.");
            int sum = 0;
            for (int i = 0; i < 10; i++) {
                char c = sc.next().charAt(0);
                sum = (int) c + sum;
            }
            System.out.println(sum);
        }
    }
}