import java.util.Scanner;

public class IntSumProduct {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter 5 numbers.");
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            int d = sc.nextInt();
            int e = sc.nextInt();
            int sum = a + b + c + d + e;
            int product = a * b * c * d * e;
            String sSum = Integer.toString(sum);
            String sProduct = Integer.toString(product);
            String concat = new StringBuilder().append(sSum).append(sProduct).toString();
            System.out.println(Integer.parseInt(concat));
        }
    }
}
