package J_Assignments;

import java.util.Scanner;

public class P4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter an integer. Please don't enter 0 as the first digit.");
        long num = sc.nextLong();
        sc.close();
        String s = Long.toString(num);
        char arr[] = s.toCharArray();
        boolean isDuck = false;
        if (arr[0] == '0') {
            System.out.println("Please don't enter 0 as the first digit.");
            System.exit(0);
        } else {
            for (byte i = 1; i < arr.length; i++) {
                if (arr[i] == 0) {
                    isDuck = true;
                    break;
                }
            }

            if (isDuck == false) {
                System.out.println("This is not a duck number.");
            } else {
                System.out.println("This is a duck number.");
            }
        }
    }
}
