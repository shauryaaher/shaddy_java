import java.util.Scanner;

public class PrimePalindrome {
    private boolean isPrime;
    private boolean isPalindrome;
    PrimePalindrome(int num) {
        isPrime = true;
        isPalindrome = false;
        for (int i = 2; i < num / 2; i++) {
            if (num % i == 0) {
                isPrime = false;
                break;
            }
        }
        String s = Integer.toString(num);
        StringBuilder sb = new StringBuilder(s);
        sb.reverse();
        int val = Integer.parseInt(sb.toString());
        if (val == num) {
            isPalindrome = true;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();
        PrimePalindrome inst = new PrimePalindrome(n);
        if (inst.isPrime && inst.isPalindrome == true) {
            System.out.print("This is a prime palindrome number.");
        } else {
            System.out.print("This is not a prime palindrome number");
        }
    }
}
