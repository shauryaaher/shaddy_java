import java.util.Scanner;

public class Prime {
    private static boolean isPrime(long n) {
        if (n <= 1) {
            return false;
        }
        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
  public static void main(String[] args) {
    try (Scanner sc = new Scanner(System.in)) {
      System.out.println(
        "Enter 2 non-decimal numbers. THe first one must be smaller than the second."
      );
      long n = sc.nextLong();
      long p = sc.nextLong();
      if (n == 1) {
        System.out.print("1 is prime and composite.");
      } else {
        for (long i = n; i < p; i++) {
          for (long j = i; j <= i / 2; j++) {
            if (isPrime(j)) {
              System.out.print(j + " ");
            } else {
              break;
            }
          }
        }
      }
    }
  }
}
