import java.util.Scanner;

public class LeadNumber {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int n = sc.nextInt();
            int num = n;
            int even = 0;
            int odd = 0;
            while (num > 0) {
                int d = num % 10;
                if (d % 2 == 0) {
                    even += d;
                } else {
                    odd +=d;
                }
                num /= 10;
            }
            if (even == odd) {
                System.out.println(n + " is a lead number.");
            }
        }
    }
}
