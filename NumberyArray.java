import java.util.Scanner;

public class NumberyArray {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter 10 digits without any whitespaces.");
            String s = sc.next();
            char arr[] = s.toCharArray();
            int z = (int) arr[0] - (arr[0] - 1);
            System.out.println(z);
        }
    }
}
