import java.util.Scanner;

public class HarshadNumber {

  public static void main(String[] args) {
    try (Scanner sc = new Scanner(System.in)) {
      System.out.println("Enter a 2-digit non-decimal number.");
      long num = sc.nextLong();
      if (num < 10 ^ num > 99) {
        System.out.print("Enter a 2-digit number.");
      } else {
        long sum = 0;
        long i = num;
        while (i > 0) {
          long mod = i % 10;
          i /= 10;
          sum += mod;
        }
        if (num % sum == 0) {
          System.out.print("This is a Harshad number.");
        } else {
          System.out.print("This is not a Harshad number");
        }
      }
    }
  }
}
