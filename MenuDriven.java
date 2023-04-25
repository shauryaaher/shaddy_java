import java.util.Scanner;

public class MenuDriven {

  public static void main(String[] args) {
    try (Scanner s = new Scanner(System.in)) {
        System.out.println("Enter 2 non-decimal numbers.");
        long n = s.nextLong();
        long p = s.nextLong();
        System.out.println(
          "Enter 1 to see all the even numbers between these 2 numbers or 2 to see all the odd ones"
        );
        System.out.println("The first number must be smaller than the second");
        byte c = s.nextByte();
        switch (c) {
          case 1:
            for (long i = n; i < p; i++) {
              if (i % 2 == 0) {
                System.out.print(i + " ");
              } else {
                continue;
              }
            }
            break;
          case 2:
            for (long j = n; j < p; j++) {
              if (j % 2 != 0) {
                System.out.print(j + " ");
              } else {
                continue;
              }
            }
            break;
          default:
            System.out.print("Enter a valid input number.");
        }
    }
  }
}
