import java.util.Scanner;

public class PowerExpression {

  public static void main(String[] args) {
    try (Scanner sc = new Scanner(System.in)) {
      System.out.println("Enter 2 numbers.");
      double num1 = sc.nextDouble();
      double num2 = sc.nextDouble();
      double half1 = num1 / 2;
      double half2 = num2 / 2;
      long i = 2;
      long j = 2;
      boolean isPrime1 = true;
      boolean isPrime2 = true;
      while (i <= half1) {
        i++;
        if (num1 % i == 0) {
            isPrime1 = false;
            break;
        }
      }
      while (j <= half2) {
        j++;
        if (num2 % i == 0) {
            isPrime2 = false;
            break;
        }
      }
      if (isPrime1 == true && isPrime2 == true) {
        if (Math.abs(num1 - num2) == 2) {
            System.out.print("Twin primes.");
        } else {
            System.out.print("Not twin primes.");
        }
      }
    }
  }
}
